//@author QUINCHO
 
package negocio;

import entidad.Inventario;
import java.sql.ResultSet;
import java.sql.SQLException;
import datos.OperacionesInventario;

/**
 * Esta clase relaciona la clase OperacionesInventario con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioInventario 
{

    /**
     * Este método llama al método en la capa de datos que obtiene el listado del inventario 
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     * @throws SQLException
     */
    public ResultSet listarInventario() throws SQLException
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.listarInventario();
    }// fin del metodo listarInventario
    
    /**
     * Este método llama al método en la capa de datos  que inserta un insumo en la tabla Inventario de la base de datos
     * @param nuevoInventario de tipo Inventario que representa los datos a insertar en la tabla Inventario de la base de datos
     */
    public void insertarInventario(Inventario nuevoInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.insertarInventario(nuevoInventario);
    }// fin del metodo insertarInventario
    
    /**
     * Este método llama al método en la capa de datos  que obtiene el id(identificador) 
     * de un registro de Inventario  en la base de datos.
     * @param nombreInventario de tipo String que represernta el nombre del insumo en el inventario
     * @return un String que representa el id(identificador) del registro de inventario retornado por el método llamado 
     */
    public String obtenerId(String nombreInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.obtenerId(nombreInventario);
    }// fin del metodo obtenerId
    
    /**
     * Este método llama al método en la capa de datos que actuliza una consulta médica
     * @param id de tipo String que representa el id(identificador) de un registro de inventario
     * @param actualizarInventario de tipo Inventario que representa los datos a actualizar
     */
    public void actualizarInventario(String id, Inventario actualizarInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.actualizarInventario(id, actualizarInventario);
    }// fin del metodo actualizarInventario
    
    /**
     * Este método llama al método en la capa de datos que elimina una registro del inventario
     * @param nombre de tipo String que representa el identificador del registro a eliminar
     */
    public void eliminarDelInventario(String nombre)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.eliminarDelInventario(nombre);
    }// fin del metodo eliminarDelInventario
    
    /**
     * Este método llama al método en la capa de datos que descuenta la cantidad en existencia
     * de un registro del iventario.
     * @param nombre de tipo String que representa el identificador del registro a descontar su cantidad
     * @param cantidad de tipo String que representa la cantidad del registro a descontar
     */
    public void descontarDelInventario(String nombre, String cantidad)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.descontarDelInventario(nombre, cantidad);
    }// fin del metodo descontarDelInventario
    
    /**
     * Este método llama al método en la capa de datos que obtiene el listado del inventario 
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     * @throws SQLException
     */
    public ResultSet listarMedicamentosInventario() throws SQLException
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.listarMedicamentosIventario();
    }// fin del metodo ResultSet
    
}// fin de la clase NegocioInventario
