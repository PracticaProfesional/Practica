
package negocio;
import entidad.Alergia;
import datos.OperacionesAlergia;

/**
 * Esta clase relaciona la clase OperacionesAlergia con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioAlergia {

    /**
     * Este método llama al método que inserta una alergia 
     * @param nuevaAlergia de tipo Alergia que representa los datos que se van insertar
     */
    public void insertarAlergia(Alergia nuevaAlergia){
        OperacionesAlergia operacionesAlergia = new OperacionesAlergia();
        operacionesAlergia.insertarAlergia(nuevaAlergia);
    }
}
