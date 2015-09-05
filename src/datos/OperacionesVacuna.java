package datos;

import entidad.Vacunas;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author cooper15
 */
public class OperacionesVacuna {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insetarVacuna(Vacunas vacuna){
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
