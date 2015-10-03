package entidad;

/**
 *
 * @author cooper15
 */
public class Cita {
    //private int detalle;
    private EstadoCitaEnum estado;
    private String fechaCreacion;
    private String fechaConsulta;
    private String anotaciones;
    private String hora;

    
    public EstadoCitaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoCitaEnum estado) {
        this.estado = estado;
    }
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    
}
