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
        try
        {
            OperacionesCita operacionesCita = new OperacionesCita();
            operacionesCita.insertarCita(nuevaCita);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
        
    }// fin del metodo insertarCita
    
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        OperacionesCita operacionesCita = new OperacionesCita();
        return operacionesCita.obtenerFechaConsulta(fecha);
    }
}// fin de la clase NegocioCita
