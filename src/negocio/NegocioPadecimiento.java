
package negocio;
import entidad.Padecimiento;
import datos.OperacionesPadecimiento;
/**
 *
 * @author cooper15
 */
public class NegocioPadecimiento 
{
    public void insertarPadecimiento(Padecimiento nuevoPadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.insertarPadecimiento(nuevoPadecimiento);
    }// fin del metodo insertarPadecimiento
    
    public int obtenerId(String nombrePadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        return operacionesPadecimiento.obtenerId(nombrePadecimiento);
    }// fin del metodo obtenerID
    
    public void consultarOInsertarPadecimiento(String nombrePadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.consultarOInsertarPadecimiento(nombrePadecimiento);
    }// fin del metodo consultarOInsertarPadecimiento 
    
}// fin de la clase NegocioPadecimiento
