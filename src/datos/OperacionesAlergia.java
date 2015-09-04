package datos;

import entidad.Alergia; // Cambiar de entidad a negocio para establecer conexion
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesAlergia {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarAlergia(Alergia alergia){
        String datosAlergia = "'"+alergia.getNombreAlergia()+"'"+","+"'"+alergia.getDetalleAlergia()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarAlergias("+datosAlergia+")");
            estado.close();
        }
        catch(SQLException e){}
    }
}