package negocio;

import entidad.Receta;
import datos.OperacionesReceta;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase relaciona la clase OperacionesReceta con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioReceta 
{

    /**
     * Este método llama al método en la capa de datos  que inserta una receta en la base de datos
     * @param nuevaReceta de tipo Receta que representa los datos a insertar de una receta
     */
    public void insertarReceta(Receta nuevaReceta)
    {
        OperacionesReceta operacionesReceta = new OperacionesReceta();
        operacionesReceta.insertarReceta(nuevaReceta);    
    }// fin del metodo insertarReceta
    
    /**
     * Este método llama al método en la capa de datos que obtiene la receta por medio de su id(identificador)
     * @param id de tipo String que representa el id(identificador) de un registro de receta
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     * @throws SQLException
     */
    public ResultSet obtenerReceta(String id) throws SQLException
    {
        OperacionesReceta operacionesReceta = new OperacionesReceta();
        return operacionesReceta.obtenerReceta(id);
    }// fin del metodo obtenerReceta
    
}// fin de la clase NegocioReceta
