
package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Usuario;
import java.sql.ResultSet;
import java.util.LinkedList;

public class OperacionesUsuario {
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public entidad.Usuario ObtenerIdUsuario(Usuario usuario) throws SQLException
    { 
        objetoDeConexion = new Conexion();
        String datosUsuario = "'"+usuario.getNombreUsuario()+"'"+","+"'"+usuario.getContrasena()+"'";
        ResultSet result = null;
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            result = estado.executeQuery("Call ObtenerIdUsuario()");
            negocio.Cifrado decrypt = new negocio.Cifrado();
            while(result.next()){
                if(usuario.getNombreUsuario().equals(result.getString("nombreUsuario")) 
                && decrypt.coincidePassword(usuario.getContrasena(), result.getString("contrasena"))){
                    usuario.setNombreUsuario(result.getString("nombreUsuario"));
                    usuario.setContrasena(result.getString("contrasena"));
                    usuario.setTipoUsuario(Integer.parseInt(result.getString("tipo")));
                    return usuario;
                }
            }
         
        }// fin de try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
       
        return null;
    }// fin del metodo insertarPaciente
    
    public LinkedList listaUsuarios(){
        entidad.Usuario nUsuario = new entidad.Usuario();
        LinkedList<entidad.Usuario> listUsuario = new LinkedList<>();
        objetoDeConexion = new Conexion();
        ResultSet rs;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call ObtenerIdUsuario()");
            while(rs.next()){
                nUsuario.setNombreUsuario(rs.getString("nombreUsuario"));
                nUsuario.setContrasena(rs.getString("contrasena"));
                nUsuario.setTipoUsuario(Integer.parseInt(rs.getString("tipo")));
                nUsuario.setId(rs.getString("id"));
                listUsuario.add(nUsuario);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }  
       return listUsuario; 
    }
    
    public void insertarUsuario(Usuario nUsuario){
        objetoDeConexion = new Conexion();
        String datosUsuario = "'"+nUsuario.getNombreUsuario()+"'"
                              +","+"'"+nUsuario.getContrasena()+"'"
                              +","+"'"+nUsuario.getTipoUsuario()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarUsuario("+datosUsuario+")");
        }
        catch(SQLException sqle){
        
        }
    }
    
}
