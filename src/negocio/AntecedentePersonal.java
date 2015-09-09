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
public class AntecedentePersonal {
    public void insertarAntecedentePersonal(AntecedentesPersonales nuevoAnt){
        OperacionesAntecedentesPersonales insertar = new OperacionesAntecedentesPersonales();
        try {
            insertar.insertarAntecedentesPersonales(nuevoAnt);
        } catch (SQLException ex) {
            Logger.getLogger(AntecedentePersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
