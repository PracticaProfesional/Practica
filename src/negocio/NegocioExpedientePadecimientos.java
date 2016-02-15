
package negocio;

import datos.OperacionesExpedientePadecimientos;
import entidad.ExpedientePadecimientos;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author QUINCHO
 */
public class NegocioExpedientePadecimientos 
{
    public void insertarExpedientePadecimientos(ExpedientePadecimientos objExpedientePadecimientos)
    {
        OperacionesExpedientePadecimientos objOperExpPade = new OperacionesExpedientePadecimientos();
        objOperExpPade.insertarExpedientePadecimientos(objExpedientePadecimientos);
    }// fin del metodo insertarExpedientePadecimientos
    
    public ResultSet listarPadecimientosPersonales(String idExpedientePaciente) throws SQLException
    {
        OperacionesExpedientePadecimientos objOperExpPade = 
                new OperacionesExpedientePadecimientos();
        return objOperExpPade.listarPadecimientosPersonales(idExpedientePaciente);
    }// fin del metodo listarPadecimientosFamiliares
    
    public void eliminarPadecimientoPersonal(String id)
    {
        OperacionesExpedientePadecimientos objOperExpPade = 
                new OperacionesExpedientePadecimientos();
        objOperExpPade.eliminarPadecimientoPersonal(id);
    }// fin del metodo eliminarPadecimientoPersonal
    
}// fin de la clase NegocioExpedientePadecimientos
