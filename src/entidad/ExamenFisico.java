
package entidad;

/**
 * Esta clase representa los Exámenes Físicos
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class ExamenFisico {
    private String categoria;
    private String subCategoria = "";
    private int consultaMedica = 0;
    //private int estadoExamenFisico; // Esto sera de tipo enum.
    private String detalle = "";

    /**
     * Obtiene la "categoría" del Examen Físico
     * @return un String que representa la "categoría" del Examen Físico
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la "categoría" del Examen Físico
     * @param categoria de tipo String que representa la "categoría" del Examen Físico
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la "sub categoría" del Examen Físico
     * @return un String que representa la "sub categoría" del Examen Físico
     */
    public String getSubCategoria() {
        return subCategoria;
    }

    /**
     * Establece la "sub categoría" del Examen Físico
     * @param subCategoria de tipo String que representa la "sub categoría" del Examen Físico
     */
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    /**
     * Obtiene el "id(identificador)" de la Consulta Médica dentro del Examen Físico
     * @return un entero que representa la "id(identificador)" de la Consulta Médica dentro del Examen Físico
     */
    public int getConsultaMedica() {
        return consultaMedica;
    }

    /**
     * Establece el "id(identificador)" de la Consulta Médica dentro del Examen Físico
     * @param consultaMedica de tipo entero que representa el "id(identificador)" de la Consulta Médica dentro del Examen Físico
     */
    public void setConsultaMedica(int consultaMedica) {
        this.consultaMedica = consultaMedica;
    }
    

    /*public int getEstadoExamenFisico() {
        return estadoExamenFisico;
    }

    public void setEstadoExamenFisico(int estadoExamenFisico) {
        this.estadoExamenFisico = estadoExamenFisico;
    }*/

    /**
     * Obtiene el "detalle" del Examen
     * @return un String que representa el "detalle" del Examen
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Establece el "detalle" del Examen Físico
     * @param detalle de tipo String que representa el "detalle" del Examen Físico
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}