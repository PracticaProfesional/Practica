package datos;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import entidad.Paciente; // Cambiar a capa de negocio

/**
 * Esta clase realiza las operaciones correspondientes a un paciente en la base de datos
 * @author QUINCHO
 */
public class OperacionesPaciente {
    
    private Conexion objetoDeConexion = new Conexion() ;
    private Statement estado;
    
    /**
     * Inserta campos correspondientes a paciente en la base de datos
     * @param objetoPaciente de tipo Paciente que representa los datos a insertar
     */
    public void insertarPaciente(Paciente objetoPaciente)
    { 
        
        String datosPaciente = "'"+objetoPaciente.getNombrePaciente()+"'"+","+"'"+objetoPaciente.getApellido1()+"'"+","
                                +"'"+objetoPaciente.getApellido2()+"'"+","
                                +"'"+objetoPaciente.getSexo().getSexo()+"'"+","+"'"+objetoPaciente.getFechaNacimiento()+"'"+","
                                +"'"+objetoPaciente.getNacionalidad()+"'"+","+"'"+objetoPaciente.getIdentificacion()+"'"+","
                                +"'"+objetoPaciente.getTelefono()+"'"+","+"'"+objetoPaciente.getDireccion1()+"'"+","
                                +"'"+objetoPaciente.getDireccion2()+"'"+","+"'"+objetoPaciente.getEmail()+"'"+","
                                + "'" + objetoPaciente.getTipo().obtenerTipoNumero() + "'";
        
        try
        {
           estado = objetoDeConexion.conectar().createStatement();
           estado.executeQuery("Call InsertarPaciente("+datosPaciente+")");  
        }// fin de try
        catch (SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
    }// fin del metodo insertarPaciente

    /**
     * Obtiene los pacientes que tienen consulta en la fecha establecida
     * @param date de tipo String que representa la fecha
     * @return un objeto ResultSet que representa los registros retornados por la consulta
     */
    public java.sql.ResultSet obtenerPacientesConsulta(String date){
        String datos = "'"+date+"'";
        objetoDeConexion = new Conexion();
        java.sql.ResultSet rs = null;
        try{
            estado  = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call obtenerPacientesConsulta("+datos+")"); 
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode()+e.getMessage());
        }    
        return rs;
    }
    
    /**
     * Obtiene el id(identificador) de algún registro de paciente en la base de datos
     * @param cedulaPaciente de tipo String que representa la cedula del paciente
     * @return un String que representa el id(identificador) de un registro de paciente obtenido por la consulta
     */
    public String obtenerIdPaciente(String cedulaPaciente){
        objetoDeConexion = new Conexion();
        java.sql.ResultSet rs = null;
        String idPaciente = "";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call obtenerIdPaciente("+"'"+cedulaPaciente+"'"+")");
            while(rs.next())
                idPaciente = rs.getString("id");
            rs.close();
        }
        catch(SQLException sqle){
            System.err.println(sqle.getErrorCode() + sqle.getMessage());
        }
        return idPaciente;
    }
    
    /**
     * Obtiene los datos personales de un paciente de la base de datos, utilizando la cedula como parametro
     * @param cedulaPaciente de tipo String que representa la cedula de un paciente
     * @return un objeto ResultSet que representa los datos personales de un paciente
     */
    public ResultSet obtenerDatosPaciente(String cedulaPaciente) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs =  estado.executeQuery("Call ObtenerDatosPaciente ('" + cedulaPaciente + "')");
        return rs;
    }// fin del metodo obtenerDatosPaciente
    
}// fin de la clase OperacionesPaciente
