
package negocio;
import entidad.Padecimiento;
import datos.OperacionesPadecimiento;

/**
 * Esta clase relaciona la clase OperacionesPadecimiento con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioPadecimiento 
{

    /**
     * Este método llama al método en la capa de datos  que inserta un padecimiento en la base de datos
     * @param nuevoPadecimiento de tipo Padecimiento que representa los datos a insertar de un registro de padecimiento
     */
    public void insertarPadecimiento(Padecimiento nuevoPadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.insertarPadecimiento(nuevoPadecimiento);
    }// fin del metodo insertarPadecimiento
    
    /**
     * Este método llama al método en la capa de datos  que obtiene el id(identificador) 
     * de padecimientos  en la base de datos.
     * @param nombrePadecimiento de tipo String que representa el nombre del padecimiento
     * que se desea obtener el expediente médico.
     * @return un entero que representa el id(identificador) del padecimieno retornado por el método llamado 
     */
    public int obtenerId(String nombrePadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        return operacionesPadecimiento.obtenerId(nombrePadecimiento);
    }// fin del metodo obtenerID
    
    /**
     * Este método llama al método en la capa de datos que inserta un padecimiento si no se encuentra en la base de datos
     * @param nombrePadecimiento de tipo String que representa el nombre del padecimiento
     */
    public void consultarOInsertarPadecimiento(String nombrePadecimiento)
    {
        OperacionesPadecimiento operacionesPadecimiento = new OperacionesPadecimiento();
        operacionesPadecimiento.consultarOInsertarPadecimiento(nombrePadecimiento);
    }// fin del metodo consultarOInsertarPadecimiento 
    
}// fin de la clase NegocioPadecimiento
