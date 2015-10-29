
package entidad;

import entidad.enums.EstadoConsultaMedicaEnum;

/**
 *
 * @author cooper15
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

    public String getNotaEnfermeria() {
        return notaEnfermeria;
    }

    public void setNotaEnfermeria(String notaEnfermeria) {
        this.notaEnfermeria = notaEnfermeria;
    }

    public String getMotivo2() {
        return motivo2;
    }

    public void setMotivo2(String motivo2) {
        this.motivo2 = motivo2;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    

    public int getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(int signosVitales) {
        this.signosVitales = signosVitales;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdexpediente() {
        return idexpediente;
    }

    public void setIdexpediente(int idexpediente) {
        this.idexpediente = idexpediente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getSintomaPaciente() {
        return sintomaPaciente;
    }

    public void setSintomaPaciente(String sintomaPaciente) {
        this.sintomaPaciente = sintomaPaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public EstadoConsultaMedicaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoConsultaMedicaEnum estado) {
        this.estado = estado;
    }
    
    
}
