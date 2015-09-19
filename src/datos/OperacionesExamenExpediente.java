package datos;

import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesExamenExpediente {
    private Conexion objetoDeConexion;
    private Statement estado;
    public void insertarRelacionExamenExpediente(String idExFis, String idExp){
        objetoDeConexion = new Conexion();
        try{
            String datos = "'"+idExFis+"'"+","+"'"+idExp+"'";
            estado  = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("call InsertarExFisicoExpediente("+datos+")");
        }
        catch(java.sql.SQLException e){
        }
        
    }
    // Obtiene los id de padecimientos en examen fisico que estan relacionados con un expediente.
    public java.sql.ResultSet obtenerIdExamenesMedicos(String idExpediente){
        objetoDeConexion = new Conexion();
        java.sql.ResultSet rs = null;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call obtenerIdExamenExpediente("+idExpediente+")");
        }
        catch(java.sql.SQLException E){
            
        }
        return rs;
    }
}
