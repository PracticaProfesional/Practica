
package negocio;
import entidad.Paciente;
import datos.OperacionesPaciente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase relaciona la clase OperacionesPaciente con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioPaciente {

    /**
     * Este método llama al método en la capa de datos  que inserta un paciente en la base de datos
     * @param nuevoPaciente de tipo Paciente que representa los datos a insertar de paciente
     */
    public void insetarPaciente(Paciente nuevoPaciente){ // este objeto ya viene lleno de la capa presentación.
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       operacionesPaciente.insertarPaciente(nuevoPaciente); 
   }

    /**
     * Este método llama al método en la capa de datos que obtiene un registro 
     * de paciente por medio de una fecha.
     * @param date de tipo String que representa la fecha
     * @return un objeto ResultSet que retorna los registros obetnido por el método llamado
     */
    public java.sql.ResultSet obtenerPacientesConsulta(String date){
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       return operacionesPaciente.obtenerPacientesConsulta(date);
   }

    /**
     * Este método llama al método en la capa de datos  que obtiene el id(identificador)
     * un registro de paciente en la base de datos 
     * @param cedula de tipo String que representa el identificador del paciente que se desea obtener
     * @return un String que represeta el id(identificador) del registro de paciente retornado por el método llamado
     */
    public String obtenerIdPaciente(String cedula){
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       return operacionesPaciente.obtenerIdPaciente(cedula);
   }
    
    public ResultSet obtenerDatosPaciente(String cedulaPaciente) throws SQLException
    {
        OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
        return operacionesPaciente.obtenerDatosPaciente(cedulaPaciente);
    }// fin del metodo obtenerDatosPaciente
}
