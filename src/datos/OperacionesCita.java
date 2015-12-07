
package datos;

import entidad.Cita;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * Esta clase representa las operaciones correspondiente a Cita
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesCita 
{
    private Conexion objetoDeConexion;
    private Statement estado;
 
    /**
     * Inserta campos correspondientes a Cita en la base de datos
     * @param objetoCita de tipo Cita que represensta los datos de una cita
     */
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
        
    /**
     * Obtiene un registro de Cita de la base de datos por medio de la fecha 
     * @param fecha de String que representa la fecha de la Cita
     * @return un objeto ResultSet que representa los registros que genera la consulta
     * @throws SQLException 
     */
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ConsultarFechaCita("+fecha+")");
        return rs;
    }
    
    /**
     * Actualiza un registro de Cita en la base de datos
     * @param actCita de tipo Cita que representa el registro de cita a actualizar
     */
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
    
    /**
     * Elimina un registro de Cita de la base de datos
     * @param eliCita de tipo Cita que representa el registro de cita a eliminar
     */
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
    
    /**
     * Inserta campos correspondientes para realizar la asociación de una Cita con un Paciente
     * @param idCita de tipo String que representa el id(identificador) de Cita
     * @param idPaciente de tipo String que representa el id(identificador) de Paciente
     */
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
    
    public String idCitaPaciente(String fecha, String hora){
        objetoDeConexion = new Conexion();
        String datos = "'" + fecha + "'" + "," + "'" + hora + "'";
        ResultSet rs;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("call seleccionarCitaPaciente("+datos+")");
            while(rs.next())
                return rs.getString("id");
        }
        catch (SQLException sqle){
            System.err.println(sqle.getErrorCode() +  sqle.getMessage());
        }
        return "";
    }
}// fin de la clase OperacionesCita
