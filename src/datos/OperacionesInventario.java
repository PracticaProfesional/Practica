// @author QUINCHO
 
package datos;

import entidad.Inventario;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesInventario 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    // El siguiente metodo lista el inventario existente
    public ResultSet listarInventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("SELECT * FROM ListarInventario");
        return rs;
    }// fin del metodo listarInventario
    
    // El siguiente metodo inserta existencias del inventario en la base de datos
    public void insertarInventario(Inventario nuevoInventario)
    {
        objetoDeConexion = new Conexion();
        
        String datosInventario = "'" + nuevoInventario.getNombre() + "'" + "," +
                                 nuevoInventario.getCantidad() + "," +
                                 "'" + nuevoInventario.getTamanio() + "'" + "," +
                                 "'" + nuevoInventario.getViaAdministracion() + "'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarInventario2 (" + datosInventario + ")");
            estado.close();
        }// fin del try
        catch (SQLException sqle)
        {
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }// fin del catch
        
    }// fin del metodo insertarInventario
    
    
}// fin de la clase OperacionesInventario
