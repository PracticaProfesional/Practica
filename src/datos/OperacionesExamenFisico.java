
package datos;

import java.sql.Statement;
import entidad.ExamenFisico;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesExamenFisico 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
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
    
}// fin de la clase OperacionesExamenFisico
