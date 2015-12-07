package negocio;

import entidad.Cita;
import datos.OperacionesCita;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase relaciona la clase OperacionesCita con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioCita
{

    /**
     * Este método llama al método que inserta una cita 
     * @param nuevaCita de tipi Cita que reprsenta los datos a insertar
     */
    public void insertarCita(Cita nuevaCita)
    {
        // fin de catch
        
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.insertarCita(nuevaCita);
        
    }// fin del metodo insertarCita
    
    /**
     * Este método llama al método que obtiene la fecha de la cita
     * @param fecha de tipo String que representa la fecha
     * @return un objeto ResultSet que representa los registros retornados por el método llamado
     * @throws SQLException
     */
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        OperacionesCita operacionesCita = new OperacionesCita();
        return operacionesCita.obtenerFechaConsulta(fecha);
    }
    
    /**
     * Este método llama al método que actualiza una cita
     * @param actCita de tipo Cita que representa los datos a actualizar
     */
    public void actualizarCita(Cita actCita){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.actualizarCita(actCita);
    }
    
    /**
     * Este método llama al método que elimina una cita
     * @param eliCita de tipo Cita que representa los datos a eliminar
     */
    public void eliminarCita(Cita eliCita){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.eliminarCita(eliCita);
    }
    
    /**
     * Este método llama la método que inserta una relación de cita con paciente en la base de datos
     * @param idCita de tipo String que representa el id(identificador) del registro de cita
     * @param idPaciente de tipo String que representa el id(identificador) del registro de paciente
     */
    public void insertarCitaPaciente(String idCita, String idPaciente){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.insertarCitaPaciente(idCita, idPaciente);
    }
    
    public String idCitaPaciente(String fecha, String hora){
        OperacionesCita operacionesCita = new OperacionesCita();
        return operacionesCita.idCitaPaciente(fecha, hora);
    }
    
    public void eliminarCitaPaciente(String id){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.eliminaCitaPaciente(id);
    }
}// fin de la clase NegocioCita
