
package entidad;

/**
 * Esta clase representa los Padecimientos
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Padecimiento {
    private String nombrePadecimiento;
    private String descripcion; 

    /**
     * Obtiene el "nombre" del Padecimiento
     * @return un String que representa el "nombre" del Padecimiento
     */
    public String getNombrePadecimiento() {
        return nombrePadecimiento;
    }

    /**
     * Establece el "nombre" del Padecimiento
     * @param nombrePadecimiento de tipo String que representa el "nombre" del Padecimiento
     */
    public void setNombrePadecimiento(String nombrePadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
    }

    /**
     * Obtiene la "descripción" del Padecimiento
     * @return un String que representa la "descripción" del Padecimiento
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece  la "descripción" del Padecimiento
     * @param descripcion de tipo SexoEnum que representa la "descripción" del Padecimiento
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
