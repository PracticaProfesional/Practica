

package entidad;
 
/**
 * Esta clase representa la asociación de los Antecedentes Personales de un Paciente con un Padecimiento (Mapeo de tabla de BD)
 * @author QUINCHO
 * @version 1.0, 04/12/2015
 */
public class AntecedentesPersPad 
{
    
    private int idPadecimientos;
    private int idAntecedentesPersonales;

    /**
     * Obtiene el "id"(identificador) del Padecimiento
     * @return un entero que representa "id"(identificador) del Padecimiento
     */
    public int getIdPadecimientos() 
    {
        return idPadecimientos;
    }// fin del metodo getIdPadecimientos

    /**
     * Establece el "id"(identificador) del Padecimiento
     * @param idPadecimientos de tipo entero que representa "id"(identificador) del Padecimiento
     */
    public void setIdPadecimientos(int idPadecimientos) 
    {
        this.idPadecimientos = idPadecimientos;
    }// fin del metodo setIdPadecimientos

    /**
     * Obtiene el "id"(identificador) del Antecedente Personal
     * @return un entero que representa "id"(identificador) del Antecedente Personal
     */
    public int getIdAntecedentesPersonales() 
    {
        return idAntecedentesPersonales;
    }// fin del metodo getIdAntecedentesPersonales

    /**
     * Establece el "id"(identificador) del Antecedente Personal
     * @param idAntecedentesPersonales de tipo entero que representa "id"(identificador) del Antecedente Personal
     */
    public void setIdAntecedentesPersonales(int idAntecedentesPersonales) 
    {
        this.idAntecedentesPersonales = idAntecedentesPersonales;
    }// fin del metodo setIdAntecedentesPersonales
        
}// fin de la clase AntecedentesPersPad
