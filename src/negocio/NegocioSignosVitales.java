// @author QUINCHO

package negocio;

import entidad.SignosVitales;
import datos.OperacionesSignosVitales;
import java.sql.SQLException;

/**
 * Esta clase relaciona la clase OperacionesSignosVitales con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioSignosVitales 
{

    /**
     * Este método llama al método en la capa de datos  que inserta los signos vitales en la base de datos
     * @param nuevosSignosVitales de tipo SignosVitales que representa los datos a insertar de signos vitales
     */
    public void insertarSignosVitales(SignosVitales nuevosSignosVitales)
    {
        // fin de catch
        
        OperacionesSignosVitales operacionesSignosVitales = new OperacionesSignosVitales();
        operacionesSignosVitales.insertarSignosVitales(nuevosSignosVitales);
    
    }// fin del metodo insertarSignosVitales
    
}// fin de la clase NegocioSignosVitales
