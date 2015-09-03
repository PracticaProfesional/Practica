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
    private int alergia;
    private int padecimiento;
    private int vacuna;
    private String tratamiento;
    private String medicamento;

    public int getAlergia() {
        return alergia;
    }

    public void setAlergia(int alergia) {
        this.alergia = alergia;
    }

    public int getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(int padecimiento) {
        this.padecimiento = padecimiento;
    }

    public int getVacuna() {
        return vacuna;
    }

    public void setVacuna(int vacuna) {
        this.vacuna = vacuna;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
}
