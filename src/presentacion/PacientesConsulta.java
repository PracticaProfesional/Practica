/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.security.x509.PrivateKeyUsageExtension;

/**
 *
 * @author cooper15
 */
public class PacientesConsulta extends javax.swing.JDialog {

    /**
     * Creates new form PacientesConsulta
     */
    private String idExpedienteMedico;
    private String pacienteActual;
    private final int ID_EXPEDIENTE = 0;
    private final int ID_PACIENTE = 1;
    private final int ID_SIGNOS_VITALES = 5;

    public String getPacienteActual() {
        return pacienteActual;
    }

    public String getIdExpedienteMedico() {
        return idExpedienteMedico;
    }
    
    public PacientesConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesPacientesConsulta = new javax.swing.JPanel();
        btnPacientesConsultaAceptar = new javax.swing.JButton();
        btnPacientesConsultaCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        scrollTablaPacientesConsulta = new javax.swing.JScrollPane();
        tablaPacientesConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pacientes a consultar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnPacientesConsultaAceptar.setText("Aceptar");
        btnPacientesConsultaAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesConsultaAceptarActionPerformed(evt);
            }
        });

        btnPacientesConsultaCancelar.setText("Cancelar");
        btnPacientesConsultaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesConsultaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesPacientesConsultaLayout = new javax.swing.GroupLayout(panelBotonesPacientesConsulta);
        panelBotonesPacientesConsulta.setLayout(panelBotonesPacientesConsultaLayout);
        panelBotonesPacientesConsultaLayout.setHorizontalGroup(
            panelBotonesPacientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesPacientesConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPacientesConsultaAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnPacientesConsultaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotonesPacientesConsultaLayout.setVerticalGroup(
            panelBotonesPacientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesPacientesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesPacientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPacientesConsultaCancelar)
                    .addComponent(btnPacientesConsultaAceptar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);

        tablaPacientesConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTablaPacientesConsulta.setViewportView(tablaPacientesConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaPacientesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaPacientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/SIGOS/Practica/img/running.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelBotonesPacientesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotonesPacientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacientesConsultaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesConsultaCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnPacientesConsultaCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaPacientesConsulta();
    }//GEN-LAST:event_formWindowOpened

    private void btnPacientesConsultaAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesConsultaAceptarActionPerformed
        if(tablaPacientesConsulta.getSelectedRow() != -1){
            int filaSeleccionada = tablaPacientesConsulta.getSelectedRow();
            idExpedienteMedico = tablaPacientesConsulta.getValueAt(filaSeleccionada, 1).toString();
            pacienteActual = 
                    tablaPacientesConsulta.getValueAt(filaSeleccionada, 2).toString() 
                   +" "+tablaPacientesConsulta.getValueAt(filaSeleccionada, 3).toString()
                   +" "+tablaPacientesConsulta.getValueAt(filaSeleccionada, 4).toString();
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No selecciono ninguna fila",null,JOptionPane.WARNING_MESSAGE);
            
    }//GEN-LAST:event_btnPacientesConsultaAceptarActionPerformed
    private void cargarTablaPacientesConsulta(){
        String [] nombreColumnas = {"IdExpediente", "IdPaciente", "Nombre", "P.Apellido", "S.Apellido", "IdSignosVitales"};
        DefaultTableModel nuevoModeloTabla = new DefaultTableModel();
        tablaPacientesConsulta.setModel(nuevoModeloTabla);
        String fecha = obtenerFechaActual();
        
//        for(String nombre:nombreColumnas)
        for(int i = 0; i < 6; i++)
            nuevoModeloTabla.addColumn(nombreColumnas[i]);
        negocio.NegocioPaciente obtenerPacientesConsulta = new negocio.NegocioPaciente();
        try{
            java.sql.ResultSet rs = obtenerPacientesConsulta.obtenerPacientesConsulta(fecha);
            while(rs.next()){
                Object [] fila = new Object[6];
                for(int i = 0; i < 6; i++)
                    fila[i] =rs.getObject(i+1);
                nuevoModeloTabla.addRow(fila);
            }
        }
        catch(java.sql.SQLException e){
            
        }
        esconderColumnas(ID_EXPEDIENTE);
        esconderColumnas(ID_PACIENTE);
        esconderColumnas(ID_SIGNOS_VITALES);
    }
    private void esconderColumnas(int numColumna){
        tablaPacientesConsulta.getColumnModel().getColumn(numColumna).setMaxWidth(0);
        tablaPacientesConsulta.getColumnModel().getColumn(numColumna).setMinWidth(0);
        tablaPacientesConsulta.getColumnModel().getColumn(numColumna).setPreferredWidth(0);
    }
    private String obtenerFechaActual() {
        java.util.Calendar calendario = java.util.Calendar.getInstance();
        int day = calendario.get(java.util.Calendar.DAY_OF_MONTH);
        int month = calendario.get(java.util.Calendar.MONTH) + 1; // se le debe sumar 1 para obtener el mes actual
        int year = calendario.get(java.util.Calendar.YEAR);
        return year + "-" + month + "-" + day;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PacientesConsulta dialog = new PacientesConsulta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPacientesConsultaAceptar;
    private javax.swing.JButton btnPacientesConsultaCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBotonesPacientesConsulta;
    private javax.swing.JScrollPane scrollTablaPacientesConsulta;
    private javax.swing.JTable tablaPacientesConsulta;
    // End of variables declaration//GEN-END:variables
}
