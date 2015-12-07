package negocio;

import entidad.ExamenFisico;
import datos.OperacionesExamenFisico;
import java.sql.ResultSet;

/**
 * Esta clase relaciona la clase OperacionesExamenFisico con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioExamenFisico 
{

    /**
     * Este método llama al método en la capa de datos  que inserta un examen físico en la base de datos
     * @param nuevoExamenFisico de tipo ExamenFisico que representa los datos a insertar de examen físico
     */
    public void insertarExamenFisico(ExamenFisico nuevoExamenFisico)
    {
        OperacionesExamenFisico operacionesExamenFisico = new OperacionesExamenFisico();
        operacionesExamenFisico.insertarExamenFisico(nuevoExamenFisico);
        
    }// fin del metodo insertarExamenFisico

    /**
     * Este método llama al método en la capa de datos que obtiene el examen físco por medio de su id(identificador)
     * @param id de tipo String que representa el id(identificador) de un registro de examen físico
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     */
    public ResultSet obtenerExamenFisico(String id){
        datos.OperacionesExamenFisico nuevoExamen = new datos.OperacionesExamenFisico();
        return nuevoExamen.obtenerExamenFisico(id);
    }
}// fin de la clase NegocioExamenFisico
