package negocio;
import entidad.AntecedentesPersonales;
import datos.OperacionesAntecedentesPersonales;

/**
 * Esta clase no se sabe como llegó a este paquete pero me da pereza borrala por eso mejor se queda aquí
 * @author cooper15
 * @version 1.0, 06/15/2015
 */
public class AntecedentePersonal {
    public void insertarAntecedentePersonal(AntecedentesPersonales nuevoAnt){
        OperacionesAntecedentesPersonales insertar = new OperacionesAntecedentesPersonales();
        insertar.insertarAntecedentesPersonales(nuevoAnt);
    }
}
