
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
           System.out.println(e.getErrorCode() + e.getMessage());
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
        String datosCita = "'" + actCita.getEstado().obtenerEstadoNumero() +"'" + ","
                           + "'" + actCita.getFechaConsulta() +"'" +","
                           + "'" + actCita.getHora() + "'";
        try{     
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ActualizarEstadoCita("+datosCita+")");
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
    }
    
    public void eliminarCita(Cita eliCita){
        objetoDeConexion = new Conexion();
        String datosCita = "'" + eliCita.getHora() + "'" + "," 
                          +"'" + eliCita.getFechaConsulta() +"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call EliminarCita("+ datosCita +")");
        }
        catch(SQLException sqle){
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }
    }
    
    public void insertarCitaPaciente(String idCita, String idPaciente){
        objetoDeConexion = new Conexion();
        String datosCitaPaciente = "'" + idCita +"'" +","
                                  +"'" + idPaciente + "'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarCitaPaciente("+datosCitaPaciente+")");
        }
        catch(SQLException sqle){
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }
    }
}// fin de la clase OperacionesCita
