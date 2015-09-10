// @author QUINCHO

package negocio;

import entidad.Cita;
import datos.OperacionesCita;
import java.sql.SQLException;

public class NegocioCita
{
    public void insertarCita(Cita nuevaCita)
    {
        try
        {
            OperacionesCita operacionesCita = new OperacionesCita();
            operacionesCita.insertarCita(nuevaCita);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
        
    }// fin del metodo insertarCita
    
}// fin de la clase NegocioCita
