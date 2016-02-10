package negocio;

import datos.OperacionesExpedientePadecimientosFamiliares;
import entidad.ExpedientePadecimientosFamiliares;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author QUINCHO
 */

public class NegocioExpedientePadecimientosFamiliares 
{
    public void insertarExpedientePadecimientosFamiliares(ExpedientePadecimientosFamiliares objExpPadFam)
    {
        OperacionesExpedientePadecimientosFamiliares objOperExpPade = 
                new OperacionesExpedientePadecimientosFamiliares();
        objOperExpPade.insertarExpedientePadecimientosFamiliares(objExpPadFam);
    }// fin del metodo insertarExpedientePadecimientos
    
    public ResultSet listarPadecimientosFamiliares(String idExpedientePaciente) throws SQLException
    {
        OperacionesExpedientePadecimientosFamiliares objOperExpPade = 
                new OperacionesExpedientePadecimientosFamiliares();
        return objOperExpPade.listarPadecimientosFamiliares(idExpedientePaciente);
    }// fin del metodo listarPadecimientosFamiliares
    
    public void eliminarPadecimientoFamiliar(String idPadecimiento, String idExpedientePaciente)
    {
        OperacionesExpedientePadecimientosFamiliares objOperExpPade = 
                new OperacionesExpedientePadecimientosFamiliares();
        objOperExpPade.eliminarPadecimientoFamiliar(idPadecimiento, idExpedientePaciente);
    }// fin del metodo eliminarPadecimientoFamiliar
    
}// fin de la clase NegocioExpedientePadecimientosFamiliares
