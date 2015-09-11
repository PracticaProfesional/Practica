// @author QUINCHO

package negocio;

import entidad.SignosVitales;
import datos.OperacionesSignosVitales;
import java.sql.SQLException;

public class NegocioSignosVitales 
{
    public void insertarSignosVitales(SignosVitales nuevosSignosVitales)
    {
        try
        {
            OperacionesSignosVitales operacionesSignosVitales = new OperacionesSignosVitales();
            operacionesSignosVitales.insertarSignosVitales(nuevosSignosVitales);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
    
    }// fin del metodo insertarSignosVitales
    
}// fin de la clase NegocioSignosVitales
