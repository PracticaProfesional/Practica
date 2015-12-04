// @author QUINCHO

package datos;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesReporteMedicamentosBean 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public ResultSet obtenerDatosConsultaInventario(String fechaDesde, String fechaHasta) throws SQLException
    {
        ResultSet rs;
        String datos = "'" + fechaDesde + "'" + "," +
                       "'" + fechaHasta + "'";
        objetoDeConexion = new Conexion();
        
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ReporteDeMedicamentos(" + datos + ")");
        return rs;
    }// fin del metodo obtenerDatosConsulaInventario
    
    
}// fin de la clase OperacionesReporteMedicamentosBean
