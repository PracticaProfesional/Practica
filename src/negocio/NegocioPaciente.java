
package negocio;
import entidad.Paciente;
import datos.OperacionesPaciente;
/**
 *
 * @author cooper15
 */
public class NegocioPaciente {
   Paciente paciente = new Paciente();
   public void insetarPaciente(Paciente nuevoPaciente){ // este objeto ya viene lleno de la capa presentación.
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       operacionesPaciente.insertarPaciente(paciente); 
   }
}
