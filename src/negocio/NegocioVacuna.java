package negocio;

import datos.OperacionesVacuna;
import entidad.Vacuna;

/**
 * Esta clase relaciona la clase OperacionesVacuna con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioVacuna 
{

    /**
     * Este método llama al método en la capa de datos  que inserta un
     * registro de vacuna en la base de datos
     * @param nuevaVacuna de tipo Vacuna que representa los datos a insertar de vacuna
     */
    public void insertarVacuna(Vacuna nuevaVacuna){   
        OperacionesVacuna operacionesVacuna = new OperacionesVacuna();
        operacionesVacuna.insertarVacuna(nuevaVacuna);
    }
}
