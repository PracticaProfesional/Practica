
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
    
    public String obtenerUltimoId(String nombreTabla) {
        String id = "";
        objetoDeConexion = new Conexion();
        
        try{
            estado = objetoDeConexion.conectar().createStatement();
            ResultSet rs = estado.executeQuery("Select MAX(id) as id FROM "+nombreTabla);
            if(rs.next()){
                id = rs.getString("id"); 

            }
        
        }
        catch(java.sql.SQLException sqle){
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }
        
        return id;
    }
}