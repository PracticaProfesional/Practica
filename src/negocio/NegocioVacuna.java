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
    }// fin del metodo insertarVacuna
    
    public void consultarInsertarVacuna(String nombreVacuna)
    {
        OperacionesVacuna operacionesVacuna = new OperacionesVacuna();
        operacionesVacuna.consultarInsertarVacuna(nombreVacuna);
    }// fin del metodo insertarVacuna
    
    public String obtenerIdVacuna(String nombreVacuna)
    {
        OperacionesVacuna operacionesVacuna = new OperacionesVacuna();
        return operacionesVacuna.obtenerIdVacuna(nombreVacuna);
    }// fin del metodo obtenerIdVacuna
    
}
