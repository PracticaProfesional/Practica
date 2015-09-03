/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author cooper15
 */
public class AntecedentesPersonales {
    private Receta receta;
    private Padecimiento padecimiento;
    private Alergia alergia;

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

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
}
