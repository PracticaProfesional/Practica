
package datos;

import entidad.ConsultaMedica;
import java.sql.Statement;
import java.sql.SQLException;

public class OperacionesConsultaMedica 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
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
    
}// fin de la clase OperacionesConsultaMedica
