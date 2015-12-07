package negocio;

import datos.OperacionesLaboratorioGabinete;

/**
 * Esta clase relaciona la clase OperacionesLaboraitorioGabineto con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioLaboratorioGabinete {

    /**
     * Este método llama al método en la capa de datos  que inserta un examen médico en la base de datos
     * @param archivo de tipo File que contiene el fichero a insertar
     * @param idExPaciente de entero que representa el id(identificador) del expediente médico
     */
    public void guardarExamen(java.io.File archivo, int idExPaciente){
        OperacionesLaboratorioGabinete inLab;
        inLab = new OperacionesLaboratorioGabinete();
        inLab.insertarLaboratorio(archivo, idExPaciente);
    }
}
