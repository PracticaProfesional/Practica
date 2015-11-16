// @author QUINCHO

package negocio;

import java.sql.ResultSet;
import java.sql.SQLException;

import datos.OperacionesReporteMedicamentosBean;

public class NegocioReporteMedicamentosBean 
{
    public ResultSet obtenerDatosConsultaInventario() throws SQLException
    {
        OperacionesReporteMedicamentosBean operacionesReporteMedicamentosBean = new OperacionesReporteMedicamentosBean();
        return operacionesReporteMedicamentosBean.obtenerDatosConsultaInventario();
    }// fin del metodo obtenerDatosConsultaInventario
    
}// fin de la clase NegocioReporteMedicamentosBean
