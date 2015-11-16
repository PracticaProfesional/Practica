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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import presentacion.ColeccionReporteMedicamentos;

/**
 *
 * @author cooper15
 */
public class CrearReporte {
    JasperReport reporte;
    JasperPrint reporteFill;
    JRViewer panelVisor;
    NegocioConexion  nConexion;
    
    public void generarReporte(Map params, String ruta){
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
    
    public void generarReporte(String ruta){
       try{
           ColeccionReporteMedicamentos objRM =  new ColeccionReporteMedicamentos();
           JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(objRM.cargarMedicamentosALaColeccionNoStatic());
            nConexion = new NegocioConexion();
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reporteFill = JasperFillManager.fillReport(reporte, null,ds);
           
            visualizarReporteGenerado();
       }
       catch(JRException ex){
           System.err.println(ex.getMessage());
       }
    }
}
