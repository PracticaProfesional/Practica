package negocio;

import java.sql.ResultSet;
import java.sql.SQLException;

import datos.OperacionesReporteMedicamentosBean;

/**
 * Esta clase relaciona la clase OperacionesExamenFisico con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioReporteMedicamentosBean 
{

    /**
     * Este método llama al método en la capa de datos que obtiene el reporte de medicamentos
     * por paciente.
     * @param fechaDesde de tipo String que representa la fecha desde
     * @param fechaHasta de tipo String que representa la fecha hasta
     * @return un  objeto ResultSet que retorna los registros obetnido por el método llamado
     * @throws SQLException
     */
    public ResultSet obtenerDatosConsultaInventario(String fechaDesde, String fechaHasta) throws SQLException
    {
        OperacionesReporteMedicamentosBean operacionesReporteMedicamentosBean = new OperacionesReporteMedicamentosBean();
        return operacionesReporteMedicamentosBean.obtenerDatosConsultaInventario(fechaDesde, fechaHasta);
    }// fin del metodo obtenerDatosConsultaInventario
    
}// fin de la clase NegocioReporteMedicamentosBean
