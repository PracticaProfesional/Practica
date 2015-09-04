
package datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
        ResultSet rs = estado.executeQuery("Call ("+nombreTabla+")");
        String id = rs.getString("id");
        
        return id;
    }
}