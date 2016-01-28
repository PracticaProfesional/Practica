/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.OperacionesExpedienteMedico;
import java.sql.SQLException;
/**
 * Esta clase relaciona la clase OperacionesExpedeinteMedico con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioExpedienteMedico {

    /**
     * Este método llama al método en la capa de datos  que inserta un examen médico en la base de datos
     * @throws SQLException
     * @param alergias 
     */
    public void insertarExpedientMedico(String alergias) throws SQLException{
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        opExpediente.insertarExpedienteMedico(alergias);
    }
    
    /**
     * Este método llama al método en la capa de datos  que obtiene un examen médico  en la base de datos
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     * @throws SQLException
     */
    public java.sql.ResultSet obtenerExpedientePaciente() throws SQLException{
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        return opExpediente.obtenerExpedientePaciente();
    }
    
    /**
     * Este método llama al método en la capa de datos  que obtiene el id(identificador) de examen médico  en la base de datos
     * @param idPaciente de tipo String que representa el id(identificador) del paciente que se desea obtener el expediente médico
     * @return un String que representa el id(identificador) del expediente médico retornado por el método llamado 
     */
    public String obtenerIdExpedienteMedico(String idPaciente){
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        return opExpediente.obtenerIdExpedienteMedico(idPaciente);
    }
}
