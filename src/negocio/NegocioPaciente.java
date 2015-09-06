
package negocio;
import entidad.Paciente;
import datos.OperacionesPaciente;
/**
 *
 * @author cooper15
 */
public class NegocioPaciente {
   Paciente paciente = new Paciente();
   public void insetarPaciente(String nombrePaciente, String apellido1, String apellido2,
                               String identificacion, String telefono, String email,
                               String fechaNacimiento, String nacionalidad, String direccion1,
                               String direccion2, String Sexo){
       paciente.setNombrePaciente(nombrePaciente);
       paciente.setApellido1(apellido1);
       paciente.setApellido2(apellido2);
       paciente.setIdentificacion(identificacion);
       paciente.setTelefono(telefono);
       paciente.setEmail(email);
       paciente.setFechaNacimiento(fechaNacimiento);
       paciente.setNacionalidad(nacionalidad);
       paciente.setDireccion1(direccion1);
       paciente.setDireccion2(direccion2);
       paciente.setSexo(Sexo);
       
       OperacionesPaciente operacionesPaciente = new OperacionesPaciente();
       operacionesPaciente.insertarPaciente(paciente);
   }
}
