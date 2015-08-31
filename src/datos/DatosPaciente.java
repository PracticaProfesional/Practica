package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.Paciente;

public class DatosPaciente {
    
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarPaciente(Paciente objetoPaciente)
    {
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery(null);
            estado.close();
        }// fin de try
        catch (SQLException e)
        {
            
        }// fin de catch
    }// fin del metodo insertarPaciente
    
}// fin de la clase DatosPaciente
