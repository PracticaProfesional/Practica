package negocio;
import entidad.AntecedentesPersonales;
import datos.OperacionesAntecedentesPersonales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cooper15
 */
public class NegocioAntecedentePersonal {
    public void insertarAntecedentePersonal(AntecedentesPersonales nuevoAnt){
        OperacionesAntecedentesPersonales insertar = new OperacionesAntecedentesPersonales();
        insertar.insertarAntecedentesPersonales(nuevoAnt);
    }
}
