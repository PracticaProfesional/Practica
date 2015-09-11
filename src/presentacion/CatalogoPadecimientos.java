/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


/**
 *
 * @author Paula Yacira
 */
public class CatalogoPadecimientos extends javax.swing.JDialog {
    /**
     * Creates new form CatalogoPadecimientos
     */
    public CatalogoPadecimientos(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.taCardiopatia.setVisible(false);
        //this.taCardiopatia.setVisible(false);
        //this.taCardiopatia.setEnabled(false);
       // this.taEnfTiroides.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpOidos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlSordera = new javax.swing.JLabel();
        cbSordera = new javax.swing.JCheckBox();
        cbVertigo = new javax.swing.JCheckBox();
        jpOjos = new javax.swing.JPanel();
        jlMiopia = new javax.swing.JLabel();
        jlAstigmatismo = new javax.swing.JLabel();
        cbMiopia = new javax.swing.JCheckBox();
        cbAstigmatismo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbCancer = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcbCancer2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jcbCancer3 = new javax.swing.JComboBox();
        jcbCancer1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jpCorazon = new javax.swing.JPanel();
        jlPresionAlta = new javax.swing.JLabel();
        jlCardiopatía = new javax.swing.JLabel();
        cbPresionAlta = new javax.swing.JCheckBox();
        cbCardiopatia = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCardiopatia = new javax.swing.JTextArea();
        jpMetabolismo = new javax.swing.JPanel();
        jlPrediabetes = new javax.swing.JLabel();
        jlDiabetes = new javax.swing.JLabel();
        jlObesidad = new javax.swing.JLabel();
        jlSobrepeso = new javax.swing.JLabel();
        jlBajopeso = new javax.swing.JLabel();
        jlDislipidemia = new javax.swing.JLabel();
        cbDiabetes = new javax.swing.JCheckBox();
        cbSobrepeso = new javax.swing.JCheckBox();
        cbPrediabetes = new javax.swing.JCheckBox();
        cbBajopeso = new javax.swing.JCheckBox();
        cbObesidad = new javax.swing.JCheckBox();
        cbEnfTiroides = new javax.swing.JComboBox();
        cbDislipidemia = new javax.swing.JCheckBox();
        jlEnfTiroides = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEnfTiroides = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Padecimientos");

        jpOidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Oídos"));

        jLabel1.setText("Vertigo");

        jlSordera.setText("Sordera");

        javax.swing.GroupLayout jpOidosLayout = new javax.swing.GroupLayout(jpOidos);
        jpOidos.setLayout(jpOidosLayout);
        jpOidosLayout.setHorizontalGroup(
            jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOidosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbVertigo)
                .addGap(18, 18, 18)
                .addComponent(jlSordera)
                .addGap(18, 18, 18)
                .addComponent(cbSordera)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpOidosLayout.setVerticalGroup(
            jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlSordera, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cbSordera, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(jpOidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cbVertigo)
                .addComponent(jLabel1))
        );

        jpOjos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ojos"));

        jlMiopia.setText("Miopía");

        jlAstigmatismo.setText("Astigmatismo");

