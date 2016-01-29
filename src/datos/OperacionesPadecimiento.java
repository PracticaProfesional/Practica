package datos;

import entidad.Padecimiento; // Cambiar a capa de negocios.
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Esta clase realiza las operaciones correspondietes a pacecimientos en la base de datos
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class OperacionesPadecimiento 
{
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correpsondiente a un registro de padecimiento
     * @param padecimiento de tipo Padecimiento que representa los datos a insertar de un padecimiento
     */
    public void insertarPadecimiento(Padecimiento padecimiento)
    {
        objetoDeConexion = new Conexion();
        String datosPadecimiento = "'"+padecimiento.getNombrePadecimiento()+"'"+","
                                   +"'"+padecimiento.getDescripcion()+"'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarPadecimientos("+datosPadecimiento+")");
            estado.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
    }// fin del metodo insertarPadecimiento
    
    // 

    /**
     * Este método obtiene el id(identificador) de la tabla padecimientos a partir de otro atributo
     * @param nombrePadecimiento de tipo String que representa el nombre del padecimiento
     * @return en entero que representa el id(identificador) obtenido por la consulta
     */
    public int obtenerId(String nombrePadecimiento)
    {
        objetoDeConexion = new Conexion();
        int id = 0;
     
        try 
        {
            estado = objetoDeConexion.conectar().createStatement();
            ResultSet rs = estado.executeQuery("Call ConsultarIdPadecimiento ('" + nombrePadecimiento + "')");
            
            if (rs.next())
                id = rs.getInt("id");
            
            estado.close();
            return id;
        }// fin del try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
            return 0;
        }// fin de catach
    }// fin del metodo obtenerId
    
    // 

    /**
     * Este método llama a un procedimiento almacenado para insertar un padecimiento siempre y cuando
     * el padecimiento ya no se encuentre ingresado
     * @param nombrePadecimiento de tipo String que representa el nombre del padecimiento
     */
        public void consultarOInsertarPadecimiento(String nombrePadecimiento)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ConsultarOInsertarPadecimiento ('" + nombrePadecimiento + "')");
            estado.close();
        }// fin del try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
        
    }// fin del metodo consultarOInsertarPadecimiento
    
}// fin de la clase OperacionePadecimiento