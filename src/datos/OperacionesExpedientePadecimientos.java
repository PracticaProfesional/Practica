/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidad.ExpedientePadecimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza todas las operaciones correspodientes a la tabla expediente-padecimientos
 * @author QUINCHO
 */
public class OperacionesExpedientePadecimientos 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarExpedientePadecimientos(ExpedientePadecimientos objExpedientePadecimientos)
    {
        objetoDeConexion = new Conexion();
       
        try
        {
            String datosExpPad = objExpedientePadecimientos.getIdPadecimiento() + "," + 
                                 objExpedientePadecimientos.getIdExpediente()+ "," +
                                 "'"+ objExpedientePadecimientos.getTratamiento() + "'" + "," +
                                 "'" + objExpedientePadecimientos.getMedicamento()+ "'";
            
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarExpedientePadecimientos("+datosExpPad+")");
            estado.close();
        }// fin del try
        catch(java.sql.SQLException e)
        {
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin del catch
        
    }// fin del metodo insertarExpedientePadecimientos
    
    public ResultSet listarPadecimientosPersonales(String idExpedientePaciente) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ListarPadecimientosPersonales (" + idExpedientePaciente + ")");
        return rs;
    }// fin del metodo listarPadecimientosFamiliares
    
    public void eliminarPadecimientoPersonal(String id)
    {
        objetoDeConexion = new Conexion();
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call EliminarPadecimientosPersonales (" + id + ")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo eliminarPadecimientoPersonal
    
}// fin de la clase OperacionesExpedientePadecimientos
