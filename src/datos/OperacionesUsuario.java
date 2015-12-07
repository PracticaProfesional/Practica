
package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Usuario;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 * Esta clase realiza las operaciones correspondientes a usuario en la base de datos
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesUsuario {
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Este método obtine el id(identificador) de un registro de la tabla Usuario en la base de datos
     * @param usuario de tipo Usuario que representa los datos del usuriao
     * @return un objeto Usuario que representa los datos de un registro de usuario retornado por la consulta
     * @throws SQLException
     */
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
    
    /**
     * Este método crea una lista enlazada de con los registros de usuarios retornados por la consulta
     * @return un objeto LinkedList que representa un lista de usuarios
     */
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
    
    /**
     * Inserta un registro en la tabla Usuario en la base de datos
     * @param nUsuario de tipo Usuario que representa los datos de un usuario a insertar en la base de datos
     */
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
    
    /**
     * Actuliza un registro de usuario en la base de datos
     * @param eUsuario de tipo Usuario que contiene los datos actualizados del registro
     */
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
