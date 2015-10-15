
package negocio;
import entidad.Paciente;
import datos.OperacionesPaciente;
/**
 *
 * @author cooper15
 */
public class NegocioPaciente {
   public void insetarPaciente(Paciente nuevoPaciente){ // este objeto ya viene lleno de la capa presentación.
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       operacionesPaciente.insertarPaciente(nuevoPaciente); 
   }
   public java.sql.ResultSet obtenerPacientesConsulta(String date){
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       return operacionesPaciente.obtenerPacientesConsulta(date);
   }
   public String obtenerIdPaciente(String cedula){
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       return operacionesPaciente.obtenerIdPaciente(cedula);
   }
}
