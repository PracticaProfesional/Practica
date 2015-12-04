
package entidad;

/**
 * Esta clase representa un Antecedente Familiar
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class AntecedenteFamiliar {
    private String nombreAntecedenteFamiliar;    // Este atributo creo que esta haciendo nada
    private String parentezco;
    private String descripcion;
   
    /**
     * Inicializa los atributos parentzco y descripción con los valores de tipo String, "No tiene"
     */
    public AntecedenteFamiliar()
    {
       this.parentezco = "No tiene";
       this.descripcion = "No tiene";
    }// fin del constructor AntecedenteFamiliar

    /**
     * Obtiene el "nombre" del Antecedente Familiar
     * @return un String que representa el "nombre" del Antecedente Familiar
     */
    public String getNombreAntecedenteFamiliar() {
        return nombreAntecedenteFamiliar;
    }

    /**
     * Establece el "nombre" del Antecedente Familiar
     * @param nombreAntecedenteFamiliar de tipo String que representa el "nombre" del Antecedente Familiar
     */
    public void setNombreAntecedenteFamiliar(String nombreAntecedenteFamiliar) {
        this.nombreAntecedenteFamiliar = nombreAntecedenteFamiliar;
    }

    /**
     * Obtiene el "parentezco" del Antecedente Familiar
     * @return un String que representa el "parentezco" del Antecedente Familiar
     */
    public String getParentezco() {
        return parentezco;
    }

    /**
     * Obtiene el "parentezco" del Antecedente Familiar
     * @param parentezco de tipo String que representa el "parentezco" del Antecedente Familiar
     */
    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    /**
     * Obtiene la "descripción" del Antecedente Familiar
     * @return un String que representa la "descripción" del Antecedente Familiar
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la "descripción" del Antecedente Familiar
     * @param descripcion de tipo String que representa "descripción" del Antecedente Familiar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}// fin de la clase AntecedenteFamiliar
