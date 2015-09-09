
package negocio;
import entidad.Alergia;
import datos.OperacionesAlergia;
/**
 *
 * @author cooper15
 */
public class NegocioAlergia {
    public void insertarAlergia(Alergia nuevaAlergia){
        OperacionesAlergia operacionesAlergia = new OperacionesAlergia();
        operacionesAlergia.insertarAlergia(nuevaAlergia);
    }
}
