
package entidad;

/**
 *
 * @author cooper15
 */
public class ExamenMedico {
    private String categoria;
    private String subCategoria;
    private int estadoExamenFisico; // Esto sera de tipo enum.
    private String detalle;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public int getEstadoExamenFisico() {
        return estadoExamenFisico;
    }

    public void setEstadoExamenFisico(int estadoExamenFisico) {
        this.estadoExamenFisico = estadoExamenFisico;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}