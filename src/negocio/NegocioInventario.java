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
    
}// fin de la clase NegocioInventario
