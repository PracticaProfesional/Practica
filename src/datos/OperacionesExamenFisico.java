
package datos;

import java.sql.Statement;
import entidad.ExamenFisico;
import java.sql.SQLException;

public class OperacionesExamenFisico 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarExamenFisico(ExamenFisico objetoExamenFisico) throws SQLException
    {
        objetoDeConexion = new Conexion();
       
        String datosExamenFisico = "'" + objetoExamenFisico.getCategoria() + "'" + "," + 
                                  "'" + objetoExamenFisico.getSubCategoria() + "'" + "," + 
                                  "'" + objetoExamenFisico.getDetalle() + "'";
       
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarConsultaMedica("+datosExamenFisico+")");
        estado.close();
    }// fin del metodo insertarExamenFisico
    
}// fin de la clase OperacionesExamenFisico
