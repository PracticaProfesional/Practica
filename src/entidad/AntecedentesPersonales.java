
package entidad;

/**
 * Esta clase representa los Antecedentes Personales de un Paciente
 * @author cooper15
 * @version 1.0, 04/12/2015
 */

public class AntecedentesPersonales {
 
    private String tratamiento;
    private String medicamento;
    private int alergias;
    private int vacunas;
    private int expediente;

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }
    
    /**
     * Inicializa los atributos tratamiento y medicamento con los valores de tipo String, "No tiene"
     */
    public AntecedentesPersonales()
    {
        this.tratamiento = "No tiene";
        this.medicamento = "No tiene";
    }// fin del constructor de AntecedentesPersonales

    /**
     * Obtiene el "tratamiento" de un Antecedente Personal
     * @return un String que representa el "tratamiento" de un Antecedente Personal
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * Establece el "tratamiento" de un Antecedente Personal
     * @param tratamiento de tipo String que representa el "tratamiento" de un Antecedente Personal
     */
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     * Obtiene el "medicamento" de un Antecedente Personal
     * @return un String que representa el "medicamento" de un Antecedente Personal
     */
    public String getMedicamento() {
        return medicamento;
    }

    /**
     * Establece el "tratamiento" de un Antecedente Personal
     * @param medicamento  de tipo String que representa el "medicamento" de un Antecedente Personal
     */
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * Obtiene el "id"(identificador) de la Alergia dentro de un Antecedente Personal
     * @return un entero que representa el "id"(identificador) de una Alergia dentro de un Antecedente Personal
     */
    public int getAlergias() {
        return alergias;
    }

    /**
     * Establece el "id"(identificador) de una Vacuna dentro de un  Antecedente Personal
     * @param alergias  de tipo entero que representa el "id"(identificador) de una Vacuna dentro de un  Antecedente Personal
     */
    public void setAlergias(int alergias) {
        this.alergias = alergias;
    }

    /**
     * Obtiene el "id"(identificador) de una Vacuna dentro de un Antecedente Personal
     * @return un entero que representa el "id"(identificador) de una Vacuna dentro de un Antecedente Personal
     */
    public int getVacunas() {
        return vacunas;
    }

    /**
     * Establece el "id"(identificador) de una Vacuna dentro de un  Antecedente Personal
     * @param vacunas de tipo entero que representa el "id"(identificador) de una Vacuna dentro de un  Antecedente Personal
     */
    public void setVacunas(int vacunas) {
        this.vacunas = vacunas;
    }
    
    
}// fin de la calse AntecedentesPersonales
