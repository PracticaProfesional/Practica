
package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Usuario;
import java.sql.ResultSet;

public class OperacionesUsuario {
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public entidad.Usuario ObtenerIdUsuario(Usuario Usuario) throws SQLException
    { 
        objetoDeConexion = new Conexion();
        String datosUsuario = "'"+Usuario.getNombreUsuario()+"'"+","+"'"+Usuario.getContrasena()+"'";
        ResultSet result = null;
        try
        {
           estado = objetoDeConexion.conectar().createStatement();
           result = estado.executeQuery("Call ObtenerIdUsuario("+datosUsuario+")"); 
            if(result.next()){
            entidad.Usuario usu = new Usuario();
            usu.setNombreUsuario(result.getString("nombreUsuario"));
            usu.setContrasena(result.getString("contrasena"));
            return usu;
         }
        }// fin de try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
       
        return null;
    }// fin del metodo insertarPaciente
    
}
