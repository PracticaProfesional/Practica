package negocio;

import entidad.Receta;
import datos.OperacionesReceta;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NegocioReceta 
{
    public void insertarReceta(Receta nuevaReceta)
    {
        OperacionesReceta operacionesReceta = new OperacionesReceta();
        operacionesReceta.insertarReceta(nuevaReceta);    
    }// fin del metodo insertarReceta
    
    public ResultSet obtenerReceta(String id) throws SQLException
    {
        OperacionesReceta operacionesReceta = new OperacionesReceta();
        return operacionesReceta.obtenerReceta(id);
    }// fin del metodo obtenerReceta
    
}// fin de la clase NegocioReceta
