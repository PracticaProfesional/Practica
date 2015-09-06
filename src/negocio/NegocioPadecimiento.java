
package negocio;
import entidad.Padecimiento;
import datos.OperacionesPadecimiento;
/**
 *
 * @author cooper15
 */
public class NegocioPadecimiento {
    public void insertarPadecimiento(){
        Padecimiento nuevoPadecimiento = new Padecimiento();
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.insertarPadecimiento(nuevoPadecimiento);
    }
}
