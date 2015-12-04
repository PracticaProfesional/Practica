

package entidad;

/**
 * Esta clase representa la asociación de los Antecedentes Familiar de un Paciente con un Padecimiento (Mapeo de tabla de BD)
 * @author QUINCHO
 * @version 1.0, 04/12/2015
 */
public class AntecedentesFamPad 
{
    private int idPadecimiento;
    private int idAntecedenteFamiliar;

    /**
     * Obtiene el "id"(identificador) del Padecimiento
     * @return un entero que representa el "id"(identificador) del Padecimiento
     */
    public int getIdPadecimiento() 
    {
        return idPadecimiento;
    }// fin del metodo getIdPadecimiento

    /**
     * Establece el "id"(identificador) del Padecimiento
     * @param idPadecimiento de tipo entero que representa el "id"(identificador) del Padecimiento
     */
    public void setIdPadecimiento(int idPadecimiento) 
    {
        this.idPadecimiento = idPadecimiento;
    }// fin del metodo setIdPadecimiento

    /**
     * Obtiene "id"(identificador) del Antecedente Familiar
     * @return un entero representa el "id"(identificador) del Antecedente Familiar
     */
    public int getIdAntecedenteFamiliar() 
    {
        return idAntecedenteFamiliar;
    }// fin del metodo getIdAntecedenteFamiliar

    /**
     * Establece "id"(identificador) del Antecedente Familiar
     * @param idAntecedenteFamiliar de tipo entero representa el "id"(identificador) del Antecedente Familiar
     */
    public void setIdAntecedenteFamiliar(int idAntecedenteFamiliar) 
    {
        this.idAntecedenteFamiliar = idAntecedenteFamiliar;
    }// fin del metodo setIdAntecedenteFamiliar
    
    
}// fin de la clase AntecedentesFamPad
