
package datos;

import entidad.ConsultaMedica;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesConsultaMedica 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarConsultaMedica(ConsultaMedica objetoConsultaMedica) throws SQLException
    {
        String idExpedienteMedico, idExamenFisico, idSignosVitales, idCita, idReceta;
        
        // objeto para llamar al ultimo registro(id) insertado en una tabla
        ObtenerUltimoId obtenerId = new ObtenerUltimoId();
  
        idExpedienteMedico = obtenerId.obtenerUltimoId("ExpedienteMedico");
        idExamenFisico = obtenerId.obtenerUltimoId("ExamenFisico");
        idSignosVitales = obtenerId.obtenerUltimoId("SignosVitales");
        idCita = obtenerId.obtenerUltimoId("Cita");
        idReceta = obtenerId.obtenerUltimoId("Receta");
         
        String datosConsultaMedica = "'" + idExpedienteMedico + "'" + "," + 
                                     "'" + idExamenFisico + "'" + "," + 
                                     "'" + objetoConsultaMedica.getMotivoConsulta() + "'" + "," +
                                     "'" + objetoConsultaMedica.getSintomaPaciente() + "'" + "," +
                                     "'" + objetoConsultaMedica.getDiagnostico() + "'" + "," +
                                     "'" + idSignosVitales + "'" + "," + "'" + idCita + "'" + "," +
                                     "'" + idReceta + "'";
        
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarConsultaMedica("+datosConsultaMedica+")");
        estado.close();
        
    }// fin del metodo insertarConsultaMedica
    
}// fin de la clase OperacionesConsultaMedica
