// @author QUINCHO

package negocio;

import entidad.Cita;
import datos.OperacionesCita;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NegocioCita
{
    public void insertarCita(Cita nuevaCita)
    {
        // fin de catch
        
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.insertarCita(nuevaCita);
        
    }// fin del metodo insertarCita
    
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        OperacionesCita operacionesCita = new OperacionesCita();
        return operacionesCita.obtenerFechaConsulta(fecha);
    }
    
    public void actualizarCita(Cita actCita){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.actualizarCita(actCita);
    }
    
    public void eliminarCita(Cita eliCita){
        OperacionesCita operacionesCita = new OperacionesCita();
        operacionesCita.eliminarCita(eliCita);
    }
    
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
