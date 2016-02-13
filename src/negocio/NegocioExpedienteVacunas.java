package negocio;

import entidad.ExpedienteVacunas;
import datos.OperacionesExpedienteVacunas; 
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public ResultSet listarVacunas(String idExpedientePaciente) throws SQLException
    {
        OperacionesExpedienteVacunas operacionesExpedienteVacunas = new OperacionesExpedienteVacunas();
        return operacionesExpedienteVacunas.listarVacunas(idExpedientePaciente);
    }// fin del metodo listarPadecimientosFamiliares
    
    public void eliminarVacuna(String id)
    {
        OperacionesExpedienteVacunas operacionesExpedienteVacunas = new OperacionesExpedienteVacunas();
        operacionesExpedienteVacunas.eliminarVacuna(id);
    }// fin del metodo eliminarVacuna
    
    
}// fin de la clase NegocioExpedienteVacunas
