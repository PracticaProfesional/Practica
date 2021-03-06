/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.reportes;

import java.util.Map;
import negocio.NegocioConexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Esta clase genera el reporte para el inventario
 * @author QUINCHO 
 * @version 1.0, 06/12/2015
 */
public class ReporteInventario {
    
    JasperReport reporte;
    JasperPrint reporteFill;
    JasperViewer visor;
    NegocioConexion  nConexion;
    private final String ruta = "src/presentacion/reportes/Inventario.jasper";
    
    /**
     * Este método se encarga de generar el reporte de inventario
     */
    public void generarReporte(){
       try{
           nConexion = new NegocioConexion();
           reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
           reporteFill = JasperFillManager.fillReport(reporte, null,nConexion.conexion());
           visor = new JasperViewer(reporteFill);
           visor.setVisible(true);
       }
       catch(JRException ex){
       }
    }
}
