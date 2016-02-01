
package entidad;

/**
 *
 * @author QUINCHO
 */
public class ExpedientePadecimientosFamiliares 
{
    private int idPadecimiento;
    private int idExpediente;
    private String parentesco;
    private String descripcion;

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

    public String getParentesco() 
    {
        return parentesco;
    }// fin del metodo getParentesco

    public void setParentesco(String parentesco) 
    {
        this.parentesco = parentesco;
    }// fin del metodo setParentesco

    public String getDescripcion() 
    {
        return descripcion;
    }// fin del metodo getDescripcion

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }// fin del metodo setDescripcion
    
    
    
}// fin de la clase ExpedientePadecimientosFamiliares
