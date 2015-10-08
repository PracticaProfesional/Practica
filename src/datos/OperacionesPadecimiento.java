package datos;

import entidad.Padecimiento; // Cambiar a capa de negocios.
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author cooper15
 */
public class OperacionesPadecimiento 
{
    
   private Conexion objetoDeConexion;
    private Statement estado;
    
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
        }// fin de catch
    }// fin del metodo insertarPadecimiento
    
    // El siguiente metodo obtiene el id de la tabla a partir de otro atributo
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
            e.printStackTrace();
            return 0;
        }// fin de catach
    }// fin del metodo obtenerId
    
    // El siguiente metodo llama a un procedimiento almacenado para insertar un padecimiento siempre y cuando
    // el padecimiento ya no se encuentre ingresado
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
            e.printStackTrace();
        }// fin de catch
        
    }// fin del metodo consultarOInsertarPadecimiento
    
}// fin de la clase OperacionePadecimiento