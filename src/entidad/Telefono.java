
package entidad;

/**
 * Esta clase representa los numeros telefónicos de los Pacientes
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Telefono {
    private String telefono;
    private String detalle;

    /**
     * Obtiene el número de "teléfono"
     * @return un String que representa el número de "teléfono"
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de "teléfono"
     * @param telefono de tipo String que representa el número de "teléfono"
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el "detalle" del teléfono
     * @return un String que representa el "detalle" del teléfono
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Establece el "detalle" del teléfono
     * @param detalle de tipo String que representa el "detalle" del teléfono
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
