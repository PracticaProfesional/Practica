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
}// fin de la clase NegocioConsultaMedica
