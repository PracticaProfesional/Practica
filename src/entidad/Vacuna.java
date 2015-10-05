package entidad;

/**
 *
 * @author cooper15
 */
public class Vacuna {
    private String tipo = "No posee";
    private String fechaAplicacion = "0000-00-00";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }
    
}
