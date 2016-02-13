package datos;

import entidad.ExpedienteVacunas;
import java.sql.ResultSet;
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
    
    // El suguiente metodo lista las vacunas de un paciente de la base de datos
    public ResultSet listarVacunas(String idExpedientePaciente) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarVacunas (" + idExpedientePaciente + ")");
        return rs;
    }// fin del metodo listarPadecimientosFamiliares
    
    // El siguiente metodo elimna vacunas asociadas a un paciente en la BD
    public void eliminarVacuna(String id)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call EliminarVacunasExpediente(" + id + ")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo eliminarDelInventario
}// fin del metodo OperacionesExpedienteVacunas
