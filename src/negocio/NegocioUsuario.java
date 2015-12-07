
package negocio;
import entidad.Usuario;
import datos.OperacionesUsuario;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * Esta clase relaciona la clase OperacionesUsuario con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioUsuario {
    OperacionesUsuario opUsuario = new OperacionesUsuario();

    /**
     /**
     * Este método llama al método en la capa de datos  que obtiene el id(identificador)
     * de un registro de usuario en la base de datos
     * @param nuevoUsuario de tipo Usuario que representa el usuarioque se desea obtener
     * @return un Usuario que representa el usuario retornado por el método llamado 
     * @throws SQLException
     */
    public entidad.Usuario ObtenerIdUsuario (Usuario nuevoUsuario) throws SQLException{
        return opUsuario.ObtenerIdUsuario(nuevoUsuario);
    }
    
    /**
     * Este método llama al método en la capa de datos  que un usuario en la base de datos
     * @param nUsuario de tipo Usuario que representa los datos a insertar de usuario
     */
    public void insertarUsuario(entidad.Usuario nUsuario){
        opUsuario.insertarUsuario(nUsuario);
    }
    
    /**
     * Este método crea una lista enlazada de con los registros de usuarios retornados por el método llamado
     * @return un objeto LinkedList que representa un lista de usuarios
     */
    public LinkedList listaUsuarios(){
        return opUsuario.listaUsuarios();
    }
    
    /**
     * Actuliza un registro de usuario en la base de datos
     * @param aUsuario  de tipo Usuario que contiene los datos actualizados del registro
     */
    public void actualizarUsuario(entidad.Usuario aUsuario){
        opUsuario.actualizarDatosUsuario(aUsuario);
    }
}
