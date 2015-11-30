
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
        catch(NullPointerException npe){
            System.err.println(npe.getMessage());
        }
       
        return null;
    }// fin del metodo insertarPaciente
    
    public LinkedList<entidad.Usuario> listaUsuarios(){
        entidad.Usuario nUsuario;
        LinkedList<entidad.Usuario> listUsuario = new LinkedList<>();
        objetoDeConexion = new Conexion();
        ResultSet rs;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call ObtenerIdUsuario()");
            while(rs.next()){
                nUsuario  = new entidad.Usuario();
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
            System.err.println(sqle.getErrorCode()+ sqle.getMessage());
        }
    }
    
    public void actualizarDatosUsuario(Usuario eUsuario){
        objetoDeConexion = new Conexion();
        String datos = "'"+eUsuario.getId()+"'" 
                     + "," +"'"+eUsuario.getNombreUsuario()+"'"
                     + "," +"'"+eUsuario.getContrasena()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ActualizarUsuario("+datos+")");
        }
        catch(SQLException sqle){
            System.out.println(sqle.getErrorCode()+sqle.getMessage());
        }
    }
    
}
