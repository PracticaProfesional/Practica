// @author QUINCHO

package entidad.enums;

public enum EstadoConsultaMedicaEnum 
{
    COMPLETA (1),
    INCOMPLETA (2);
    
    private final int numero;
    
    private EstadoConsultaMedicaEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de EstadoConsultaMedicaEnum
    
    public int obtenerEstadoNumero()
    {
        return numero;
    }// fin del metodo obtenerEstadoNumero
    
}// fin del enumerado EstadoConsultaMedicaEnum
