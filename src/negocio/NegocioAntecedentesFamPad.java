// @author QUINCHO

package negocio;

import datos.OperacionesAntecedentesFamPad;
import entidad.AntecedentesFamPad;

public class NegocioAntecedentesFamPad 
{
    public void insertarAntecedenteFamiliarPadecimiento(AntecedentesFamPad nuevoAntecedente)
    {
        OperacionesAntecedentesFamPad operacionesAntecedente = new OperacionesAntecedentesFamPad();
        operacionesAntecedente.insertarAntecedenteFamiliarPadecimiento(nuevoAntecedente);
    }// fin del metodo insertarPadecimiento
}// fin de la clase NegocioAntecedentesFamPad
