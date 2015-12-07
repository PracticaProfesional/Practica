package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase es utilizada para obtener los identificadores de los registros que por última vez en la base de datos
 * @author cooper15
 */
public class ObtenerUltimoId {
    private Conexion objetoDeConexion;
    private Statement estado;

    /**
     * Obtiene la varible estado, que representa una sentencia
     * @return un objeto Statement, que representa una sentencia
     */
    public Statement getEstado() {
        return estado;
    }
    
    /**
     * Obtiene el último registro insertado en un tabla en la base de datos
     * @param nombreTabla de tipo String que representa el nombre de la tabla
     * @return entero que representa el identificador obtenido de la consulta hecha a la base de datos
     */
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