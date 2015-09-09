
package entidad;

/**
 *
 * @author cooper15
 */
public class Expediente {
    private int antecedentesFamiliares;
    private int antecedentesPersonales;
    private int paciente;
    private int examenMedico;

    public int getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(int antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public int getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(int antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getExamenMedico() {
        return examenMedico;
    }

    public void setExamenMedico(int examenMedico) {
        this.examenMedico = examenMedico;
    }
}
