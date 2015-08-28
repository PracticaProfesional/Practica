
package entidad;

/**
 *
 * @author cooper15
 */
public class ConsultaMedica {
    private String motivoConsulta;
    private String sintomaPaciente;
    private String diagnostico;
    private Paciente paciente;
    private Expediente expediente;

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
}
