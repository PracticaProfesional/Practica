// @author QUINCHO
package presentacion;

import entidad.Receta;
import negocio.NegocioReceta;
import negocio.NegocioObtenerUltimoId;
import negocio.NegocioConsultaMedica;
import negocio.NegocioInventario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ContenedorReceta extends javax.swing.JPanel 
{
    private String idExpediente;   // esta variable global se utiliza para pasar por parametro al procedimiento
                                   // almacenado para llevar a cabo la consulta 
    private String fechaActual;   // esta variable global se utiliza para pasar por parametro la fecha al 
                            // procedimiento almacenado y realizar la consulta
    DefaultTableModel modelo = new DefaultTableModel();
    int cantidades [];    // se guardaran las cantidades que estan en la tabla inventario de la base de datos
    
    
    public ContenedorReceta()
    {
        initComponents();
        txtNombre.setEnabled(false);  // inhabilitado
        txtFecha.setEnabled(false);   // inhabilitado
        cmbMedicamentos.removeAllItems();
        
        modelo.addColumn("Medicamento");
        modelo.addColumn("Cantidad");
        cargarMedicamentosEnComboBox();  // se cargan los medicamentos que estab en la BD
    }// fin del constructor de ContenedorReceta

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedicamentos = new javax.swing.JTable();
        cmbMedicamentos = new javax.swing.JComboBox();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaReceta = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Medicamento");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicamento", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tblMedicamentos);

        cmbMedicamentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicamentosActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidad)
                    .addComponent(cmbMedicamentos, 0, 253, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre ");

        jLabel5.setText("Fecha");

        jLabel6.setText("Receta");

        txaReceta.setColumns(20);
        txaReceta.setRows(5);
        jScrollPane2.setViewportView(txaReceta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtFecha)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicamentosActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        if ((! txaReceta.getText().isEmpty()) && (tblMedicamentos.getValueAt(0, 0) == null) )   // este if debe cambiar si se decide dejar el modelo por defecto vacio en la tabla y hacer la comparacion con tblMedicamentos.getRowCount == 0
        {
            // En caso de que solo se ingrese la receta y no se brinde medicamentos ejecuto el siguiente codigo
            if (idExpediente != null && fechaActual != null)
            {
                insertarReceta();
                insertarRecetaEnConsulta();
            }// fin del if
            
            else
                JOptionPane.showMessageDialog(null, "La receta no corresponde a ninguna consulta médica",
                        "Error", JOptionPane.ERROR_MESSAGE);
        }// fin del if
        
        else
        {
            if (txaReceta.getText().isEmpty() && tblMedicamentos.getValueAt(0, 0) != null)
            {
                // en caso de que solo de brinden medicamentos y no se realice la reseta ejecuto el siguiente codigo
                if (idExpediente != null && fechaActual != null)
                    insertarRecetaFisica();
                
                else
                    JOptionPane.showMessageDialog(null, "La receta no corresponde a ninguna consulta médica2",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }// fin del if
            
            else
            {
                if ((! txaReceta.getText().isEmpty()) && tblMedicamentos.getValueAt(0, 0) != null)
                {
                    if (idExpediente != null && fechaActual != null)
                    {
                        insertarReceta();
                        insertarRecetaEnConsulta();
                        insertarRecetaFisica();
                    }// fin del if
                    
                    else
                        JOptionPane.showMessageDialog(null, "La receta no corresponde a ninguna consulta médica3",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }// fin del if
                
                else
                    JOptionPane.showMessageDialog(null, "Debe ingresar la receta o los medicamentos a entregar",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }// fin del else
        //insertarRecetaFisica();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        obtenerReceta();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        cargarFilaEnTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        try
        {
            modelo.removeRow(tblMedicamentos.getSelectedRow());
            tblMedicamentos.setModel(modelo);
            
            if (tblMedicamentos.getRowCount() == 0)
                tblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {null, null},
                            {null, null},
                            {null, null},
                            {null, null}
                        },
                        new String [] {
                            "Medicamento", "Cantidad"
                        }
                ));
        }//fin del try
        catch(ArrayIndexOutOfBoundsException aioobe)
        {
            if (tblMedicamentos.getRowCount() != 4 || tblMedicamentos.getValueAt(0, 0) != null)
                JOptionPane.showMessageDialog(null, "Debe seleccionar el medicamento que desea remover",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            
            else
                JOptionPane.showMessageDialog(null, "No hay medicamentes para remover en la tabla",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
        }// fin del catch
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    public void cargarCamposDeTexto(String pacienteActual, String fechaActual, String idExpediente)
    {
        txtNombre.setText(pacienteActual);
        txtFecha.setText(fechaActual);
        this.idExpediente = idExpediente;  // inicializamos con el valor obtenido en el formulario Inicio
        this.fechaActual = fechaActual;   // inicializamo con el valor obtenido del formulario Inicio
    }// fin del metodo cargarCamposDeTexto
    
    private void insertarReceta ()
    {
        Receta nuevaReceta = new Receta();
        nuevaReceta.setDescripcion(txaReceta.getText());
        
        NegocioReceta objNegocioReceta = new NegocioReceta();
        objNegocioReceta.insertarReceta(nuevaReceta);
    }// fin del metodo insertarReceta
    
    private void insertarRecetaEnConsulta()
    {
        NegocioObtenerUltimoId ultimoId = new NegocioObtenerUltimoId();
        NegocioConsultaMedica objNegocioConsultaMedica = new NegocioConsultaMedica();
        
        String idReceta = ultimoId.obtenerUltimoId("Receta");
        objNegocioConsultaMedica.insertarRecetaEnConsulta(idExpediente, fechaActual, idReceta);
    }// fin del metodo insertarRecetaConsulta
    
    public void obtenerReceta()
    {
        NegocioReceta objNegocioReceta = new NegocioReceta();
        ResultSet rs;
        
        try
        {
            rs = objNegocioReceta.obtenerReceta("2");
            
            if (rs.next())
                txaReceta.setText(rs.getString("descripcion"));
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }// fin del catch
    }// fin del metodo obtenerReceta
    
    private void cargarMedicamentosEnComboBox()
    {
        NegocioInventario objNegocioInventario = new NegocioInventario();
        ResultSet rs;
        int contador = 0;  // para interara a tavez de de el arreglo cantidades
        cmbMedicamentos.addItem("Seleccione");
        
        try
        {
            rs = objNegocioInventario.listarMedicamentosInventario();
            
            rs.last();    // nos movemos a la ultimo fila obtenida en el ResultSet
            int filas = rs.getRow();    // obtenemos el numero de la fila (ultima)
            rs.beforeFirst();   // nos movemos antes de la primera fila obtenida en el ResultSet
  
            cantidades =  new int [filas];
            
            while(rs.next())
            {
                cmbMedicamentos.addItem(rs.getString("nombre"));
                cantidades[contador] = rs.getInt("cantidad");
                contador++;
            }// fin del while
            
            rs.close();
        }// fin del try
        catch (SQLException sqle)
        {
            System.out.println(sqle.getErrorCode()+ sqle.getMessage());
        }// fin del catch
    }// fin del metodo cargarMedicamentosEnComboBox
    
    public void cargarFilaEnTabla()
    {
        if ((cmbMedicamentos.getSelectedIndex() == 0) || txtCantidad.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Debe seleccionar un medicamento e ingresar la cantidad para agregar", 
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        
        else
        {
            if (cantidades[cmbMedicamentos.getSelectedIndex() - 1] < Integer.parseInt(txtCantidad.getText()))
                JOptionPane.showMessageDialog(null, "La cantidad debe se menor a " + cantidades[cmbMedicamentos.getSelectedIndex() -1] +
                        ", que es la cantidad en existencia", "Información", JOptionPane.INFORMATION_MESSAGE);
            
            else 
            {
                String fila [] = new String [2];
        
                fila [0] = cmbMedicamentos.getSelectedItem().toString(); // ingresa cada campo de el formulario en el arreglo
                fila [1] = txtCantidad.getText();   // para posteriormente ingresar el arreglo como una fila
        
                modelo.addRow(fila);
                tblMedicamentos.setModel(modelo);
        
                // Se limpian los campos despues de cada ingreso
                cmbMedicamentos.setSelectedIndex(0);
                txtCantidad.setText(null);
            }// fin del else
        }// fin del else
    }// fin del metodo cargarFilaEnTabla
    
    public void insertarRecetaFisica()
    {
        NegocioConsultaMedica objNegocioConsultaMedica = new NegocioConsultaMedica();
        NegocioInventario objNegocioInventario = new NegocioInventario();
        int filas = tblMedicamentos.getRowCount();
        
        for (int i = 0; i < filas; i++)
        {
            objNegocioConsultaMedica.insertarRecetaFisica(tblMedicamentos.getValueAt(i, 0).toString(),
                    tblMedicamentos.getValueAt(i, 1).toString());
            
            objNegocioInventario.descontarDelInventario(tblMedicamentos.getValueAt(i, 0).toString(), 
                    tblMedicamentos.getValueAt(i, 1).toString());
        }// fin del for
    }// fin del metodo insertarRecetaFisica
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cmbMedicamentos;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMedicamentos;
    private javax.swing.JTextArea txaReceta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}// fin de la clase ContenedorReceta
