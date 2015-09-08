
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

    public Statement getEstado() {
        return estado;
    }
    
    public String obtenerUltimoId(String nombreTabla) throws SQLException{
        String id = "";
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        ResultSet rs = estado.executeQuery("Select MAX(id) as id FROM telefono");
        if(rs.next()){
            id = rs.getString("id"); 
           
        }
        
        
        return id;
    }
}