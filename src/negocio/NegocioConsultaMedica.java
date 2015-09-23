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
    
}// fin de la clase NegocioConsultaMedica
