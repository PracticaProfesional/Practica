
package negocio;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.password.BasicPasswordEncryptor;
/**
 *
 * @author cooper15
 */
public class Cifrado {
    public String cifrarPassword(String password){
        String contrasena = password;
        BasicPasswordEncryptor cifrador  = new BasicPasswordEncryptor();
        contrasena = cifrador.encryptPassword(contrasena);
        return contrasena;
    }
    
    public boolean coincidePassword(String pass, String passBd){
        BasicPasswordEncryptor verificador = new  BasicPasswordEncryptor();
        return verificador.checkPassword(pass, passBd);
    }
}
