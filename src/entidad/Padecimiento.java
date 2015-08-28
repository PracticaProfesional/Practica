
package entidad;

/**
 *
 * @author cooper15
 */
public class Padecimiento {

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private String fechaDiagnostico;
    private String descripcion;
}
