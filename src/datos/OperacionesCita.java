
package datos;

import entidad.Cita;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesCita 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarCita(Cita objetoCita) 
    {
        objetoDeConexion = new Conexion();
       
        String datosCita = "'" + objetoCita.getEstado().obtenerEstadoNumero() + "'" + "," +  
                           "'" + objetoCita.getFechaConsulta() + "'" + "," +
                           "'" + objetoCita.getAnotaciones() + "'" + "," +
                           "'" + objetoCita.getHora() + "'" ;
       try{
           System.out.println(objetoCita.getAnotaciones().length() + objetoCita.getAnotaciones());
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarCita("+datosCita+")");
       }
       catch(SQLException e){
           e.printStackTrace();
       }
    }// fin del metodo insertarCita
        
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ConsultarFechaCita("+fecha+")");
        return rs;
    }
    
    public void actualizarCita(Cita actCita){
        objetoDeConexion = new Conexion();
        String datosCita = "'" + actCita.getEstado() +"'" + ","
                           + "'" + actCita.getFechaConsulta() +"'" +","
                           + "'" + actCita.getHora() + "'";
        try{     
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ActualizarCita("+datosCita+")");
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
    }
}// fin de la clase OperacionesCita
