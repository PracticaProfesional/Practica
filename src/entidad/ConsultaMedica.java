
package entidad;

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
}
