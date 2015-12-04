
package entidad;

/**
 * Esta clase representa una "Alergia"
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Alergia {

    /**
     * Obtiene el "nombre" de la Alegia
     * @return un String que representa el "nombre" de la Alergia
     */
    public String getNombreAlergia() {
        return nombreAlergia;
    }

    /**
     * Establece el "nombre" de la Alergia
     * @param nombreAlergia de tipo String que representa el "nombre" de la Alergia
     */
    public void setNombreAlergia(String nombreAlergia) {
        this.nombreAlergia = nombreAlergia;
    }

    /**
     * Obtiene el "detalle" de la Alergia
     * @return un String que representa el "detalle" de la Alergia
     */
    public String getDetalleAlergia() {
        return detalleAlergia;
    }

    /**
     * Establece el "detalle" de la Alergia
     * @param detalleAlergia de tipo String que representa el "detalle" de la Alergia
     */
    public void setDetalleAlergia(String detalleAlergia) {
        this.detalleAlergia = detalleAlergia;
    }
    private String nombreAlergia = "No posee";
    private String detalleAlergia = "No aplica";
    
}
