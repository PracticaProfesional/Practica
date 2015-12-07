package negocio;

import java.sql.Connection;

/**
 * Esta clase relaciona la clase Conexión con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioConexion {
    
    /**
     * Este método llama al método en la capa de datos que establece la conexión con la base de datos
     * @return un objeto Connection que contiene la conexión
     */
    public Connection conexion(){
        datos.Conexion conexion = new datos.Conexion();
        return conexion.conectar();
    }
}
