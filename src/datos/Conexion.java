// Con esta clase logramremos la conexion a la base de datos en MySQL

package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private Connection conexion;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sigos", "root", "");
            return conexion;
        }// fin de try
        catch (SQLException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
            return null;
        }// fin de catch
    }// fin del metodo conectar
    
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
