package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Paciente;

public class DatosPaciente {
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarPaciente(Paciente objetoPaciente)
    { 
        String datosPaciente = "'"+objetoPaciente.getNombrePaciente()+"'"+","+"'"+objetoPaciente.getApellido1()+"'"+","
                                +"'"+objetoPaciente.getSexo()+"'"+","+"'"+objetoPaciente.getFechaNacimiento()+"'"+","
                                +"'"+objetoPaciente.getNacionalidad()+"'"+","+"'"+objetoPaciente.getIdentificacion()+"'"+","
                                +"'"+objetoPaciente.getTelefono()+"'"+","+"'"+objetoPaciente.getDireccion1()+"'"+","
                                +"'"+objetoPaciente.getDireccion2()+"'"+","+"'"+objetoPaciente.getEmail()+"'";
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ("+datosPaciente+")");
            estado.close();
        }// fin de try
        catch (SQLException e)
        {
            
        }// fin de catch
    }// fin del metodo insertarPaciente
    
}// fin de la clase DatosPaciente
