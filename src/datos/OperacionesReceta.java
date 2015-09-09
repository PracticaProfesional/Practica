
package datos;

import entidad.Receta;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesReceta 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarReceta(Receta objetoReceta) throws SQLException
    {
        objetoDeConexion = new Conexion();
       
        String datosCita = "'" + objetoReceta.getNombreMedicamento() + "'" + "," + 
                             "'" + objetoReceta.getCantidad() + "'";
       
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarCita("+datosCita+")");
        estado.close();
    }// fin del metodo insertarReceta
    
}// fin de la clase OperacionesReceta
