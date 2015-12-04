package entidad;

import entidad.enums.EstadoCitaEnum;

/**
 * Esta clase representa las Citas calendarizadas
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Cita 
{
    //private int detalle;
    private EstadoCitaEnum estado;
    private String fechaCreacion;
    private String fechaConsulta;
    private String anotaciones;
    private String hora;

    /**
     * Obtiene el "estado" de la Cita
     * @return un EstadoCitaEnum que representa el "estado" de una Cita
     */
    public EstadoCitaEnum getEstado() {
        return estado;
    }

    /**
     * Establece el "estado" de la Cita
     * @param estado de tipo EstadoCitaEnum que representa el "estado" de la Cita
     */
    public void setEstado(EstadoCitaEnum estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la "hora" de una Cita
     * @return un String que representa la "hora" de una Cita
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la "hora" de la Cita
     * @param hora de tipo String que representa la "hora" de la Cita
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene la "fecha en que se registra" una Cita
     * @return un String que representa el "fecha en que se registra" una Cita
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece la "fecha en que se registra" una Cita
     * @param fechaCreacion de tipo String que representa el "fecha en que se registra" de una Cita
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Obtiene la "fecha a realizarce" de la Cita
     * @return un String que representa la "fecha a realizarce" de la Cita
     */
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    /**
     * Establece la "fecha a realizarce" de la Cita
     * @param fechaConsulta de tipo String que representa el "fecha a realizarce" de la Cita
     */
    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    /**
     * Obtiene las "anotaciones" de una Cita
     * @return un String que representa las "anotaciones" de una Cita
     */
    public String getAnotaciones() {
        return anotaciones;
    }

    /**
     * Establece las "anotaciones" de una Cita
     * @param anotaciones de tipo String que representa las "anotaciones" de una Cita
     */
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    
}
