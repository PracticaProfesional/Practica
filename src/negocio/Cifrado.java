
package negocio;
import org.jasypt.util.password.BasicPasswordEncryptor;
/**
 *
 * @author cooper15
 */
public class Cifrado {

    /**
     * Realiza el cifra de la contraseña ingresada por el usuario
     * para ser posteriormente almacenada en la BD.
     * @param password
     * @return Retorna la contraseña cifrada
     */
    public String cifrarPassword(String password){
        String contrasena = password;
        BasicPasswordEncryptor cifrador  = new BasicPasswordEncryptor();
        contrasena = cifrador.encryptPassword(contrasena);
        return contrasena;
    }
    
    /**
     * Se encarga de hacer una comparación entre la contraseña ingresa en el 
     * formulario y la contraseña cifrada, presente en la BD.
     * @param pass
     * @param passBd
     * @return boolean true si la contraseña ingresada coincide con la contraseña
     * de la BD
     */
    public boolean coincidePassword(String pass, String passBd){
        BasicPasswordEncryptor verificador = new  BasicPasswordEncryptor();
        return verificador.checkPassword(pass, passBd);
    }
}
