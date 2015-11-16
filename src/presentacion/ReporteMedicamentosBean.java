// @author QUINCHO

package presentacion;

public class ReporteMedicamentosBean 
{
    private String nombreMedicamento;
    private int totalEstudiantes;
    private int totalAdministrativos;
    private int totalDocentes;
    private int total;
    
    
    public ReporteMedicamentosBean()
    {
    }

    public ReporteMedicamentosBean(String nombreMedicamento, int totalEstudiantes, 
            int totalAdministrativos, int totalDocentes, int total) 
    {
        this.nombreMedicamento = nombreMedicamento;
        this.totalEstudiantes = totalEstudiantes;
        this.totalAdministrativos = totalAdministrativos;
        this.totalDocentes = totalDocentes;
        this.total = total;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }

    public int getTotalAdministrativos() {
        return totalAdministrativos;
    }

    public void setTotalAdministrativos(int totalAdministrativos) {
        this.totalAdministrativos = totalAdministrativos;
    }

    public int getTotalDocentes() {
        return totalDocentes;
    }

    public void setTotalDocentes(int totalDocentes) {
        this.totalDocentes = totalDocentes;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}// fin de la clase ReporteMedicamentosBean
