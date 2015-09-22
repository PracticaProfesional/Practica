
package datos;

import entidad.ConsultaMedica;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesConsultaMedica 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarConsultaMedica(ConsultaMedica nuevaConsulta) throws SQLException
    {
        String datosConsultaMedica = "'"+nuevaConsulta.getIdexpediente()+"'"+","+
                                     "'"+nuevaConsulta.getMotivoConsulta()+"'"+","+
                                     "'"+nuevaConsulta.getSintomaPaciente()+"'"+","+
                                     "'"+nuevaConsulta.getDiagnostico()+"'"+","+
                                     "'"+nuevaConsulta.getSignosVitales()+"'"+","+
                                     "'"+nuevaConsulta.getIdReceta()+"'"+","+
                                     "'"+nuevaConsulta.getFecha()+"'";
        
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarConsultaMedica("+datosConsultaMedica+")");
        estado.close();
        
    }// fin del metodo insertarConsultaMedica
    
}// fin de la clase OperacionesConsultaMedica
