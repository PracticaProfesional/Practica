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
        
            return id;
        }// fin del try
        catch (SQLException e)
        {
            e.printStackTrace();
            return 0;
        }// fin de catach
    }// fin del metodo obtenerId
    
}// fin de la clase OperacionePadecimiento