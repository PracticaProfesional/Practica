package datos;

import entidad.ExpedientePadecimientosFamiliares;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza todas las operaciones correspodientes a la tabla expediente-padecimientosfamiliares
 * @author QUINCHO
 */

public class OperacionesExpedientePadecimientosFamiliares 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarExpedientePadecimientosFamiliares(ExpedientePadecimientosFamiliares objExpPadFam)
    {
        objetoDeConexion = new Conexion();
       
        try
        {
            String datosExpPadFam = objExpPadFam.getIdPadecimiento() + "," + 
                                    objExpPadFam.getIdExpediente()+ "," +
                                    "'"+ objExpPadFam.getParentesco() + "'" + "," +
                                    "'" + objExpPadFam.getDescripcion()+ "'";
            
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarExpedientePadecimientosFamiliares("+datosExpPadFam+")");
            estado.close();
        }// fin del try
        catch(java.sql.SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin del catch
        
    }// fin del metodo insertarExpedientePadecimientos
    
    public ResultSet listarPadecimientosFamiliares(String idExpedientePaciente) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarPadecimientosFamilires (" + idExpedientePaciente + ")");
        return rs;
    }// fin del metodo listarPadecimientosFamiliares
    
    public void eliminarPadecimientoFamiliar(String idPadecimiento, String idExpediente)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call EliminarPadecimientosFamiliares (" + idPadecimiento  + ", " +
            idExpediente + ")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo eliminarDelInventario
    
    
}// fin de la clase OperacionesExpedientePadecimientosFamiliares
