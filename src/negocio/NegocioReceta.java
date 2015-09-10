package negocio;

import entidad.Receta;
import datos.OperacionesReceta;
import java.sql.SQLException;

public class NegocioReceta 
{
    public void insertarCita(Receta nuevaReceta)
    {
        try
        {
            OperacionesReceta operacionesReceta = new OperacionesReceta();
            operacionesReceta.insertarReceta(nuevaReceta);
        }// fin de try
        catch(SQLException e)
        {
        }// fin de catch
    
    }// fin del metodo insertarReceta
    
}// fin de la clase NegocioReceta
