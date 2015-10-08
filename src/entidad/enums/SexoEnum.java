package entidad.enums;

/**
 *
 * @author cooper15
 */
public enum SexoEnum {
    MASCULINO (1),
    FEMENINO (2);
    final private int numero;

    public int getSexo() {
        return numero;
    }
    
    private SexoEnum(int numero){
        this.numero = numero;
    }
    
}
