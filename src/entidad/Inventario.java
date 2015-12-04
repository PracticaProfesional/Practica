

package entidad;

/**
 * Esta clase representa el Inventario
 * @author QUINCHO
 * @version 1.0, 04/12/2015
 */
public class Inventario 
{
    private String nombre;
    private int cantidad;
    private String tamanio;
    private String viaAdministracion;

    /**
     * Obtiene el "nombre" del insumo a ingresar en el Inventario
     * @return un String que representa la "nombre" del insumo a ingresar en el Inventario
     */
    public String getNombre() {
        return nombre;
    }// fin del metodo getNombre

    /**
     * Establece el "nombre" del insumo a ingresar en el Inventario
     * @param nombre de tipo String que representa el "nombre" del insumo a ingresar en el Inventario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// fin del metodo seNombre

    /**
     * Obtiene la "cantidad" del insumo a ingresar en el Inventario
     * @return un entero que representa la "cantidad" del insumo a ingresar en el Inventario
     */
    public int getCantidad() {
        return cantidad;
    }// fin del metodo getCantidad

    /**
     * Establece la "cantidad" del insumo a ingresar en el Inventario
     * @param cantidad de tipo String que representa la "cantidad" del insumo a ingresar en el Inventario
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }// fin del metodo setCantidad

    /**
     * Obtiene el "tamaño" del insumo a ingresar en el Inventario
     * @return un String que representa la "tamaño" del insumo a ingresar en el Inventario
     */
    public String getTamanio() {
        return tamanio;
    }// fin del metodo getTamanio

    /**
     * Establece el "tamaño" del insumo a ingresar en el Inventario
     * @param tamanio de tipo String que representa  el "tamaño" del insumo a ingresar en el Inventario
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }// fin del metodo setTamanio

    /**
     * Obtiene la "vía de administración" del insumo a ingresar en el Inventario
     * @return un String que representa la "vía de administración" del insumo a ingresar en el Inventario
     */
    public String getViaAdministracion() {
        return viaAdministracion;
    }// fin del metodo getViaAdministracion

    /**
     * Establece la "vía de administración" del insumo a ingresar en el Inventario
     * @param viaAdministracion de tipo String que representa la "vía de administración" del insumo a ingresar en el Inventario
     */
    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }// fin del metodo setViaAdministracion
   
}// fin de la clase Inventario
