
package datos;

import entidad.Cita;
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
    }// fin del metodo insertarExamenFisico
    
}// fin de la clase OperacionesCita
