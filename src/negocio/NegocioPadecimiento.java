
package negocio;
import entidad.Padecimiento;
import datos.OperacionesPadecimiento;
/**
 *
 * @author cooper15
 */
public class NegocioPadecimiento {
    public void insertarPadecimiento(Padecimiento nuevoPadecimiento){
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.insertarPadecimiento(nuevoPadecimiento);
    }
}
