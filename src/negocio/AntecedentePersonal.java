package negocio;
import entidad.AntecedentesPersonales;
import datos.OperacionesAntecedentesPersonales;

/**
 *
 * @author cooper15
 */
public class AntecedentePersonal {
    public void insertarAntecedentePersonal(AntecedentesPersonales nuevoAnt){
        OperacionesAntecedentesPersonales insertar = new OperacionesAntecedentesPersonales();
        insertar.insertarAntecedentesPersonales(nuevoAnt);
    }
}
