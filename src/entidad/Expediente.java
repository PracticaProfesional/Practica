
package entidad;

/**
 *
 * @author cooper15
 */
public class Expediente {

    public Padecimiento getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(Padecimiento padecimiento) {
        this.padecimiento = padecimiento;
    }

    public Alergia getAlergia() {
        return alergia;
    }

    public void setAlergia(Alergia alergia) {
        this.alergia = alergia;
    }

    public Adiccion getAdiccion() {
        return adiccion;
    }

    public void setAdiccion(Adiccion adiccion) {
        this.adiccion = adiccion;
    }

    public AntecedenteFamiliar getAntecedenteFamiliar() {
        return antecedenteFamiliar;
    }

    public void setAntecedenteFamiliar(AntecedenteFamiliar antecedenteFamiliar) {
        this.antecedenteFamiliar = antecedenteFamiliar;
    }
    private Padecimiento padecimiento;
    private Alergia alergia;
    private Adiccion  adiccion;
    private AntecedenteFamiliar antecedenteFamiliar;
}
