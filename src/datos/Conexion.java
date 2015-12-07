package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase establece la conexion a la base de datos MySQL
 * @author QUINCHO
 * @version 1.0, 05/12/2015 
 */
public class Conexion {
    
    private Connection conexion;
    
    /**
     * Contiene todas las instrucciones para lograr establecer la conexión
     * @return objeto Connection
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
     * Cierra la conxion con la base de datos
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
