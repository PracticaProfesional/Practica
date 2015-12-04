
package entidad;

/**
 * Esta clase representa una adiccion.
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Adiccion {

    /**
     * Obtiene el "nombre" de la Adiccion
     * @return un String que representa el "nombre" de la Adiccion
     */
    public String getNombreAdiccion() {
        return nombreAdiccion;
    }

    /**
     * Establece el "nombre" de la Adiccion
     * @param nombreAdiccion de tipo String que representa el "nombre" de la Adiccion
     */
    public void setNombreAdiccion(String nombreAdiccion) {
        this.nombreAdiccion = nombreAdiccion;
    }

    /**
     * Obtiene el "detalle" de la Adiccion
     * @return un String que representa el "detalle" de la Adiccion
     */
    public String getDetalleAdiccion() {
        return detalleAdiccion;
    }

    /**
     * Eatblece el "detalle" de la Adiccion 
     * @param detalleAdiccion de tipo String que representa el "detalle" de la Adiccion
     */
    public void setDetalleAdiccion(String detalleAdiccion) {
        this.detalleAdiccion = detalleAdiccion;
    }
    String nombreAdiccion;
    String detalleAdiccion;
}
