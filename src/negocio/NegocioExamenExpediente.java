package negocio;
import datos.OperacionesExamenExpediente;
/**
 *
 * @author cooper15
 */
public class NegocioExamenExpediente {
    public void insertarExamenExpediente(String idExamen, String idExpediente){
        OperacionesExamenExpediente nuevoExamenExp;
        nuevoExamenExp = new OperacionesExamenExpediente();
        nuevoExamenExp.insertarRelacionExamenExpediente(idExamen, idExpediente);
    }
    public java.sql.ResultSet obtenerIdExamenesMedicos (String idExpediente){
        OperacionesExamenExpediente ids = new OperacionesExamenExpediente();
        return ids.obtenerIdExamenesMedicos(idExpediente);
    }
}
