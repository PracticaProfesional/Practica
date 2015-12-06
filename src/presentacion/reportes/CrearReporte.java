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
    
    /**
     * Genera los reportes que contienen parámetros como requisitos para ser
     * ejecutados.
     * @param params Diccionario de parámetros.
     * @param ruta  Ruta donde se encuentra el archivo .jasper.
     */
    public void generarReporte(Map <String, Object>params, String ruta){
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
    
    /**
     * Genera el reporte especifico de medicamentos por paciente
     * el cual emplea JavaBeans para funcionar correctamente
     * @param ruta ruta donde se encuentra el archivo .jasper
     * @param fechaDesde fecha o intervalo inicial.
     * @param fechaHasta fecha o invervalo final.
     */
    public void generarReporteMedicamentosXPaciente(String ruta, String fechaDesde, String fechaHasta){
       try{
           ColeccionReporteMedicamentos objRM =  new ColeccionReporteMedicamentos();
           JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource
                    (objRM.cargarMedicamentosALaColeccionNoStatic(fechaDesde, fechaHasta));
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
