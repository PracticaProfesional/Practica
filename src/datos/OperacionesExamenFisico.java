
package datos;

import java.sql.Statement;
import entidad.ExamenFisico;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase realiza las operaciones correspondientes a Examen Físco
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesExamenFisico 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondientes a Examen Físico en la base de datos
     * @param objetoExamenFisico de tipo ExamenFisico que representa los datos de un examen físico
     */
    public void insertarExamenFisico(ExamenFisico objetoExamenFisico) {
        objetoDeConexion = new Conexion();
       
        String datosExamenFisico = "'" + objetoExamenFisico.getCategoria() + "'" + "," + 
                                  "'" + objetoExamenFisico.getSubCategoria() + "'" + "," + 
                                  "'" + objetoExamenFisico.getDetalle() + "'"+","+
                                  "'"+objetoExamenFisico.getConsultaMedica()+"'";
       try{
           estado = objetoDeConexion.conectar().createStatement();
           estado.executeQuery("Call InsertarExamenFisico("+datosExamenFisico+")");
           estado.close();
       }
       catch(SQLException e){
           System.out.println(e.getErrorCode() + e.getMessage());
       }
       
    }// fin del metodo insertarExamenFisico
    
    /**
     * Este metodo permite obtener el identificador de algún registro de examen físco en la base de datos 
     * @param id de tipo String que reprsenta el id(identificador) del registro a consultar
     * @return un objeto ResulSet que represent los registros retornados por la consulta
     */
    public ResultSet obtenerExamenFisico(String id){
       objetoDeConexion = new Conexion();     
       ResultSet rs = null;
        try {
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("call ObtenerExamenFisico("+id+")");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesExamenFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet listarExamenFisicoPorConsulta (String idConsultaMedica) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarExamenFisicoPorConsulta (" + idConsultaMedica + ")");
        return rs;
    }// fin del metodo listarExamenFisicoPorConsulta
    
    
}// fin de la clase OperacionesExamenFisico
