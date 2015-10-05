// @author QUINCHO

package entidad;
 
public enum EstadoCitaEnum 
{
    Pendiente (1),    // 1
    Completada (2),   // 2
    Cancelada (3);    // 3
    
    private int numero;
    
    private EstadoCitaEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de EstadoCita
    
    public int obtenerEstadoNumero()
    {
        return numero;
    }// fin del metodo obtenerEstadoNumero
    
}// fin de la clase EstadoCitaEnum
