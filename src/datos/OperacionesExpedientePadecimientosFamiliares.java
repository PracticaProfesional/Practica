package datos;

import entidad.ExpedientePadecimientosFamiliares;
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
    
    
}// fin de la clase OperacionesExpedientePadecimientosFamiliares