        javax.swing.GroupLayout jpOjosLayout = new javax.swing.GroupLayout(jpOjos);
        jpOjos.setLayout(jpOjosLayout);
        jpOjosLayout.setHorizontalGroup(
            jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOjosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlMiopia)
                .addGap(18, 18, 18)
                .addComponent(cbMiopia)
                .addGap(18, 18, 18)
                .addComponent(jlAstigmatismo)
                .addGap(18, 18, 18)
                .addComponent(cbAstigmatismo)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpOjosLayout.setVerticalGroup(
            jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOjosLayout.createSequentialGroup()
                .addGroup(jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlAstigmatismo)
                        .addComponent(cbAstigmatismo))
                    .addGroup(jpOjosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbMiopia)
                        .addComponent(jlMiopia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Enfermedades Gastrointestinales");

        jcbCancer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artritis", "Fibromialgia", "Lumbalgia", "Gonoartrosis", "Artrosis", "Otros" }));
        jcbCancer.setName("Cancer"); // NOI18N

        jLabel7.setText("Enfermedades Musculoesuqeleticas");

        jcbCancer2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gastritis", "Reflujo", "Colitis", "Estreñimiento", "Colelitiasis", "úlcera", "Hepatitis", "Pólipos", "otros" }));
        jcbCancer2.setName("Cancer"); // NOI18N

        jLabel8.setText("Enfermedades Mentales");

        jcbCancer3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ansiedad", "Depresión", "Esquizofrenia", "Alzhéimer", "Transtornos Alimenticios" }));
        jcbCancer3.setName("Cancer"); // NOI18N

        jcbCancer1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Piel", "Mama", "Pulmón", "Gastrico", "Tiroides", "Próstata", "Tiroides", "Colon", "Leucemia", "Melanoma", "Otros" }));
        jcbCancer1.setName("Cancer"); // NOI18N

        jLabel5.setText("Cáncer");

        jLabel10.setText("Enfermedades Neurológicas");

        jLabel13.setText("Enfermedades Pulmonares");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ECV", "Convulsiones", "Otros" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asma", "EPOC", "Bronquitis", "Otros" }));

        jLabel21.setText("Enfermedades Renales");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insuficiencia Renal", "Cálculos Renales", "Otros" }));

        jLabel12.setText("Adicciones");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alcoholismo", "Drogadicción", "Tabaquismo", "Otros" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCancer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCancer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel21)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jcbCancer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbCancer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpCorazon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Corazón"));

        jlPresionAlta.setText("Presión Alta");

        jlCardiopatía.setText("Cardiopatía");

        cbCardiopatia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soplo", "Infarto", "Arritmia", "Taquicardia", "Otros" }));
        cbCardiopatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCardiopatiaActionPerformed(evt);
            }
        });

        taCardiopatia.setColumns(20);
        taCardiopatia.setRows(5);
        taCardiopatia.setEnabled(false);
        jScrollPane1.setViewportView(taCardiopatia);

        javax.swing.GroupLayout jpCorazonLayout = new javax.swing.GroupLayout(jpCorazon);
        jpCorazon.setLayout(jpCorazonLayout);
        jpCorazonLayout.setHorizontalGroup(
            jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCorazonLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlPresionAlta)
                .addGap(18, 18, 18)
                .addComponent(cbPresionAlta)
                .addGap(18, 18, 18)
                .addComponent(jlCardiopatía)
                .addGap(18, 18, 18)
                .addComponent(cbCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCorazonLayout.setVerticalGroup(
            jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCorazonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPresionAlta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbPresionAlta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCorazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlCardiopatía)
                        .addComponent(cbCardiopatia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpCorazonLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jpMetabolismo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Metabolismo"));

        jlPrediabetes.setText("Prediabetes");

        jlDiabetes.setText("Diabetes");

        jlObesidad.setText("Obesidad");

        jlSobrepeso.setText("Sobrepeso");

        jlBajopeso.setText("Bajopeso");

        jlDislipidemia.setText("Dislipidemia");

        cbEnfTiroides.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hipotiroidismo", "Hipertiroidismo", "Tiroiditis", "Otros", " " }));

        jlEnfTiroides.setText("Enfermedades de la Tiroides");

        taEnfTiroides.setColumns(20);
        taEnfTiroides.setRows(5);
        taEnfTiroides.setEnabled(false);
        jScrollPane2.setViewportView(taEnfTiroides);

        javax.swing.GroupLayout jpMetabolismoLayout = new javax.swing.GroupLayout(jpMetabolismo);
        jpMetabolismo.setLayout(jpMetabolismoLayout);
        jpMetabolismoLayout.setHorizontalGroup(
            jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMetabolismoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMetabolismoLayout.createSequentialGroup()
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMetabolismoLayout.createSequentialGroup()
                                .addComponent(jlPrediabetes)
                                .addGap(18, 18, 18)
                                .addComponent(cbPrediabetes))
                            .addGroup(jpMetabolismoLayout.createSequentialGroup()
                                .addComponent(jlBajopeso)
                                .addGap(31, 31, 31)
                                .addComponent(cbBajopeso)))
                        .addGap(35, 35, 35)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDiabetes)
                            .addComponent(jlSobrepeso))
                        .addGap(45, 45, 45)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDiabetes)
                            .addComponent(cbSobrepeso)))
                    .addGroup(jpMetabolismoLayout.createSequentialGroup()
                        .addComponent(jlEnfTiroides)
                        .addGap(18, 18, 18)
                        .addComponent(cbEnfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMetabolismoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDislipidemia)
                            .addComponent(jlObesidad))
                        .addGap(18, 18, 18)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbObesidad)
                            .addComponent(cbDislipidemia))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMetabolismoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jpMetabolismoLayout.setVerticalGroup(
            jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMetabolismoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMetabolismoLayout.createSequentialGroup()
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPrediabetes)
                            .addComponent(cbPrediabetes)
                            .addComponent(jlDiabetes)
                            .addComponent(cbDiabetes))
                        .addGap(18, 18, 18)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBajopeso)
                            .addComponent(jlBajopeso)
                            .addComponent(jlSobrepeso)
                            .addComponent(cbSobrepeso))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEnfTiroides)
                            .addComponent(cbEnfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jpMetabolismoLayout.createSequentialGroup()
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbDislipidemia)
                            .addComponent(jlDislipidemia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpMetabolismoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlObesidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbObesidad, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        btnIngresar.setText("Ingresar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCorazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMetabolismo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpOidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpOjos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpOidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpOjos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpMetabolismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void cbCardiopatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCardiopatiaActionPerformed
        // TODO add your handling code here:
         
         if(cbCardiopatia.getSelectedItem().toString().equals("Otros")){
             taCardiopatia.setVisible(true); 
             taCardiopatia.setEnabled(true);
         }
    }//GEN-LAST:event_cbCardiopatiaActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoPadecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CatalogoPadecimientos dialog = new CatalogoPadecimientos(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox cbAstigmatismo;
    private javax.swing.JCheckBox cbBajopeso;
    private javax.swing.JComboBox cbCardiopatia;
    private javax.swing.JCheckBox cbDiabetes;
    private javax.swing.JCheckBox cbDislipidemia;
    private javax.swing.JComboBox cbEnfTiroides;
    private javax.swing.JCheckBox cbMiopia;
    private javax.swing.JCheckBox cbObesidad;
    private javax.swing.JCheckBox cbPrediabetes;
    private javax.swing.JCheckBox cbPresionAlta;
    private javax.swing.JCheckBox cbSobrepeso;
    private javax.swing.JCheckBox cbSordera;
    private javax.swing.JCheckBox cbVertigo;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbCancer;
    private javax.swing.JComboBox jcbCancer1;
    private javax.swing.JComboBox jcbCancer2;
    private javax.swing.JComboBox jcbCancer3;
    private javax.swing.JLabel jlAstigmatismo;
    private javax.swing.JLabel jlBajopeso;
    private javax.swing.JLabel jlCardiopatía;
    private javax.swing.JLabel jlDiabetes;
    private javax.swing.JLabel jlDislipidemia;
    private javax.swing.JLabel jlEnfTiroides;
    private javax.swing.JLabel jlMiopia;
    private javax.swing.JLabel jlObesidad;
    private javax.swing.JLabel jlPrediabetes;
    private javax.swing.JLabel jlPresionAlta;
    private javax.swing.JLabel jlSobrepeso;
    private javax.swing.JLabel jlSordera;
    private javax.swing.JPanel jpCorazon;
    private javax.swing.JPanel jpMetabolismo;
    private javax.swing.JPanel jpOidos;
    private javax.swing.JPanel jpOjos;
    private javax.swing.JTextArea taCardiopatia;
    private javax.swing.JTextArea taEnfTiroides;
    // End of variables declaration//GEN-END:variables
}
