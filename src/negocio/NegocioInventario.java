//@author QUINCHO
 
package negocio;

import entidad.Inventario;
import java.sql.ResultSet;
import java.sql.SQLException;
import datos.OperacionesInventario;

public class NegocioInventario 
{
    public ResultSet listarInventario() throws SQLException
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.listarInventario();
    }// fin del metodo listarInventario
    
    public void insertarInventario(Inventario nuevoInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.insertarInventario(nuevoInventario);
    }// fin del metodo insertarInventario
    
    public String obtenerId(String nombreInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.obtenerId(nombreInventario);
    }// fin del metodo obtenerId
    
    public void actualizarInventario(String id, Inventario actualizarInventario)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.actualizarInventario(id, actualizarInventario);
    }// fin del metodo actualizarInventario
    
    public void eliminarDelInventario(String nombre)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.eliminarDelInventario(nombre);
    }// fin del metodo eliminarDelInventario
    
    public void descontarDelInventario(String nombre, String cantidad)
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        operacionesInventario.descontarDelInventario(nombre, cantidad);
    }// fin del metodo descontarDelInventario
    
    public ResultSet listarMedicamentosInventario() throws SQLException
    {
        OperacionesInventario operacionesInventario = new OperacionesInventario();
        return operacionesInventario.listarMedicamentosIventario();
    }// fin del metodo ResultSet
    
}// fin de la clase NegocioInventario
