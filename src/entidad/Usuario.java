package entidad;

/**
 * Esta clase representa un Usuario
 * @author QUINCHO
 * @version 1.0, 04/12/2015
 */
public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private int tipoUsuario;
    private String id;

    /**
     * Obtiene el "id" del Usuario
     * @return un String que representa el "id" del Usuario
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el "id" del Usuario
     * @param id de tipo String que representa el "id" del Usuario
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Obtiene el "tipo" del Usuario
     * @return un String que representa el "tipo" del Usuario
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Establece el "tipo" del Usuario
     * @param tipoUsuario de tipo String que representa el "tipo" del Usuario
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    /**
     * Obtiene el "nombre de usuario" del Usuario
     * @return un String que representa el "nombre de usuario" del Usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el "nombre de usuario" del Usuario
     * @param nombreUsuario de tipo String que representa el "nombre de usuario" del Usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la "contraseña" del Usuario
     * @return un String que representa la "contraseña" del Usuario
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la "contraseña" del Usuarioo
     * @param contrasena de tipo String que representa la "contraseña" del Usuario
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
