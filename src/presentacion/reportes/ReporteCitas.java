package presentacion.reportes;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;
import negocio.NegocioConexion;
import java.util.Map;
/**
 *
 * @author cooper15
 */
public class ReporteCitas {
    JasperReport reporte;
    JasperPrint reporteFill;
    JasperViewer visor;
    NegocioConexion  nConexion;
    private final String ruta = "src/presentacion/reportes/ReporteCitas.jasper";
    
    public void generarReporte(String fDesde, String fHasta, String cedula, Map params){
       try{
           nConexion = new NegocioConexion();
           reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
           reporteFill = JasperFillManager.fillReport(reporte, params,nConexion.conexion());
           visor = new JasperViewer(reporteFill);
           visor.setVisible(true);
       }
       catch(JRException ex){
       }
    }
}
