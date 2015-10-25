// @author QUINCHO

package entidad;

public class Inventario 
{
    private String nombre;
    private int cantidad;
    private String tamanio;
    private String viaAdministracion;

    
    public String getNombre() {
        return nombre;
    }// fin del metodo getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// fin del metodo seNombre

    public int getCantidad() {
        return cantidad;
    }// fin del metodo getCantidad

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }// fin del metodo setCantidad

    public String getTamanio() {
        return tamanio;
    }// fin del metodo getTamanio

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }// fin del metodo setTamanio

    public String getViaAdministracion() {
        return viaAdministracion;
    }// fin del metodo getViaAdministracion

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }// fin del metodo setViaAdministracion
   
}// fin de la clase Inventario
