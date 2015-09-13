package datos;

import java.sql.Statement;
//import entidad.Expediente;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author cooper15
 */
public class OperacionesExpedienteMedico {
    private Conexion objetoDeConexion;
    private Statement estado;
    public void insertarExpedienteMedico() throws SQLException{
        objetoDeConexion = new Conexion();
        String idAntecedentesPersonales;
        String idAntecedentesFam;
        String idPaciente;
        ObtenerUltimoId ultimoId = new ObtenerUltimoId();
        idAntecedentesPersonales = ultimoId.obtenerUltimoId("AntecedentesPersonales");
        idAntecedentesFam = ultimoId.obtenerUltimoId("AntecedentesFamiliares");
        idPaciente = ultimoId.obtenerUltimoId("Paciente");
        estado = objetoDeConexion.conectar().createStatement();
        String datosExpediente = "'"+idPaciente+"'"+","+"'"+idAntecedentesPersonales+"'"+","
                                +"'"+idAntecedentesFam+"'";
        estado.executeQuery("Call InsertarExpedienteMedico("+datosExpediente+")");
    }
    
    public ResultSet obtenerExpedientePaciente() throws SQLException{
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        ResultSet rs = estado.executeQuery("Call obtenerExpedientePaciente()");
        return rs;
    }
}