 // @author QUINCHO

package negocio;

import entidad.ExamenFisico;
import datos.OperacionesExamenFisico;
import java.sql.ResultSet;

public class NegocioExamenFisico 
{
    public void insertarExamenFisico(ExamenFisico nuevoExamenFisico)
    {
        OperacionesExamenFisico operacionesExamenFisico = new OperacionesExamenFisico();
        operacionesExamenFisico.insertarExamenFisico(nuevoExamenFisico);
        
    }// fin del metodo insertarExamenFisico
    public ResultSet obtenerExamenFisico(String id){
        datos.OperacionesExamenFisico nuevoExamen = new datos.OperacionesExamenFisico();
        return nuevoExamen.obtenerExamenFisico(id);
    }
}// fin de la clase NegocioExamenFisico
