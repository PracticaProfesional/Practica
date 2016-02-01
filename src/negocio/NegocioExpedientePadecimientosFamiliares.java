package negocio;

import datos.OperacionesExpedientePadecimientosFamiliares;
import entidad.ExpedientePadecimientosFamiliares;

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
}// fin de la clase NegocioExpedientePadecimientosFamiliares
