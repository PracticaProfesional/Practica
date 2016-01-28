
package negocio;

import datos.OperacionesExpedientePadecimientos;
import entidad.ExpedientePadecimientos;

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
    
}// fin de la clase NegocioExpedientePadecimientos
