package negocio;

import java.sql.Connection;

/**
 *
 * @author cooper15
 */
public class NegocioConexion {
    
    public Connection conexion(){
        datos.Conexion conexion = new datos.Conexion();
        return conexion.conectar();
    }
}
