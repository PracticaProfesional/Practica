
package negocio;
import entidad.Usuario;
import datos.OperacionesUsuario;
import java.sql.SQLException;
import java.util.LinkedList;

public class NegocioUsuario {
    OperacionesUsuario opUsuario = new OperacionesUsuario();
    public entidad.Usuario ObtenerIdUsuario (Usuario nuevoUsuario) throws SQLException{
        return opUsuario.ObtenerIdUsuario(nuevoUsuario);
    }
    
    public void insertarUsuario(entidad.Usuario nUsuario){
        opUsuario.insertarUsuario(nUsuario);
    }
    
    public LinkedList listaUsuarios(){
        return opUsuario.listaUsuarios();
    }
    
    public void actualizarUsuario(entidad.Usuario aUsuario){
        opUsuario.actualizarDatosUsuario(aUsuario);
    }
}
