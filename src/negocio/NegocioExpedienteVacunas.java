package negocio;

import entidad.ExpedienteVacunas;
import datos.OperacionesExpedienteVacunas; 
/**
 *
 * @author QUINCHO
 */
public class NegocioExpedienteVacunas 
{
    public void insertarExpedienteVacunas(ExpedienteVacunas objExpedienteVacunas)
    {
        OperacionesExpedienteVacunas operacionesExpedienteVacunas = new OperacionesExpedienteVacunas();
        operacionesExpedienteVacunas.insertarExpedienteVacunas(objExpedienteVacunas);
    }// fin del metodo insertarExpedienteVacunas
    
}// fin de la clase NegocioExpedienteVacunas
