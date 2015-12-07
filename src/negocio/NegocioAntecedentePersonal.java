package negocio;
import entidad.AntecedentesPersonales;
import datos.OperacionesAntecedentesPersonales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase relaciona la clase OperacionesAntecedentesPersonales con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioAntecedentePersonal {

    /**
     * Este método llama al método que inserta antecedentes personales 
     * @param nuevoAnt de tipi AntecedentesPersonales que representa los datos que se van a insertar
     */
    public void insertarAntecedentePersonal(AntecedentesPersonales nuevoAnt){
        OperacionesAntecedentesPersonales insertar = new OperacionesAntecedentesPersonales();
        insertar.insertarAntecedentesPersonales(nuevoAnt);
    }
}
