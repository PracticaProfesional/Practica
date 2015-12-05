// @author QUINCHO

package entidad.enums;
 
/**
 * Este enumerado representa el estado de la Cita; Pendiente, Completada, Cancelada
 * @author QUINCHO
 * @version 1.0, 05/12/2015
 */
public enum EstadoCitaEnum 
{

    /**
     * Representa el estado Pendiente de una Cita, valor 1
     */
        Pendiente (1),    // 1

    /**
     * Representa el estado Completado de una Cita, valor 2
     */
        Completada (2),   // 2

    /**
     * Representa el estado Cancelado de una Cita, valor 3
     */
        Cancelada (3);    // 3
    
    private int numero;
    
    private EstadoCitaEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de EstadoCita
    
    /**
     * Obtiene el numero que representa el estado
     * @return un entero que representa el estado de la cita 
     */
    public int obtenerEstadoNumero()
    {
        return numero;
    }// fin del metodo obtenerEstadoNumero
    
}// fin de la clase EstadoCitaEnum
