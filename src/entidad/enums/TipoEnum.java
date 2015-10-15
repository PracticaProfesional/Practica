// @author QUINCHO
 
package entidad.enums;

public enum TipoEnum
{
    ADMINISTRATIVO (1),   // 1
    ESTUDIANTE (2),       // 2
    DOCENTE (3);          // 3
    
    private final int numero;
    
    private TipoEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de TipoEnum
    
    public int obtenerTipoNumero()
    {
        return numero;
    }// fin del metodo obtenerTipoNumero
    
}// fin de enumerado TipoEnum
