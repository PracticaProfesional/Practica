package negocio;

import datos.OperacionesLaboratorioGabinete;

/**
 *
 * @author cooper15
 */
public class NegocioLaboratorioGabinete {
    public void guardarExamen(java.io.File archivo, int idExPaciente){
        OperacionesLaboratorioGabinete inLab;
        inLab = new OperacionesLaboratorioGabinete();
        inLab.insertarLaboratorio(archivo, idExPaciente);
    }
}
