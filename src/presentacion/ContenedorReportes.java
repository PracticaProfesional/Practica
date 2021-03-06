/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import presentacion.reportes.ReporteMinisterioSalud;
import presentacion.reportes.CrearReporte;
import presentacion.reportes.ReporteInventario;

/**
 *
 * @author cooper15
 */
public class ContenedorReportes extends javax.swing.JPanel {
    private JFrame parent;
    /**
     * Creates new form ContenedorReportes
     */
    public ContenedorReportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dtChDesde = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        dtChHasta = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistReports = new javax.swing.JList();
        btnGenerarReporte = new javax.swing.JButton();

        setName(""); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Reportes"));

        jLabel3.setText("Cédula");

        textCedula.setEnabled(false);

        jLabel4.setText("Desde");

        dtChDesde.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(85, 85, 85),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(85, 85, 85),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(85, 85, 85),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(85, 85, 85),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dtChDesde.setCalendarBackground(new java.awt.Color(254, 254, 254));
    dtChDesde.setEnabled(false);

    jLabel5.setText("Hasta");

    dtChHasta.setEnabled(false);

    jlistReports.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "Ministerio de Salud", "Consultas Médicas", "Inventario", "Medicamentos por paciente", "Historial clínico", "Laboratorio y gabinete" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jlistReports.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jlistReportsValueChanged(evt);
        }
    });
    jScrollPane1.setViewportView(jlistReports);

    btnGenerarReporte.setText("Generar reporte");
    btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGenerarReporteActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(btnGenerarReporte)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(dtChDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(dtChHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dtChDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dtChHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addComponent(btnGenerarReporte)
            .addContainerGap(177, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(52, 52, 52)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(72, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(40, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jlistReportsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlistReportsValueChanged
        switch(jlistReports.getSelectedIndex()){
            case 0:
                dtChDesde.setEnabled(true);
                dtChHasta.setEnabled(true);
                textCedula.setEnabled(false);
                break;
                
            case 1:
                dtChDesde.setEnabled(true);
                dtChHasta.setEnabled(true);
                textCedula.setEnabled(true);
                break;
                
            case 2:
                dtChDesde.setEnabled(false);
                dtChHasta.setEnabled(false);
                textCedula.setEnabled(false);
                break;
                
            case 3:
                dtChDesde.setEnabled(false);
                dtChHasta.setEnabled(false);
                textCedula.setEnabled(false);
                break;
                
            case 4:
                dtChDesde.setEnabled(false);
                dtChHasta.setEnabled(false);
                textCedula.setEnabled(true);
                break;
                
            case 5:
                dtChDesde.setEnabled(false);
                dtChHasta.setEnabled(false);
                textCedula.setEnabled(true);
                break;
                
        }
    }//GEN-LAST:event_jlistReportsValueChanged

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        switch(jlistReports.getSelectedIndex()){
            case 0:
                reporteMS();
                break;
            case 1:
                reporteCitas();
                break;
            case 2:
                reporteInventario();
                break;
            case 3:
                CrearReporte objCR = new CrearReporte();
                objCR.generarReporteMedicamentosXPaciente(RUTA, obtenerFechaCalendario(dtChDesde), obtenerFechaCalendario(dtChHasta));
                break;
            case 4:
                reporteHistCli();
                break;
                
            case 5:
                java.util.Map<String, Object>dic = new HashMap<>();
                dic.put("cedula", textCedula.getText());
                objCR = new CrearReporte();
                objCR.generarReporte(dic, "src/presentacion/reportes/ReporteExamenLaboratorio.jasper");
                break;
            default: JOptionPane.showMessageDialog(this,
                                "No seleccionó ningún reporte", "Error"
                                ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed
    private static final String RUTA = "src/presentacion/reportes/ReporteMedicamentosPaciente.jasper";
    
    private void reporteHistCli(){
        final String ruta = "src/presentacion/reportes/HistorialClinico.jasper";
        /*String desde = obtenerFechaCalendario(dtChDesde);
        String hasta = obtenerFechaCalendario(dtChHasta);*/
        String cedula = textCedula.getText();
        java.util.Map<String, Object> dicc;
        dicc = new HashMap<>();
        dicc.put("pCedula",cedula);
        /*dicc.put("pFechaUno", desde);
        dicc.put("pFechaDos", hasta);*/
        CrearReporte nuevoRep = new CrearReporte();
        nuevoRep.generarReporte(dicc, ruta);
        
    }
    
    private void reporteMS() {
        ReporteMinisterioSalud reporte = new ReporteMinisterioSalud();
        String desde = obtenerFechaCalendario(dtChDesde);
        String hasta = obtenerFechaCalendario(dtChHasta);
        reporte.generarReporteMS(desde, hasta);
    }

    private void reporteCitas() {
        final String ruta = "src/presentacion/reportes/ReporteCitas.jasper";
        String desde = obtenerFechaCalendario(dtChDesde);
        String hasta = obtenerFechaCalendario(dtChHasta);
        String cedula = textCedula.getText();
        presentacion.reportes.CrearReporte rpc;
        rpc = new presentacion.reportes.CrearReporte();
        java.util.Map<String, Object> dicc;
        dicc = new HashMap<>();
        dicc.put("pCedula", cedula);
        dicc.put("pFechaUno", desde);
        dicc.put("pFechaDos", hasta);
        rpc.generarReporte(dicc, ruta);
    }
    
    private void reporteInventario()
    {
        final String ruta = "src/presentacion/reportes/Inventario.jasper";
        /*File objFile = new File(ruta);
        JOptionPane.showMessageDialog(null, objFile.getAbsolutePath());*/
        CrearReporte reporte = new CrearReporte();
        reporte.generarReporte(null, ruta);
    }// fin del metodo reporeteInventario
    
    private String obtenerFechaCalendario(datechooser.beans.DateChooserCombo dt) {
        int year = dt.getCurrent().get(Calendar.YEAR);
        int month = dt.getCurrent().get(Calendar.MONTH) + 1;
        int day = dt.getCurrent().get(Calendar.DAY_OF_MONTH);
        String fecha = year + "-" + month + "-" + day;
        return fecha;
    }
    
    private void setFechaDesde(){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(Calendar.SUNDAY, 0);
        dtChDesde.setSelectedDate(cal);
    }
    
    private void setFechaHasta(){
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(Calendar.DATE, 7);
        dtChHasta.setSelectedDate(calendar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private datechooser.beans.DateChooserCombo dtChDesde;
    private datechooser.beans.DateChooserCombo dtChHasta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlistReports;
    private javax.swing.JTextField textCedula;
    // End of variables declaration//GEN-END:variables
}
