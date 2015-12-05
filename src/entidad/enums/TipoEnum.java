
 
package entidad.enums;

/**
 * Este enumerado representa el tipo de un Paciente; Administrativo, Estudiante, Docente
 * @author QUINCHO
 * @version 1.0, 05/12/2015
 */
public enum TipoEnum
{

    /**
     * Representa el tipo Administrativo, valor 1
     */
        ADMINISTRATIVO (1),   // 1

    /**
     * Representa el tipo Estudiante, valor 2
     */
        ESTUDIANTE (2),       // 2

    /**
     * Representa el tipo Docente, valor 3
     */
        DOCENTE (3);          // 3
    
    private final int numero;
    
    private TipoEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de TipoEnum
    
    /**
     * Obitene el numero que representa el tipo del Paciente
     * @return un entero que representa el tipo del Paciente; Administrativo, Estudiante, Docente
     */
    public int obtenerTipoNumero()
    {
        return numero;
    }// fin del metodo obtenerTipoNumero
    
}// fin de enumerado TipoEnum
