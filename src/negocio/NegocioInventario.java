//@author QUINCHO
 
package negocio;

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
    
}// fin de la clase NegocioInventario
