
package entidad;

/**
 * Esta clase representa los Expedientes Médicos
 * @author cooper15
 * @version 1.0, 04/12/2015
 */

public class Expediente {
    private int antecedentesFamiliares;
    private int antecedentesPersonales;
    private int paciente;
    private int examenMedico;

    /**
     * Obtiene el "id(identificador)" de los Antecedentes Familiares detro del Expediente Médico
     * @return un entero que representa el "id(identificador)" de los Antecedentes Familiares detro del Expediente Médico
     */
    public int getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    /**
     * Establece el "id(identificador)" de los Antecedentes Familiares detro del Expediente Médico
     * @param antecedentesFamiliares de tipo entero que representa el "id(identificador)" de los Antecedentes Familiares detro del Expediente Médico
     */
    public void setAntecedentesFamiliares(int antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    /**
     * Obtiene el "id(identificador)" de los Antecedentes Personales detro del Expediente Médico
     * @return un entero que representa el "id(identificador)" de los Antecedentes Personales detro del Expediente Médico
     */
    public int getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    /**
     * Establece el "id(identificador)" de los Antecedentes Personales detro del Expediente Médico
     * @param antecedentesPersonales de tipo entero que representa el "id(identificador)" de los Antecedentes Personales detro del Expediente Médico
     */
    public void setAntecedentesPersonales(int antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    /**
     * Obtiene el "id(identificador)" del Paciente detro del Expediente Médico
     * @return un entero que representa  el "id(identificador)" del Paciente detro del Expediente Médico
     */
    public int getPaciente() {
        return paciente;
    }

    /**
     * Establece el "id(identificador)" del Paciente detro del Expediente Médico
     * @param paciente de tipo entero que representa el "id(identificador)" del Paciente detro del Expediente Médico
     */
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene el "id(identificador)" del Examen Médico detro del Expediente Médico
     * @return un entero que representa  el "id(identificador)" del Examen Médico detro del Expediente Médico
     */
    public int getExamenMedico() {
        return examenMedico;
    }

    /**
     * Establece el "id(identificador)" del Examen Médico detro del Expediente Médico
     * @param examenMedico de tipo entero que representa el "id(identificador)" examenMedico
     */
    public void setExamenMedico(int examenMedico) {
        this.examenMedico = examenMedico;
    }
}
