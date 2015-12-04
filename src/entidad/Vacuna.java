package entidad;

/**
 * Esta clase representa los Vacunas
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Vacuna {
    private String tipo = "No posee";
    private String fechaAplicacion = "0000-00-00";

    /**
     * Obtiene el "tipo" de la Vacuna
     * @return un String que representa el "tipo" de la Vacuna
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el "tipo" de la Vacuna
     * @param tipo de tipo String que representa el "tipo" de la Vacuna
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la "fecha de aplicacion" de la Vacuna
     * @return un String que representa la "fecha de aplicacion" de la Vacuna
     */
    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    /**
     * Establece la "fecha de aplicacion" de la Vacuna
     * @param fechaAplicacion de tipo String que representa la "fecha de aplicacion" de la Vacuna
     */
    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }
    
}
