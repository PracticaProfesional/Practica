
package datos;

import entidad.ConsultaMedica;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesConsultaMedica 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarConsultaMedica(ConsultaMedica nuevaConsulta) 
    {   
        objetoDeConexion = new Conexion();
        try{
            String datosConsultaMedica = "'"+nuevaConsulta.getIdexpediente()+"'"+","+
                                     "'"+nuevaConsulta.getMotivoConsulta()+"'"+","+
                                     "'"+nuevaConsulta.getSintomaPaciente()+"'"+","+
                                     "'"+nuevaConsulta.getDiagnostico()+"'"+","+
                                     "'"+nuevaConsulta.getSignosVitales()+"'"+","+
                                     "'"+nuevaConsulta.getFecha()+"'"+","+
                                     "'"+nuevaConsulta.getMotivo2()+"'"+","+
                                     "'"+nuevaConsulta.getObservaciones()+"'";
        
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarConsultaMedica("+datosConsultaMedica+")");
            estado.close();
        
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
      
        
    }// fin del metodo insertarConsultaMedica
    public void actualizarConsultaMedica(String idExpediente, entidad.ConsultaMedica consultaMedica){
        objetoDeConexion = new Conexion();
        String datos = "'"+idExpediente+"'"+","+
                       "'"+consultaMedica.getDiagnostico()+"'"+","+
                       "'"+consultaMedica.getMotivo2()+"'"+","+
                       "'"+consultaMedica.getObservaciones()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call actualizarConsultaMedica("+datos+")");
            estado.close();
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode()+ e.getMessage());
        }
    }
}// fin de la clase OperacionesConsultaMedica
