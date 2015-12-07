package datos;

import entidad.Vacuna;
import java.sql.Statement;
import java.sql.SQLException;
/**
 * Esta clase realiza las operaciones correspondientes a Vacuna en la base de datos
 * @author cooper15
 */
public class OperacionesVacuna {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta un registro en la Vacunas en la base de datos
     * @param vacuna de tipo vacuna que contiene los datos a insertar
     */
    public void insertarVacuna(Vacuna vacuna){
        objetoDeConexion = new Conexion();
        String datosVacuna = "'"+vacuna.getTipo()+"'"+','+"'"+vacuna.getFechaAplicacion()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarVacunas("+datosVacuna+")");
            estado.close();
        }
        catch(SQLException e){
        
        }
    }
}
