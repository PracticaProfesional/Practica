// @author QUINCHO

package negocio;

import java.sql.ResultSet;
import java.sql.SQLException;

import datos.OperacionesReporteMedicamentosBean;

public class NegocioReporteMedicamentosBean 
{
    public ResultSet obtenerDatosConsultaInventario(String fechaDesde, String fechaHasta) throws SQLException
    {
        OperacionesReporteMedicamentosBean operacionesReporteMedicamentosBean = new OperacionesReporteMedicamentosBean();
        return operacionesReporteMedicamentosBean.obtenerDatosConsultaInventario(fechaDesde, fechaHasta);
    }// fin del metodo obtenerDatosConsultaInventario
    
}// fin de la clase NegocioReporteMedicamentosBean
