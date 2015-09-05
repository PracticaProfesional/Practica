
package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class ObtenerUltimoId {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public String obtenerUltimoId(String nombreTabla) throws SQLException{
        estado = objetoDeConexion.conectar().createStatement();
        ResultSet rs = estado.executeQuery("Call obtenerUltimoId("+nombreTabla+")");
        String id = rs.getString("id");
        
        return id;
    }
}