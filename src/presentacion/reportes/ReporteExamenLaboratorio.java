package presentacion.reportes;

import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import negocio.NegocioConexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author cooper15
 */
public class ReporteExamenLaboratorio {
    JasperReport reporte;
    JasperPrint reporteFill;
    JRViewer panelVisor;
    NegocioConexion  nConexion;
    private final String ruta = "src/presentacion/reportes/ReporteExamenLaboratorio.jasper";
    
    public void generarReporte(Map params){
       try{
            nConexion = new NegocioConexion();
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reporteFill = JasperFillManager.fillReport(reporte, params,nConexion.conexion());
           
            visualizarReporteGenerado();
       }
       catch(JRException ex){
           System.err.println(ex.getMessage());
       }
    }

    private void visualizarReporteGenerado() throws HeadlessException {
        JDialog viewer = new JDialog(new JFrame(),"Vista previa del reporte", true);
        viewer.setSize(800,600);
        viewer.setLocationRelativeTo(null);
        JRViewer jrv = new JRViewer(reporteFill);
        viewer.getContentPane().add(jrv);
        viewer.setVisible(true);
    }
}