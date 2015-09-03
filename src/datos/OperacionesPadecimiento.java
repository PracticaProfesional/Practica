package datos;

import entidad.Padecimiento; // Cambiar a capa de negocios.
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesPadecimiento {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarPadecimiento(Padecimiento padecimiento){
        String datosPadecimiento = "'"+padecimiento.getNombrePadecimiento()+"'"+","
                                   +"'"+padecimiento.getDescripcion()+"'";
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call ("+datosPadecimiento+")");
            estado.close();
        }catch(SQLException e){
        }
    }
}