package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Telefono;

/**
 *
 * @author cooper15
 */
public class OperacionesTelefono {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarTelefono(Telefono nuevoTelefono){
        objetoDeConexion = new Conexion();
        String datosTelefono = "'"+nuevoTelefono.getTelefono()+"'"+","+"'"+nuevoTelefono.getDetalle()+"'";
        
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarTelefono("+datosTelefono+")");
            estado.close();
        }
        catch(SQLException e){
        }
    }
}
