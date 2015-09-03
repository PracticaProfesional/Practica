package datos;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesTelefono {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarTelefono(String numero, String detalle){
        String datosTelefono = "'"+numero+"'"+","+"'"+detalle+"'";
        
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ("+datosTelefono+")");
        }
        catch(SQLException e){
        }
    }
}
