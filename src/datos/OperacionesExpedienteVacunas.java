package datos;

import entidad.ExpedienteVacunas;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author QUINCHO
 */
public class OperacionesExpedienteVacunas 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarExpedienteVacunas(ExpedienteVacunas objExpedienteVacunas)
    {
        objetoDeConexion = new Conexion();
        
        String datosVacuna = objExpedienteVacunas.getIdVacuna() + "," +
                             objExpedienteVacunas.getIdExpediente() + "," +
                             "'" + objExpedienteVacunas.getFecha() + "'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarExpedienteVacunas("+datosVacuna+")");
            estado.close();
        }// fin del try
        
        catch(SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin del catch
        
    }// fin del metodo insertarExpedienteVacunas
    
}// fin del metodo OperacionesExpedienteVacunas
