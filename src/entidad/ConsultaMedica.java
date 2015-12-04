
package entidad;

import entidad.enums.EstadoConsultaMedicaEnum;

/**
 * Esta clase representa las Consultas Medicas
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class ConsultaMedica {
    private String fecha = "";
    private String motivoConsulta = "";
    private String sintomaPaciente = "";
    private String diagnostico = "";
    private int signosVitales = 0; 
    private int idexpediente = 0;
    private String motivo2 = "";
    private String observaciones = "";
    private String notaEnfermeria = "";
    private EstadoConsultaMedicaEnum estado;
    private int idReceta;

    /**
     * Obtiene la "nota de enfermería" de la Consulta Médica
     * @return un String que representa la "nota de enfermería" de la Consulta Médica
     */
    public String getNotaEnfermeria() {
        return notaEnfermeria;
    }

    /**
     * Establece la "nota de enfermería" de la Consulta Médica
     * @param notaEnfermeria de tipo String que representa la "nota de enfermería" de la Consulta Médica
     */
    public void setNotaEnfermeria(String notaEnfermeria) {
        this.notaEnfermeria = notaEnfermeria;
    }

    /**
     * Obtiene el "segundo motivo" de la Consulta Médica
     * @return un String que representa el "segundo motivo" de la Consulta Médica
     */
    public String getMotivo2() {
        return motivo2;
    }

    /**
     * Establece el "segundo motivo" de la Consulta Médica
     * @param motivo2 de tipo String que representa el "segundo motivo" de la Consulta Médica
     */
    public void setMotivo2(String motivo2) {
        this.motivo2 = motivo2;
    }

    /**
     * Obtiene las "observaciones" de la Consulta Médica
     * @return un String que representa las "observaciones" de la Consulta Médica
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece las "observaciones" de la Consulta Médica
     * @param observaciones de tipo String que representa las "observaciones" de la Consulta Médica
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    /**
     * Obtiene el "id(identificador)" de los signos vitales de la Consulta Médica
     * @return un entero que representa el "id(identificador)" de los signos vitales de la Consulta Médica
     */
    public int getSignosVitales() {
        return signosVitales;
    }

    /**
     * Establece el "id(identificador)" de la Consulta Médica
     * @param signosVitales de tipo entero que representa el "id(identificador)" de la Consulta Médica
     */
    public void setSignosVitales(int signosVitales) {
        this.signosVitales = signosVitales;
    }

    /**
     * Obtiene la "fecha" de la Consulta Médica
     * @return un String que representa la "fecha" de la Consulta Médica
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la "fecha" de la Consulta Médica
     * @param fecha de tipo String que representa la "fecha" de la Consulta Médica
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el "id(identificador)" del Expediente Médico dentro de la Consulta Médica
     * @return un int que representa el "id(identificador)" del Expediente Médico dentro de la Consulta Médica 
     */
    public int getIdexpediente() {
        return idexpediente;
    }

    /**
     * Establece el "id(identificador)" del Expediente Médico dentro de la Consulta Médica
     * @param idexpediente de tipo entero que representa el "id(identificador)" del Expediente Médico dentro de la Consulta Médica
     */
    public void setIdexpediente(int idexpediente) {
        this.idexpediente = idexpediente;
    }

    /**
     * Obtiene el "motivo" de la Consulta Médica
     * @return un String que representa el "motivo" de la  Consulta Médica 
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * Establece el "motivo" de la Consulta Médica
     * @param motivoConsulta de tipo String que representa el "motivo" de la Consulta Médica
     */
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    /**
     * Obtiene los "síntomas" de la Consulta Médica
     * @return un String que representa los "síntomas" de la Consulta Médica
     */
    public String getSintomaPaciente() {
        return sintomaPaciente;
    }

    /**
     * Establece los "síntomas" de la Consulta Médica
     * @param sintomaPaciente de tipo String que representa los "síntomas" de la Consulta Médica
     */
    public void setSintomaPaciente(String sintomaPaciente) {
        this.sintomaPaciente = sintomaPaciente;
    }

    /**
     * Obtiene el "diagnóstico" de la Consulta Médica
     * @return un String que representa el "diagnóstico" de la Consulta Médica
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Establece el "diagnóstico" de la Consulta Médica
     * @param diagnostico de tipo String que representa el "diagnóstico" de la Consulta Médica
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * Obtiene el "estado" de la Consulta Médica
     * @return un EstadoConsultaMedicaEnum que representa el "estado" de la Consulta Médica
     */
    public EstadoConsultaMedicaEnum getEstado() {
        return estado;
    }

    /**
     * Establece el "estado" de la Consulta Médica
     * @param estado de tipo EstadoConsultaMedicaEnum que representa el "estado" de la Consulta Médica
     */
    public void setEstado(EstadoConsultaMedicaEnum estado) {
        this.estado = estado;
    }
    
    
}
