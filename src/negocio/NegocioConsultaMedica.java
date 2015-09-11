 // @author QUINCHO

package negocio;

import entidad.ConsultaMedica;
import datos.OperacionesConsultaMedica;
import java.sql.SQLException;

public class NegocioConsultaMedica 
{
    public void insertarConsultaMedica(ConsultaMedica nuevaConsultaMedica)
    {
        try
        {
            OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
            operacionesConsultaMedica.insertarConsultaMedica(nuevaConsultaMedica);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
    
    }// fin del metodo insertarConsultaMedica
    
}// fin de la clase NegocioConsultaMedica
