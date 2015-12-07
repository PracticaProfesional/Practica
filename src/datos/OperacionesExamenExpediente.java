package datos;

import java.sql.Statement;

/**
 * Esta clase realiza las operaciones corresondientes a un Examen Médico, Scanneados
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class OperacionesExamenExpediente {
    private Conexion objetoDeConexion;
    private Statement estado;

    /**
     * Inserta los valores los valores en la tabla relacion ExamenFisico-
     * Expediente.
     * @param idExFis de tipo String que representa el id(identificador) de Examen Físico
     * @param idExp de tipó String que representa el id(identificador) de Expediente Médico
     */
    public void insertarRelacionExamenExpediente(String idExFis, String idExp){
        objetoDeConexion = new Conexion();
        try{
            String datos = "'"+idExFis+"'"+","+"'"+idExp+"'";
            estado  = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("call InsertarExFisicoExpediente("+datos+")");
        }
        catch(java.sql.SQLException e){
            System.out.print(e.getErrorCode() + e.getMessage());

        }
        
    }

    /**
     * Este metodo permite obtener los id presentes en la tabla ExamenFisico-Expediente
     * y que representan los rubros incluidos en la interfaz de examen físico.
     * @param idExpediente que representa el id(identificador) de Expediente Médico
     * @return un objeto ResultaSet que representa los registros obtenidos de la consulta
     */
        public java.sql.ResultSet obtenerIdExamenesMedicos(String idExpediente){
        objetoDeConexion = new Conexion();
        java.sql.ResultSet rs = null;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call obtenerIdExamenExpediente("+idExpediente+")");
        }
        catch(java.sql.SQLException e){
            System.out.println(e.getErrorCode()+e.getMessage());
        }
        return rs;
    }
}
