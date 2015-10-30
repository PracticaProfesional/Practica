
package datos;

import entidad.Receta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesReceta 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarReceta(Receta nuevaReceta)
    {
        objetoDeConexion = new Conexion();
       
        String datosReceta = "'" + nuevaReceta.getDescripcion() + "'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarReceta("+datosReceta+")");
            estado.close();
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }// fin del catch
    }// fin del metodo insertarReceta
    
    public ResultSet obtenerReceta(String id) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT descripcion FROM Receta WHERE id = " + id);
        return rs;
    }// findel metodo obtenerFechaConsulta
    
}// fin de la clase OperacionesReceta
