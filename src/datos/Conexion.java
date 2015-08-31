// Con esta clase logramremos la conexion a la base de datos en MySQL

package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection conexion;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
            return conexion;
        }// fin de try
        catch (SQLException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
            return null;
        }// fin de catch
    }// fin del metodo conectar
    
}// fin de la clase Conexion
