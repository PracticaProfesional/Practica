// @author QUINCHO
 
package datos;

import entidad.Inventario;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase realiza las operaciones correspondientes a Inventario
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesInventario 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    

    /**
     * Este método retorna el inventario existente en la base de datos
     * @return objeto ResultSet que contiene la información de registros de inventario
     * @throws SQLException
     */
        public ResultSet listarInventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT * FROM ListarInventario");
        return rs;
    }// fin del metodo listarInventario
    
    

    /**
     * Este método inserta existencias del inventario en la base de datos
     * @param nuevoInventario de tipo Inventario que representa los datos de una existencia en el inventario
     */
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
    
    // 

    /**
     * Esre método retorna el id(identificador) del artículo consultado en este mismo metodo
     * @param nombreInventario de tipo String que representa el nombre de la existencia en el inventario
     * @return un String que representa el id(identificador) de la existencia en el inventario
     */
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
    
    /**
     * Actualiza un registro de inventario en la base de datos
     * @param id de tipo String que representa el id(identificador) del registro a actualizar en el inventario
     * @param actualizarInventario de tipo Inventario que representa los datos del registro de inventario
     */
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
    
    /**
     * Elimina un registro de inventario de la base de datos
     * @param nombre de tipo String que representa el nombre del registro a eliminar del inventario
     */
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
    
    /**
     * Este método descuenta la cantidad en existencia de un insumo del inventario en la base de datos
     * @param nombre de tipo String que representa el nombre del insumo a descontar del inventario
     * @param cantidad de tipo String que representa la cantidad que se descontará del inventario
     */
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
    
    /**
     * Este método lista los medicamentos registrados en el inventario
     * @return un objeto ResultSet que representa todos los registros retornados por la consulta
     * @throws SQLException
     */
    public ResultSet listarMedicamentosIventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = estado.executeQuery("Call ListarMedicamentosInventario ()");
        return rs;
    }// fin del metodo listarMedicamentosInventario
    
}// fin de la clase OperacionesInventario
