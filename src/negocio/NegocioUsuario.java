
package negocio;
import entidad.Usuario;
import datos.OperacionesUsuario;
import java.sql.SQLException;

public class NegocioUsuario {
    OperacionesUsuario opUsuario = new OperacionesUsuario();
    public entidad.Usuario ObtenerIdUsuario (Usuario nuevoUsuario) throws SQLException{
        return opUsuario.ObtenerIdUsuario(nuevoUsuario);
    }
    
}
