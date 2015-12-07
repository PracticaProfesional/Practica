package datos;

import java.sql.Statement;
//import entidad.Expediente;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 * Esta clase realiza las operaciones correspondientes a expendiente médico
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class OperacionesExpedienteMedico {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondientes a expediente médico en la base de datos
     * @throws SQLException
     */
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
    
    /**
     * Obtiene registro de expediente médico
     * @return un objeto de tipo ResultSet que representa o contiene la información correspondinte a la consulta
     * @throws SQLException
     */
    public ResultSet obtenerExpedientePaciente() throws SQLException{
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        ResultSet rs = estado.executeQuery("Call obtenerExpedientePaciente()");
        return rs;
    }
    
    /**
     * Obtiene el id de expediente medico que le corresponde a un paciente determinado.
     * @param idPaciente de tipo String que representa el id(identificador) del registro de paciente
     * @return un String que representa el id obtenido por la consulta
     */
    public String obtenerIdExpedienteMedico(String idPaciente){
        objetoDeConexion = new Conexion();
        String idExpediente = "";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            ResultSet rs = estado.executeQuery("call obtenerIdExpedienteMedico("+"'"+idPaciente+"'"+")");
             if(rs.next())
                idExpediente = rs.getString("id");
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
        return idExpediente;
    }
}