package entidad.enums;

/**
 * Este enumerado representa el sexo de un Paciente; Masculino, Femenino
 * @author cooper15
 * @version 1.0, 05/12/2015
 */
public enum SexoEnum {

    /**
     * Representa el sexo Masculino, valor 1
     */
    MASCULINO (1),

    /**
     * Representa el seco Femenino, valor 2
     */
    FEMENINO (2);
    final private int numero;

    /**
     * Obtiene el numero que representa el sexo; Masculino = 1, Femenino = 2  
     * @return un entero que representa el sexo
     */
    public int getSexo() {
        return numero;
    }
    
    private SexoEnum(int numero){
        this.numero = numero;
    }
    
}
