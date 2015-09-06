package negocio;

import datos.OperacionesVacuna;
import entidad.Vacuna;

/**
 *
 * @author cooper15
 */
public class NegocioVacuna {
    public void insertarVacuna(){
        Vacuna nuevaVacuna = new Vacuna();
        OperacionesVacuna operacionesVacuna = new OperacionesVacuna();
        operacionesVacuna.insertarVacuna(nuevaVacuna);
    }
}
