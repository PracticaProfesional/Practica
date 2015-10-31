// @author QUINCHO
 
package datos;

import entidad.Inventario;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesInventario 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    // El siguiente metodo lista el inventario existente
    public ResultSet listarInventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT * FROM ListarInventario");
        return rs;
    }// fin del metodo listarInventario
    
    // El siguiente metodo inserta existencias del inventario en la base de datos
    public void insertarInventario(Inventario nuevoInventario)
    {
        objetoDeConexion = new Conexion();
        
        String datosInventario = "'" + nuevoInventario.getNombre() + "'" + "," +
                                 nuevoInventario.getCantidad() + "," +
                                 "'" + nuevoInventario.getTamanio() + "'" + "," +
                                 "'" + nuevoInventario.getViaAdministracion() + "'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarInventario (" + datosInventario + ")");
            estado.close();
        }// fin del try
        catch (SQLException sqle)
        {
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }// fin del catch
        
    }// fin del metodo insertarInventario
    
    // El siguiente metodo retorna el id del articulo consultado en este mismo metodo
    public String obtenerId(String nombreInventario)
    {
        String id = "";
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            ResultSet rs = estado.executeQuery("Call ObtenerIdInventario ('" + nombreInventario + "')");
            
            if(rs.next())
                id = rs.getString("id");       
        }// fin del try
        catch(java.sql.SQLException sqle)
        {
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }//fin del catch
        
        return id;
    }// fin del metodo obtenerId
    
    public void actualizarInventario(String id, Inventario actualizarInventario)
    {
        objetoDeConexion = new Conexion();
        
        String datos = id + "," + "'" + actualizarInventario.getNombre() + "'" + "," +
                       actualizarInventario.getCantidad() + "," +
                       "'" + actualizarInventario.getTamanio() + "'" + "," +
                       "'" + actualizarInventario.getViaAdministracion() + "'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ActualizarInventario (" + datos + ")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo actualizarInventario()
    
    public void eliminarDelInventario(String nombre)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call EliminarInventario ('" + nombre + "')");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo eliminarDelInventario
    
    public void descontarDelInventario(String nombre, String cantidad)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call DescontarInventario ('" + nombre +"', " + cantidad + ")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo descontarDelInventario
    
    public ResultSet listarMedicamentosIventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarMedicamentosInventario ()");
        return rs;
    }// fin del metodo listarMedicamentosInventario
    
}// fin de la clase OperacionesInventario
