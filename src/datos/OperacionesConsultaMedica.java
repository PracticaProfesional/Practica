
package datos;

import entidad.ConsultaMedica;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** 
 * Esta clase representa las operaciones correspondientes a Consulta Médica
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesConsultaMedica 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta los campos correspondientes a Consulta Médica en la base de datos
     * @param nuevaConsulta de tipo ConsultaMedica que representa los datos de una Consulta Medica
     */
    public void insertarConsultaMedica(ConsultaMedica nuevaConsulta) 
    {   
        objetoDeConexion = new Conexion();
        try{
            String datosConsultaMedica = "'"+nuevaConsulta.getIdexpediente()+"'"+","+
                                     "'"+nuevaConsulta.getMotivoConsulta()+"'"+","+
                                     "'"+nuevaConsulta.getSintomaPaciente()+"'"+","+
                                     "'"+nuevaConsulta.getDiagnostico()+"'"+","+
                                     "'"+nuevaConsulta.getSignosVitales()+"'"+","+
                                     "'"+nuevaConsulta.getFecha()+"'"+","+
                                     "'"+nuevaConsulta.getMotivo2()+"'"+","+
                                     "'"+nuevaConsulta.getObservaciones()+"'"+","+
                                     "'"+nuevaConsulta.getNotaEnfermeria()+"'"+","+
                                     "'"+nuevaConsulta.getEstado().obtenerEstadoNumero()+"'";
        
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarConsultaMedica("+datosConsultaMedica+")");
            estado.close();
        
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
      
        
    }// fin del metodo insertarConsultaMedica
    
    /**
     * Actualiza un registro de Consulta Médica en la base de datos
     * @param idExpediente de tipo String que representa id(identificador) de Expediente Médico
     * @param consultaMedica de tipo ConsultaMedica que representa los datos a actualiar de la Consulta Médica
     * @param fecha de tipo String que representa la fecha
     */
    public void actualizarConsultaMedica(String idExpediente, entidad.ConsultaMedica consultaMedica, String fecha){
        objetoDeConexion = new Conexion();
        String datos = "'"+idExpediente+"'"+","+
                       "'"+consultaMedica.getDiagnostico()+"'"+","+
                       "'"+consultaMedica.getMotivo2()+"'"+","+
                       "'"+consultaMedica.getObservaciones()+"'"+","+
                       "'"+consultaMedica.getEstado().obtenerEstadoNumero()+"'"
                      +","+"'"+fecha+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call actualizarConsultaMedica("+datos+")");
            estado.close();
        }
        catch(SQLException e){
            System.out.println(e.getErrorCode()+ e.getMessage());
        }
    }// fin del metodo actualizarConsultaMedica
    
    /**
     * Inserta una receta detro de la Consulta Médica
     * @param idExpediente de tipo String que representa el id(identificador) de Expediente Médico
     * @param fecha de tipo String que representa la fecha
     * @param idReceta de tipo String que representa el id(identificador) de Receta
     */
    public void insertarRecetaEnConsulta(String idExpediente, String fecha, String idReceta)
    {
        objetoDeConexion = new Conexion();
        String datos = idExpediente + "," +
                       "'" + fecha + "'" + "," +
                       idReceta;
                       
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarRecetaEnConsulta (" + datos + ")");
            estado.close();
            objetoDeConexion.desconectar();
        }// fin del try
        catch (SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo insertaRecetaEnConsulta
    
    /**
     * Inserta los campos correspondientes de una receta físicas en la base de datos
     * @param nombreMedicamento de tipo String que representa el nombre del medicamento
     * @param cantidad de tipo String que representa la cantidad del medicamento
     */
    public void insertarRecetaFisica(String nombreMedicamento, String cantidad)
    {
        objetoDeConexion = new Conexion();
        String datos =  "'" + nombreMedicamento + "'" + "," +
                        cantidad;
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarConsultaInventario(" + datos + ")");
            estado.close();
            objetoDeConexion.desconectar();
        }// fin del try
        catch (SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
            // esta excepcion puede surgir al haber dos medicamentos en el inventario con el mismo nombre
        }// fin del catch
    }// fin del metodo insertarRecetaFisca
    
    public ResultSet listarConsultasPorPaciente(String idExpediente) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarConsultas (" + idExpediente + ")");
        return rs;
    }// fin del metodo listarConsultasPorPaciente
    
    public ResultSet obtenerDatosConsulta(String idConsultaMedica) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ObtenerDatosConsultaMedica (" + idConsultaMedica + ")");
        return rs;
    }// fin del metodo obtenerDatosConsulta
    
    
}// fin de la clase OperacionesConsultaMedica
