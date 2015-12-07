package datos;

import entidad.Alergia; // Cambiar de entidad a negocio para establecer conexion
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clasre es utilizada para realizar todas las operaciones necesarias en la base de datos correspondiente a Alergia
 * @author cooper15
 * @version 1.0, 05/12/2015
 */
public class OperacionesAlergia {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondietes a Alergia en la base de datos 
     * @param alergia de tipo Alergia que representa los datos de Alergia
     */
    public void insertarAlergia(Alergia alergia){
        objetoDeConexion = new Conexion();
        String datosAlergia = "'"+alergia.getNombreAlergia()+"'"+","+"'"+alergia.getDetalleAlergia()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarAlergias("+datosAlergia+")");
            estado.close();
        }
        catch(SQLException e){}
    }
}