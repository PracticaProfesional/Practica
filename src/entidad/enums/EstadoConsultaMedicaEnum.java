// @author QUINCHO

package entidad.enums;

/**
 * Este enumerado representa el estado de la Consulta Médica; Completa, Incompleta
 * @author QUINCHO
 * @version 1.0, 05/12/2015
 */
public enum EstadoConsultaMedicaEnum 
{

    /**
     * Representa el estado Completo de una Consulta Médica, valor 1
     */
    COMPLETA (1),

    /**
     * Representa el estado Incompleto de una Consulta Médica, valor 2
     */
    INCOMPLETA (2);
    
    private final int numero;
    
    private EstadoConsultaMedicaEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de EstadoConsultaMedicaEnum
    
    /**
     * Obtiene el numero que representa el estado
     * @return un entero que representa el estado de la Consulta Médica
     */
    public int obtenerEstadoNumero()
    {
        return numero;
    }// fin del metodo obtenerEstadoNumero
    
}// fin del enumerado EstadoConsultaMedicaEnum
