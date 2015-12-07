package negocio;
import datos.OperacionesExamenExpediente;
/**
 * Esta clase relaciona la clase OperacionesAlergia con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */

public class NegocioExamenExpediente {

    /**
     * Este método llama al método que inserta el examen expediente 
     * @param idExamen de tipo String que representa el id(identificador) del examen médico
     * @param idExpediente de tipo String que representa el id(identificador) del expediente médico 
     */
    public void insertarExamenExpediente(String idExamen, String idExpediente){
        OperacionesExamenExpediente nuevoExamenExp;
        nuevoExamenExp = new OperacionesExamenExpediente();
        nuevoExamenExp.insertarRelacionExamenExpediente(idExamen, idExpediente);
    }

    /**
     * Este método llama al método de la capa de datos que obtiene el id(identificador) de examen médico
     * @param idExpediente de tipo String que representa el id(identificador) del expediente médico 
     * @return un objeto ResultSet que representa el(los) registro(s) devueltos por el metodo llamado
     */
    public java.sql.ResultSet obtenerIdExamenesMedicos (String idExpediente){
        OperacionesExamenExpediente ids = new OperacionesExamenExpediente();
        return ids.obtenerIdExamenesMedicos(idExpediente);
    }
}
