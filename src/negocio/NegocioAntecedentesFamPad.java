// @author QUINCHO

package negocio;

import datos.OperacionesAntecedentesFamPad;
import entidad.AntecedentesFamPad;

/**
 * Esta clase relaciona la clase OperacionesAntecedentesFamPad con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioAntecedentesFamPad 
{

    /**
     * Este método llama al método que inserta una relación de antecedentes familiares con padecimientos 
     * @param nuevoAntecedente de tipo AntecedentesFamPad que representa los datos que se van a insertar
     */
    public void insertarAntecedenteFamiliarPadecimiento(AntecedentesFamPad nuevoAntecedente)
    {
        OperacionesAntecedentesFamPad operacionesAntecedente = new OperacionesAntecedentesFamPad();
        operacionesAntecedente.insertarAntecedenteFamiliarPadecimiento(nuevoAntecedente);
    }// fin del metodo insertarPadecimiento
}// fin de la clase NegocioAntecedentesFamPad
