// @author QUINCHO
 
package datos;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesInventario 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public ResultSet listarInventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT * FROM ListarInventario");
        return rs;
    }// fin del metodo listarInventario
    
    
    
}// fin de la clase OperacionesInventario
