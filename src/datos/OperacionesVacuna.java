package datos;

import entidad.Vacuna;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 * Esta clase realiza las operaciones correspondientes a Vacuna en la base de datos
 * @author cooper15
 */
public class OperacionesVacuna {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta un registro en la Vacunas en la base de datos
     * @param vacuna de tipo vacuna que contiene los datos a insertar
     */
    public void insertarVacuna(Vacuna vacuna){
        objetoDeConexion = new Conexion();
        String datosVacuna = "'"+vacuna.getTipo()+"'"+','+"'"+vacuna.getFechaAplicacion()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarVacunas("+datosVacuna+")");
            estado.close();
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
    }// fin del metodo insertarVacuna
    
    /**
     * Inserta un registros de vacunas en la base de datos, consultando si esta o no insertada anteriormente
     * @param nombreVacuna de tipo vacuna que contiene los datos a insertar
     */
    public void consultarInsertarVacuna(String nombreVacuna)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ConsultarInsertarVacuna('" + nombreVacuna + "')");
            estado.close();
        }// fin del try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
    }// fin del metodo ConsultarInsertarVacuna
    
    public String obtenerIdVacuna(String nombreVacuna)
    {
        String id = "";
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            ResultSet rs = estado.executeQuery("Call ObtenerIdVacuna ('" + nombreVacuna + "')");
            
            if(rs.next())
                id = rs.getString("id");       
        }// fin del try
        catch(java.sql.SQLException sqle)
        {
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }//fin del catch
        
        return id;
    }// fin del metodo obtenerId
}// fin de la clase OperacionesVacuna
