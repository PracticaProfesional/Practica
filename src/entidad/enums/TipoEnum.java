// @author QUINCHO
 
package entidad.enums;

public enum TipoEnum
{
    Administrativo (1),   // 1
    Estudiante (2),       // 2
    Docente (3);          // 3
    
    private int numero;
    
    private TipoEnum(int numero)
    {
        this.numero = numero;
    }// fin del constructor de TipoEnum
    
    public int obtenerTipoNumero()
    {
        return numero;
    }// fin del metodo obtenerTipoNumero
    
}// fin de enumerado TipoEnum
