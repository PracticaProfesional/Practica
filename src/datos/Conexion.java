package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase es la encargada de crear y retornar 
 * el objeto de conexión con la BD.
 * @author cooper15
 */
public class Conexion {
    
    private Connection conexion;
    
    /**
     * Esta clase se encarga de crear una conexión con la base de datos,
     * posteriormente se obtiene como retorno dicho vínculo de conexión.
     * @return coneccion
     */
    public Connection conectar()
    {
        negocio.LeerEscribirDatosConexion datos;
        datos = new negocio.LeerEscribirDatosConexion(); 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://"+datos.recuperarDatos().get("ip")+"/sigos", datos.recuperarDatos().get("user"), datos.recuperarDatos().get("pass"));
            return conexion;
        }// fin de try
        catch (SQLException | ClassNotFoundException exception)
        {
            System.err.println(exception.getMessage());
            return null;
        }// fin de catch

        
    }// fin del metodo conectar
    
    /**
     * Método para realizar la desconexión con la base de datos.
     * Su finalizad es evitar que los recursos se desperdicien.
     */
    public void desconectar()
    {
        try 
        {    
            conexion.close();
        }// fin del try
        catch (SQLException ex) 
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }// fin de catch
    }// fin del metodo
    
}// fin de la clase Conexion
