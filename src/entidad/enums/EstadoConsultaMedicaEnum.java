// @author QUINCHO

package entidad.enums;

public enum EstadoConsultaMedicaEnum 
{
    Completa (1),
    Incompleta (2);
    
    private int numero;
    
    private EstadoConsultaMedicaEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de EstadoConsultaMedicaEnum
    
    public int obtenerEstadoNumero()
    {
        return numero;
    }// fin del metodo obtenerEstadoNumero
    
}// fin del enumerado EstadoConsultaMedicaEnum
