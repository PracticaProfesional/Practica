package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Telefono;

/**
 * Esta clase realiza las operaciones correspondientes a telefono en la base de datos
 * @author cooper15
 */
public class OperacionesTelefono {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Este método inserta un registro en la table Telefono de la base de datos
     * @param nuevoTelefono de tipo Telefono que representan los datos de teléfono a insertar en la base de datos
     */
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
