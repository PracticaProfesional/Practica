// @author Paula Yacira
package presentacion;

import javax.swing.JComboBox;
import negocio.NegocioPadecimiento;

public class CatalogoPadecimientos extends javax.swing.JDialog
{
    String arreglo [] = new String [21];
    private int contador;  // contador de los padecimientos seleccionados
    
    public CatalogoPadecimientos(java.awt.Dialog parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        //this.taCardiopatia.setVisible(false);
        //this.taCardiopatia.setVisible(false);
        //this.taCardiopatia.setEnabled(false);
       // this.taEnfTiroides.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpOidos = new javax.swing.JPanel();
        chbSordera = new javax.swing.JCheckBox();
        chbVertigo = new javax.swing.JCheckBox();
        jpOjos = new javax.swing.JPanel();
        chbMiopia = new javax.swing.JCheckBox();
        chbAstigmatismo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbMusculoEsqueleticas = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbGastrointestinales = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbMentales = new javax.swing.JComboBox();
        cbCancer = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbNeurologicas = new javax.swing.JComboBox();
        cbPulmonares = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        cbRenales = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cbAdicciones = new javax.swing.JComboBox();
        txtEnfermedadesGastrointestinales = new javax.swing.JTextField();
        txtEnfermedadesMentales = new javax.swing.JTextField();
        txtEnfermedadesNeurologicas = new javax.swing.JTextField();
        txtEnfermedadesMusculoesqueleticas = new javax.swing.JTextField();
        txtEnfermedadesPulmonares = new javax.swing.JTextField();
        txtEnfermedadesRenales = new javax.swing.JTextField();
        txtCancer = new javax.swing.JTextField();
        txtAdicciones = new javax.swing.JTextField();
        jpCorazon = new javax.swing.JPanel();
        jlCardiopatía = new javax.swing.JLabel();
        chbPresionAlta = new javax.swing.JCheckBox();
        cbCardiopatia = new javax.swing.JComboBox();
        txtCardiopatia = new javax.swing.JTextField();
        jpMetabolismo = new javax.swing.JPanel();
        chbDiabetes = new javax.swing.JCheckBox();
        chbSobrepeso = new javax.swing.JCheckBox();
        chbPrediabetes = new javax.swing.JCheckBox();
        chbBajopeso = new javax.swing.JCheckBox();
        chbObesidad = new javax.swing.JCheckBox();
        cbEnfTiroides = new javax.swing.JComboBox();
        chbDislipidemia = new javax.swing.JCheckBox();
        jlEnfTiroides = new javax.swing.JLabel();
        txtTiroides = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Padecimientos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpOidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Oídos"));

        chbSordera.setText("Sordera");
        chbSordera.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chbVertigo.setText("Vértigo");
        chbVertigo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpOidosLayout = new javax.swing.GroupLayout(jpOidos);
        jpOidos.setLayout(jpOidosLayout);
        jpOidosLayout.setHorizontalGroup(
            jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbVertigo)
                .addGap(139, 139, 139)
                .addComponent(chbSordera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOidosLayout.setVerticalGroup(
            jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOidosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chbSordera)
                    .addComponent(chbVertigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpOjos.setBorder(javax.swing.BorderFactory.createTitledBorder("Ojos"));

        chbMiopia.setText("Miopía");
        chbMiopia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chbAstigmatismo.setText("Astigmatismo");
        chbAstigmatismo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpOjosLayout = new javax.swing.GroupLayout(jpOjos);
        jpOjos.setLayout(jpOjosLayout);
        jpOjosLayout.setHorizontalGroup(
            jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOjosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbMiopia)
                .addGap(169, 169, 169)
                .addComponent(chbAstigmatismo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOjosLayout.setVerticalGroup(
            jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOjosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chbMiopia)
                    .addComponent(chbAstigmatismo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros"));

        jLabel6.setText("Enfermedades Gastrointestinales");

        cbMusculoEsqueleticas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Artritis", "Fibromialgia", "Lumbalgia", "Gonoartrosis", "Artrosis", "Otros" }));
        cbMusculoEsqueleticas.setName("Cancer"); // NOI18N
        cbMusculoEsqueleticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMusculoEsqueleticasActionPerformed(evt);
            }
        });

        jLabel7.setText("Enfermedades Musculoesqueléticas");

        cbGastrointestinales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gastritis", "Reflujo", "Colitis", "Estreñimiento", "Colelitiasis", "Úlcera", "Hepatitis", "Pólipos", "Otros" }));
        cbGastrointestinales.setName("Cancer"); // NOI18N
        cbGastrointestinales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGastrointestinalesActionPerformed(evt);
            }
        });

        jLabel8.setText("Enfermedades Mentales");

        cbMentales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Esquizofrenia", "Ansiedad", "Depresión", "Alzhéimer", "Transtornos Alimenticios", "Otros" }));
        cbMentales.setName("Cancer"); // NOI18N
        cbMentales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMentalesActionPerformed(evt);
            }
        });

        cbCancer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Piel", "Mama", "Pulmón", "Gastrico", "Tiroides", "Próstata", "Tiroides", "Colon", "Leucemia", "Melanoma", "Otros" }));
        cbCancer.setName("Cancer"); // NOI18N
        cbCancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCancerActionPerformed(evt);
            }
        });

        jLabel5.setText("Cáncer");

        jLabel10.setText("Enfermedades Neurológicas");

        jLabel13.setText("Enfermedades Pulmonares");

        cbNeurologicas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Convulsiones", "ECV", "Otros" }));
        cbNeurologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNeurologicasActionPerformed(evt);
            }
        });

        cbPulmonares.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Asma", "EPOC", "Bronquitis", "Otros" }));
        cbPulmonares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPulmonaresActionPerformed(evt);
            }
        });

        jLabel21.setText("Enfermedades Renales");

        cbRenales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Insuficiencia Renal", "Cálculos Renales", "Otros" }));
        cbRenales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRenalesActionPerformed(evt);
            }
        });

        jLabel12.setText("Adicciones");

        cbAdicciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Alcoholismo", "Drogadicción", "Tabaquismo", "Otros" }));
        cbAdicciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdiccionesActionPerformed(evt);
            }
        });

        txtEnfermedadesGastrointestinales.setEditable(false);
        txtEnfermedadesGastrointestinales.setEnabled(false);

        txtEnfermedadesMentales.setEditable(false);
        txtEnfermedadesMentales.setEnabled(false);

        txtEnfermedadesNeurologicas.setEditable(false);
        txtEnfermedadesNeurologicas.setEnabled(false);
        txtEnfermedadesNeurologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnfermedadesNeurologicasActionPerformed(evt);
            }
        });

        txtEnfermedadesMusculoesqueleticas.setEditable(false);
        txtEnfermedadesMusculoesqueleticas.setEnabled(false);

        txtEnfermedadesPulmonares.setEditable(false);
        txtEnfermedadesPulmonares.setEnabled(false);

        txtEnfermedadesRenales.setEditable(false);
        txtEnfermedadesRenales.setEnabled(false);

        txtCancer.setEditable(false);
        txtCancer.setEnabled(false);

        txtAdicciones.setEditable(false);
        txtAdicciones.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMusculoEsqueleticas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGastrointestinales, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNeurologicas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMentales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnfermedadesMentales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesNeurologicas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesGastrointestinales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesMusculoesqueleticas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRenales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnfermedadesPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesRenales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(cbMentales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesMentales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(cbNeurologicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesNeurologicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(cbRenales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesRenales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(cbGastrointestinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesGastrointestinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(cbMusculoEsqueleticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedadesMusculoesqueleticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpCorazon.setBorder(javax.swing.BorderFactory.createTitledBorder("Corazón"));

        jlCardiopatía.setText("Cardiopatía");

        chbPresionAlta.setText("Presión Alta");
        chbPresionAlta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        cbCardiopatia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Taquicardia", "Soplo", "Infarto", "Arritmia", "Otros" }));
        cbCardiopatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCardiopatiaActionPerformed(evt);
            }
        });

        txtCardiopatia.setEditable(false);
        txtCardiopatia.setEnabled(false);

        javax.swing.GroupLayout jpCorazonLayout = new javax.swing.GroupLayout(jpCorazon);
        jpCorazon.setLayout(jpCorazonLayout);
        jpCorazonLayout.setHorizontalGroup(
            jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCorazonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbPresionAlta)
                .addGap(125, 125, 125)
                .addComponent(jlCardiopatía)
                .addGap(49, 49, 49)
                .addComponent(cbCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCorazonLayout.setVerticalGroup(
            jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCorazonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCardiopatía)
                    .addComponent(chbPresionAlta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMetabolismo.setBorder(javax.swing.BorderFactory.createTitledBorder("Metabolismo"));

        chbDiabetes.setText("Diabetes");
        chbDiabetes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chbDiabetes.setIconTextGap(13);

        chbSobrepeso.setText("Sobrepeso");
        chbSobrepeso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chbPrediabetes.setText("Prediabetes");
        chbPrediabetes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chbPrediabetes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chbPrediabetes.setIconTextGap(5);

        chbBajopeso.setText("Bajopeso");
        chbBajopeso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chbBajopeso.setIconTextGap(19);

        chbObesidad.setText("Obecidad");
        chbObesidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chbObesidad.setIconTextGap(19);

        cbEnfTiroides.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Hipotiroidismo", "Hipertiroidismo", "Tiroiditis", "Otros" }));
        cbEnfTiroides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnfTiroidesActionPerformed(evt);
            }
        });

        chbDislipidemia.setText("Dislipidemia");
        chbDislipidemia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jlEnfTiroides.setText("Enfermedades de la Tiroides");

        txtTiroides.setEditable(false);
        txtTiroides.setEnabled(false);

        javax.swing.GroupLayout jpMetabolismoLayout = new javax.swing.GroupLayout(jpMetabolismo);
        jpMetabolismo.setLayout(jpMetabolismoLayout);
        jpMetabolismoLayout.setHorizontalGroup(
            jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMetabolismoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbBajopeso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbPrediabetes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSobrepeso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbDiabetes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52)
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbObesidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbDislipidemia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(88, 88, 88)
                .addComponent(jlEnfTiroides)
                .addGap(62, 62, 62)
                .addComponent(cbEnfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jpMetabolismoLayout.setVerticalGroup(
            jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMetabolismoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chbPrediabetes)
                    .addComponent(chbDiabetes)
                    .addComponent(chbDislipidemia)
                    .addComponent(jlEnfTiroides)
                    .addComponent(cbEnfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbObesidad)
                        .addComponent(chbSobrepeso))
                    .addComponent(chbBajopeso))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnIngresar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpMetabolismo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jpOidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jpOjos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpCorazon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpOidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpOjos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMetabolismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void cbCardiopatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCardiopatiaActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbCardiopatia);
        txtCardiopatia.setEnabled(estado);
        txtCardiopatia.setEditable(estado);
    }//GEN-LAST:event_cbCardiopatiaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        obtenerNumeroPadecimientos();
        
        for (int i = 0; i < arreglo.length; i++)
            System.out.println("Padecimiento: " + arreglo[i]);
        this.dispose();
        //cargarIdsAArreglo();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cbMentalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMentalesActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbMentales);
        txtEnfermedadesMentales.setEnabled(estado);
        txtEnfermedadesMentales.setEditable(estado);
    }//GEN-LAST:event_cbMentalesActionPerformed

    private void txtEnfermedadesNeurologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnfermedadesNeurologicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermedadesNeurologicasActionPerformed

    private void cbNeurologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNeurologicasActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbNeurologicas);
        txtEnfermedadesNeurologicas.setEnabled(estado);
        txtEnfermedadesNeurologicas.setEditable(estado);
    }//GEN-LAST:event_cbNeurologicasActionPerformed

    private void cbGastrointestinalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGastrointestinalesActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbGastrointestinales);
        txtEnfermedadesGastrointestinales.setEnabled(estado);
        txtEnfermedadesGastrointestinales.setEditable(estado);
    }//GEN-LAST:event_cbGastrointestinalesActionPerformed

    private void cbMusculoEsqueleticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMusculoEsqueleticasActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbMusculoEsqueleticas);
        txtEnfermedadesMusculoesqueleticas.setEnabled(estado);
        txtEnfermedadesMusculoesqueleticas.setEditable(estado);
    }//GEN-LAST:event_cbMusculoEsqueleticasActionPerformed

    private void cbPulmonaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPulmonaresActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbPulmonares);
        txtEnfermedadesPulmonares.setEnabled(estado);
        txtEnfermedadesPulmonares.setEditable(estado);
    }//GEN-LAST:event_cbPulmonaresActionPerformed

    private void cbRenalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRenalesActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbRenales);
        txtEnfermedadesRenales.setEnabled(estado);
        txtEnfermedadesRenales.setEditable(estado);
    }//GEN-LAST:event_cbRenalesActionPerformed

    private void cbCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCancerActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbCancer);
        txtCancer.setEnabled(estado);
        txtCancer.setEditable(estado);
    }//GEN-LAST:event_cbCancerActionPerformed

    private void cbAdiccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdiccionesActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbAdicciones);
        txtAdicciones.setEnabled(estado);
        txtAdicciones.setEditable(estado);
    }//GEN-LAST:event_cbAdiccionesActionPerformed

    private void cbEnfTiroidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnfTiroidesActionPerformed
        
        boolean estado;
        estado = seleccionaCombo(cbEnfTiroides);
        txtTiroides.setEnabled(estado);
        txtTiroides.setEditable(estado);
    }//GEN-LAST:event_cbEnfTiroidesActionPerformed

    // Este metodo nos retorna el numero de padecimientos seleccionados para su posterior uso
    public void obtenerNumeroPadecimientos()
    { 
        if (chbVertigo.isSelected())
        {
            arreglo[contador] = "Vertigo";
            contador++;
        }// fin de if
        
        if (chbSordera.isSelected())
        {
            arreglo[contador] = "Sordera";
            contador++;
        }// fin de if
        
        if (chbMiopia.isSelected())
        {
            arreglo[contador] = "Miopia";
            contador++;
        }// fin de if
        
        if (chbAstigmatismo.isSelected())
        {
            arreglo[contador] = "Astigmatismo";
            contador++;
        }// fin de if
        
        if (chbPresionAlta.isSelected())
        {
            arreglo[contador] = "Presion Alta";
            contador++;
        }// fin de if
        
        if (cbCardiopatia.getSelectedIndex() != 0)  // combo box
        {
            arreglo[contador] = cbCardiopatia.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (chbPrediabetes.isSelected())
        {
            arreglo[contador] = "Pre-diabetes";
            contador++;
        }// fin de if
        
        if (chbDiabetes.isSelected())
        {
            arreglo[contador] = "Diabetes";
            contador++;
        }// fin de if
        
        if (chbDislipidemia.isSelected())
        {
            arreglo[contador] = "Dislipidemia";
            contador++;
        }// fin de if
        
        if (chbBajopeso.isSelected())
        {
            arreglo[contador] = "Bajo peso";
            contador++;
        }// fin de if
        
        if (chbSobrepeso.isSelected())
        {
            arreglo[contador] = "Sobre peso";
            contador++;
        }// fin de if
        
        if (chbObesidad.isSelected())
        {
            arreglo[contador] = "Obesidad";
            contador++;
        }// fin de if
        
        if (cbEnfTiroides.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbEnfTiroides.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbMentales.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbMentales.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbNeurologicas.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbNeurologicas.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbGastrointestinales.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbGastrointestinales.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbMusculoEsqueleticas.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbMusculoEsqueleticas.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbPulmonares.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbPulmonares.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbRenales.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbRenales.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbCancer.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbCancer.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        if (cbAdicciones.getSelectedIndex() != 0)
        {
            arreglo[contador] = cbAdicciones.getSelectedItem().toString();
            contador++;
        }// fin de if
        
        //return contador;
    }// fin del metodo obtnerNumeroPadecimientos
    
    // metodo para cargar  todos los id seleccionados en un arrglo
    public int [] cargarIdsAArreglo()
    {
        int arregloIds [] = new int [contador];
        NegocioPadecimiento objetoPadecimiento = new NegocioPadecimiento();
        
        for (int i = 0; i < arregloIds.length; i++)
        {
            arregloIds[i] = objetoPadecimiento.obtenerId(arreglo[i]);
        }// fin del for
        
        return arregloIds;
    }// fin del metodo obtenerIds
    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
            {
                public void run() 
                {
                    CatalogoPadecimientos dialog = new CatalogoPadecimientos(new javax.swing.JDialog(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                        {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent e) 
                            {
                                System.exit(0);
                            }// fin del metodo windowClosing
                        }// fin de la clase interna anonima
                    );// fin del metodo addWindowListener
                    
                    dialog.setVisible(true);               
                }// fin del metodo run
            }// fin de la clase interna anonima
        );// fin del metodo invokeLater
    }// fin del main
    
    public int obtenerContador()
    {
        return contador;
    }// fin del metodo obtenerContador

    public boolean seleccionaCombo(JComboBox comboGenerico)
    {
        String seleccionado;
        boolean retorno;
        
        seleccionado = comboGenerico.getSelectedItem().toString();
        
        if(seleccionado.equals("Otros"))
            retorno = true;
                    
        else
            retorno = false;
        
        return retorno;
    }// fin del metodo seleccionaCombo
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox cbAdicciones;
    private javax.swing.JComboBox cbCancer;
    private javax.swing.JComboBox cbCardiopatia;
    private javax.swing.JComboBox cbEnfTiroides;
    private javax.swing.JComboBox cbGastrointestinales;
    private javax.swing.JComboBox cbMentales;
    private javax.swing.JComboBox cbMusculoEsqueleticas;
    private javax.swing.JComboBox cbNeurologicas;
    private javax.swing.JComboBox cbPulmonares;
    private javax.swing.JComboBox cbRenales;
    private javax.swing.JCheckBox chbAstigmatismo;
    private javax.swing.JCheckBox chbBajopeso;
    private javax.swing.JCheckBox chbDiabetes;
    private javax.swing.JCheckBox chbDislipidemia;
    private javax.swing.JCheckBox chbMiopia;
    private javax.swing.JCheckBox chbObesidad;
    private javax.swing.JCheckBox chbPrediabetes;
    private javax.swing.JCheckBox chbPresionAlta;
    private javax.swing.JCheckBox chbSobrepeso;
    private javax.swing.JCheckBox chbSordera;
    private javax.swing.JCheckBox chbVertigo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlCardiopatía;
    private javax.swing.JLabel jlEnfTiroides;
    private javax.swing.JPanel jpCorazon;
    private javax.swing.JPanel jpMetabolismo;
    private javax.swing.JPanel jpOidos;
    private javax.swing.JPanel jpOjos;
    private javax.swing.JTextField txtAdicciones;
    private javax.swing.JTextField txtCancer;
    private javax.swing.JTextField txtCardiopatia;
    private javax.swing.JTextField txtEnfermedadesGastrointestinales;
    private javax.swing.JTextField txtEnfermedadesMentales;
    private javax.swing.JTextField txtEnfermedadesMusculoesqueleticas;
    private javax.swing.JTextField txtEnfermedadesNeurologicas;
    private javax.swing.JTextField txtEnfermedadesPulmonares;
    private javax.swing.JTextField txtEnfermedadesRenales;
    private javax.swing.JTextField txtTiroides;
    // End of variables declaration//GEN-END:variables




}
