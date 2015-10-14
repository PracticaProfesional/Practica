package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Paciente; // Cambiar a capa de negocio

public class OperacionesPaciente {
    
    private Conexion objetoDeConexion = new Conexion() ;
    private Statement estado;
    
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
}// fin de la clase OperacionesPaciente
