
package datos;

import entidad.Cita;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesCita 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarCita(Cita objetoCita) throws SQLException
    {
        objetoDeConexion = new Conexion();
       
        String datosCita = "'" + objetoCita.getEstado() + "'" + "," + 
                           "'" + objetoCita.getFechaCreacion() + "'" + "," + 
                           "'" + objetoCita.getFechaConsulta() + "'" + "," +
                           "'" + objetoCita.getAnotaciones() + "'";
       
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarCita("+datosCita+")");
        estado.close();
    }// fin del metodo insertarCita
        
    public ResultSet obtenerFechaConsulta(String fecha) throws SQLException{
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ConsultarFechaCita("+fecha+")");
        return rs;
    }
}// fin de la clase OperacionesCita
