// @author QUINCHO

package negocio;

import entidad.SignosVitales;
import datos.OperacionesSignosVitales;
import java.sql.SQLException;

public class NegocioSignosVitales 
{
    public void insertarSignosVitales(SignosVitales nuevosSignosVitales)
    {
        // fin de catch
        
        OperacionesSignosVitales operacionesSignosVitales = new OperacionesSignosVitales();
        operacionesSignosVitales.insertarSignosVitales(nuevosSignosVitales);
    
    }// fin del metodo insertarSignosVitales
    
}// fin de la clase NegocioSignosVitales
