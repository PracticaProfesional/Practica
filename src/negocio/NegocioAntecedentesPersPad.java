
package negocio;

import entidad.AntecedentesPersPad;
import datos.OperacionesAntecedentesPersPad;

/**
 * Esta clase relaciona la clase OperacionesAlergia con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioAntecedentesPersPad 
{

    /**
     *Este método llama al método que inserta la relación de antecedentes personales con padecimientos 
     * @param nuevoAntecedente de tipo AntecedentesPersPad que representa los datos a insertar
     */
    public void insertarAntecedentePersPad(AntecedentesPersPad nuevoAntecedente)
    {
        OperacionesAntecedentesPersPad operacionesAntecedente = new OperacionesAntecedentesPersPad();
        operacionesAntecedente.insertarAntecedentePersPad(nuevoAntecedente);
    }// fin del metodo insertarPadecimiento
}
