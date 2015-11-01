 // @author QUINCHO

package negocio;

import entidad.ConsultaMedica;
import datos.OperacionesConsultaMedica;

public class NegocioConsultaMedica 
{
    public void insertarConsultaMedica(ConsultaMedica nuevaConsultaMedica)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarConsultaMedica(nuevaConsultaMedica);
    }// fin del metodo insertarConsultaMedica
    public void actualizarConsultaMedica(String idExpediente, entidad.ConsultaMedica actConsulta, String fecha){
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.actualizarConsultaMedica(idExpediente, actConsulta, fecha);
    }
    
    public void insertarRecetaEnConsulta(String idExpediente, String fecha, String idReceta)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarRecetaEnConsulta(idExpediente, fecha, idReceta);
    }// fin del metodo insertarRecetaEnConsulta
    
    public void insertarRecetaFisica(String nombreMedicamento, String cantidad)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarRecetaFisica(nombreMedicamento, cantidad);
    }// fin del metodo insertarRecetaFisica
    
}// fin de la clase NegocioConsultaMedica
