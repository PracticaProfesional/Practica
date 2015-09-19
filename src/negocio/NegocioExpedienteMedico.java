/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.OperacionesExpedienteMedico;
import java.sql.SQLException;
/**
 *
 * @author cooper15
 */
public class NegocioExpedienteMedico {
    public void insertarExpedientMedico() throws SQLException{
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        opExpediente.insertarExpedienteMedico();
    }
    
    public java.sql.ResultSet obtenerExpedientePaciente() throws SQLException{
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        return opExpediente.obtenerExpedientePaciente();
    }
    
    public String obtenerIdExpedienteMedico(String idPaciente){
        OperacionesExpedienteMedico opExpediente = new OperacionesExpedienteMedico();
        return opExpediente.obtenerIdExpedienteMedico(idPaciente);
    }
}
