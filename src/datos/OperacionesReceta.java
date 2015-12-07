
package datos;

import entidad.Receta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza todas las operaciones correspondiente a receta
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesReceta 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta los campos correspondientes a receta en  la base de datos
     * @param nuevaReceta de tipo Receta que representa los datos a insertar de una receta
     */
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
    
    /**
     * Obtiene registros de receta en la base de datos
     * @param id que representa el id del registro de receta
     * @return un objeto ResultSet que representa los registros retornados por la consulta
     * @throws SQLException
     */
    public ResultSet obtenerReceta(String id) throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT descripcion FROM Receta WHERE id = " + id);
        return rs;
    }// findel metodo obtenerFechaConsulta
    
}// fin de la clase OperacionesReceta
