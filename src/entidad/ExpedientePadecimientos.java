
package entidad;

/**
 * Esta clase mapea la tabla expediente-padecimientos de la base de datos
 * @author QUINCHO
 */

public class ExpedientePadecimientos 
{
    private int idPadecimiento;
    private int idExpediente;
    private String tratamiento;
    private String medicamento;

    public int getIdPadecimiento() 
    {
        return idPadecimiento;
    }// fin del metodo getIdPadecimiento

    public void setIdPadecimiento(int idPadecimiento) 
    {
        this.idPadecimiento = idPadecimiento;
    }// fin del metodo setIdPadecimiento

    public int getIdExpediente() 
    {
        return idExpediente;
    }// fin del metodo getIdExpediente

    public void setIdExpediente(int idExpediente) 
    {
        this.idExpediente = idExpediente;
    }// fin del metodo setIdExpediente

    public String getTratamiento() 
    {
        return tratamiento;
    }// fin del metodo getTratamiento

    public void setTratamiento(String tratamiento) 
    {
        this.tratamiento = tratamiento;
    }// fin del metodo setTratamiento

    public String getMedicamento() 
    {
        return medicamento;
    }// fin del metodo getMedicamento

    public void setMedicamento(String medicamento)
    {
        this.medicamento = medicamento;
    }// fin del metodo setMedicamento
    
    
}// fin de la clase ExpedientePadecimientos
