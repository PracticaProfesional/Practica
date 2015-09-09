package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.AntecedenteFamiliar;
/**
 *
 * @author cooper15
 */
public class OperacionesAntecedentesFamiliares {
    private Conexion objetoDeConexion;
    private Statement estado;
    public void insertarAntecedentesFamiliares(AntecedenteFamiliar antecedenteFamiliar) throws SQLException{
        objetoDeConexion = new Conexion();
        String idPadecimientos;
        ObtenerUltimoId ultimoId = new ObtenerUltimoId();
        idPadecimientos = ultimoId.obtenerUltimoId("Padecimientos");
        estado = objetoDeConexion.conectar().createStatement();
        String datosAntecedentesFamiliares = "'"+idPadecimientos+"'"+","+"'"+antecedenteFamiliar.getParentezco()+"'";
        estado.executeQuery("Call InsertarAntecedentesFamiliares ("+datosAntecedentesFamiliares+")");
    }    
}
