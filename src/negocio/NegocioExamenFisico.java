 // @author QUINCHO

package negocio;

import entidad.ExamenFisico;
import datos.OperacionesExamenFisico;
import java.sql.SQLException;

public class NegocioExamenFisico 
{
    public void insertarExamenFisico(ExamenFisico nuevoExamenFisico)
    {
        try
        {
            OperacionesExamenFisico operacionesExamenFisico = new OperacionesExamenFisico();
            operacionesExamenFisico.insertarExamenFisico(nuevoExamenFisico);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
        
    }// fin del metodo insertarExamenFisico
    
}// fin de la clase NegocioExamenFisico
