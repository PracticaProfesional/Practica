// @author QUINCHO

package datos;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesReporteMedicamentosBean 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public ResultSet obtenerDatosConsultaInventario() throws SQLException
    {
        ResultSet rs;
        objetoDeConexion = new Conexion();
        
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ReporteDeMedicamentos()");
        return rs;
    }// fin del metodo obtenerDatosConsulaInventario
    
    
}// fin de la clase OperacionesReporteMedicamentosBean
