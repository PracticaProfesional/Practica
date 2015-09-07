package datos;

import entidad.Vacuna;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author cooper15
 */
public class OperacionesVacuna {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarVacuna(Vacuna vacuna){
        objetoDeConexion = new Conexion();
        String datosVacuna = "'"+vacuna.getTipo()+"'"+','+"'"+vacuna.getFechaAplicacion()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarVacunas)"+datosVacuna+")");
            estado.close();
        }
        catch(SQLException e){
        
        }
    }
}
