// @author QUINCHO

package presentacion;

/**
 * Esta clase representa un objeto que posteriormento se insertará en un colección para
 * generar un JavaBean que nos permitirá obtener el reporte de medicamentos por paciente 
 * @author QUINCHO
 */
public class ReporteMedicamentosBean 
{
    private String nombreMedicamento;
    private int totalEstudiantes;
    private int totalAdministrativos;
    private int totalDocentes;
    private int total;
    
    /**
     * Constructor vacio
     */
    public ReporteMedicamentosBean()
    {
    }

    /**
     * Constructor con todas sus propiedades incializadas
     * @param nombreMedicamento representa el nombre del medicamento
     * @param totalEstudiantes represena el total consumido de determinado medicamento por estudiantes
     * @param totalAdministrativos represena el total consumido de determinado medicamento por admisnistrativos
     * @param totalDocentes represena el total consumido de determinado medicamento por docents
     * @param total represena el total consumido
     */
    public ReporteMedicamentosBean(String nombreMedicamento, int totalEstudiantes, 
            int totalAdministrativos, int totalDocentes, int total) 
    {
        this.nombreMedicamento = nombreMedicamento;
        this.totalEstudiantes = totalEstudiantes;
        this.totalAdministrativos = totalAdministrativos;
        this.totalDocentes = totalDocentes;
        this.total = total;
    }

    /**
     * Obtiene el nombre del medicamento
     * @return un String que rrepresenta el nombre del medicamento
     */
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    /**
     * Establece el nombre del medicamento
     * @param nombreMedicamento
     */
    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    /**
     * Obtiene el total de estudiantes
     * @return un entoro que rrepresenta el total de estudiantes
     */
    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    /**
     * Establece el total de estudiantes
     * @param totalEstudiantes
     */
    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }

    /**
     * Obtiene el total de adminsitrativos
     * @return un entero que rrepresenta el total de admisnitrativos
     */
    public int getTotalAdministrativos() {
        return totalAdministrativos;
    }

    /**
     * Establece el total de administrativos
     * @param totalAdministrativos
     */
    public void setTotalAdministrativos(int totalAdministrativos) {
        this.totalAdministrativos = totalAdministrativos;
    }

    /**
     * Obtiene el total de docentes
     * @return un entero que rrepresenta el total de docentes
     */
    public int getTotalDocentes() {
        return totalDocentes;
    }

    /**
     * Establece el total de docentes
     * @param totalDocentes
     */
    public void setTotalDocentes(int totalDocentes) {
        this.totalDocentes = totalDocentes;
    }

    /**
     * Obtiene el nombre del medicamento
     * @return un String que rrepresenta el nombre del medicamento
     */
    public int getTotal() {
        return total;
    }

    /**
     * Establece el total
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
}// fin de la clase ReporteMedicamentosBean
