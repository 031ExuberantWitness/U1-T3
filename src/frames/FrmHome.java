package frames;

/*
Realiza un proyecto en NetBeans utilizando los siguientes componentes: 
JFrame*, JCheckBox*, JRadioButton*, JToggleButton*, JComboBox*, JTextField*, 
JOptionPane*. Debes usar al menos 1 de cada uno de la lista. Lo que realice el 
será decisión tuya, PERO DEBE FUNCIONAR.

*/

import java.awt.Color;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class FrmHome extends javax.swing.JFrame {
    private DefaultTableModel m;
    
    public FrmHome() {
        initComponents();
        m =(DefaultTableModel)tblAutomovil.getModel();
        
        txtAño.setBackground(new Color(0,0,0,0));
        txtPlacas.setBackground(new Color(0,0,0,0));
        cmbTipo.setBackground(new Color(0,0,0,0));
        cmbModelo.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        setIcon("/GFX/computer.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMarca = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomovil = new javax.swing.JTable();
        cmbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        cmbModelo = new javax.swing.JComboBox();
        lblModelo = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtPlacas = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        sepAño = new javax.swing.JSeparator();
        sepPlacas = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActivar = new javax.swing.JToggleButton();
        cbAlternar = new javax.swing.JCheckBox();
        rbToyota = new javax.swing.JRadioButton();
        rbNissan = new javax.swing.JRadioButton();
        rbFord = new javax.swing.JRadioButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAutomovil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Marca", "Modelo", "Año", "Placas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAutomovil.setEnabled(false);
        tblAutomovil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutomovilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutomovil);
        if (tblAutomovil.getColumnModel().getColumnCount() > 0) {
            tblAutomovil.getColumnModel().getColumn(0).setResizable(false);
            tblAutomovil.getColumnModel().getColumn(1).setResizable(false);
            tblAutomovil.getColumnModel().getColumn(2).setResizable(false);
            tblAutomovil.getColumnModel().getColumn(3).setResizable(false);
            tblAutomovil.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 290));

        cmbTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione tipo...", "Pickup", "SUV", "Van" }));
        cmbTipo.setBorder(null);
        cmbTipo.setOpaque(false);
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tipo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, -1));

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarca.setText("Marca:");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 40, -1));

        cmbModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione modelo...", "Corolla", "Supra", "Yaris", "Prius" }));
        cmbModelo.setBorder(null);
        cmbModelo.setOpaque(false);
        cmbModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbModeloItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 200, -1));

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Modelo:");
        getContentPane().add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 50, -1));

        lblAño.setText("Año:");
        getContentPane().add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 50, -1));

        txtAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAño.setBorder(null);
        txtAño.setOpaque(false);
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 200, 20));

        txtPlacas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPlacas.setBorder(null);
        txtPlacas.setOpaque(false);
        getContentPane().add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 200, 20));

        lblPlaca.setText("Placas:");
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 50, -1));
        getContentPane().add(sepAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 200, 10));
        getContentPane().add(sepPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 200, 10));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        btnSalir.setText("Info acerca de la app");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 180, -1));

        btnActivar.setText("Activar tabla");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        cbAlternar.setText("Alternar boton");
        cbAlternar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlternarActionPerformed(evt);
            }
        });
        getContentPane().add(cbAlternar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        bgMarca.add(rbToyota);
        rbToyota.setText("Toyota");
        getContentPane().add(rbToyota, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        bgMarca.add(rbNissan);
        rbNissan.setText("Nissan");
        getContentPane().add(rbNissan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        bgMarca.add(rbFord);
        rbFord.setSelected(true);
        rbFord.setText("Ford");
        getContentPane().add(rbFord, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GFX/Fondo.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            if(!validarCMB(cmbTipo))return;
            if(!validarCMB(cmbModelo))return;
            
            if(!validarEspacio(txtAño))return;
            if(!validartxtAño(txtAño, Integer.parseInt(txtAño.getText())))return;
            if(!validarEspacio(txtPlacas))return;
            if(!validarTXTPlaca(txtPlacas))return;
            
            llenarTabla(cmbTipo.getSelectedItem(), radioOption(), cmbModelo.getSelectedItem(), txtAño.getText(), txtPlacas.getText());
            limpiarEspacios();
        }catch(AutomovilException err){
            showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbModeloItemStateChanged
        setForeground(Color.black);
    }//GEN-LAST:event_cmbModeloItemStateChanged

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        setForeground(Color.black);
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        if(btnActivar.isSelected()){
            tblAutomovil.setEnabled(true);
        }else{
            tblAutomovil.setEnabled(false);
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void cbAlternarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlternarActionPerformed
        if(cbAlternar.isSelected()){
            btnSalir.setText("Salir");
            ckBkx = false;
        }else{
            btnSalir.setText("Info acerca de la app");
            ckBkx = true;
        }
    }//GEN-LAST:event_cbAlternarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ckBox(ckBkx);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblAutomovilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutomovilMouseClicked
        if(btnActivar.isSelected()){
            int res = JOptionPane.showConfirmDialog(this, "¿Desea borrar esta fila?");
            if(res == JOptionPane.OK_OPTION) m.removeRow(tblAutomovil.getSelectedRow());
        }else{
            
        }
    }//GEN-LAST:event_tblAutomovilMouseClicked
    boolean ckBkx = true;
    private void ckBox(boolean a){
        if(a){
            FrmInfo inFrm = new FrmInfo(this, true);
            inFrm.setVisible(true);
        }else{
            System.exit(0);
        }
    }
////////////////////////////////////////////////////////////////////////////////
///////////////Funciones cosmeticas/////////////////////////////////////////////
        private void setIcon(String Icon){
        try {
            setIconImage(ImageIO.read(getClass().getResource(Icon)));
        }
        catch (IOException exc) {
            showMessageDialog(this, exc);
        }
    }
////////////////////////////////////////////////////////////////////////////////
///////////////Funciones operativas/////////////////////////////////////////////
    private void llenarTabla(Object cmbTipo, Object cmbMarca, Object cmbModelo, String txtAño, String txtPlacas){
        Object cmbTipoItem = this.cmbTipo.getSelectedItem();
        Object cmbMarcaItem = radioOption();
        Object cmbModeloItem = this.cmbModelo.getSelectedItem();
        
        Object O[]=new Object[5];
        O[0]= cmbTipo;
        O[1]= cmbMarca;
        O[2]= cmbModelo;
        O[3]= txtAño;
        O[4]= txtPlacas;
        m.addRow(O);
        
        showMessageDialog(this.rootPane, "Daños registrados exitosamente...");
    }
    
    private String radioOption(){
        if(rbFord.isSelected()){
            return "Ford";
        }else if(rbNissan.isSelected()){
            return "Nissan";
        }else{
            return "Toyota";
        }
    }
    
    private void limpiarEspacios(){
        cmbTipo.setSelectedIndex(0);
        rbFord.setSelected(true);
        cmbModelo.setSelectedIndex(0);
        txtAño.setText("");
        txtPlacas.setText("");
        cmbTipo.requestFocus();
    }
    
////////////////////////////////////////////////////////////////////////////////
///////////////Funciones excepciones////////////////////////////////////////////
    private void validaAño(int e) throws AutomovilException{
        Calendar cal = Calendar.getInstance();
        int añoActual = cal.get(Calendar.YEAR)+1;
        if (e < 1900 || e > añoActual+1)throw new AutomovilException("Error: Año fuera de rango... (1900-" + añoActual + "");
    }
    
    private void validaEspacio(JTextField e) throws AutomovilException{
        if (e.getText().length()==0)throw new AutomovilException("Error: No deje la caja en blanco");
        
    }
    
    private void validaPlaca(JTextField e) throws AutomovilException{
        String cad = e.getText().toUpperCase();
        if(cad.length()<9 || cad.length()>9)throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        
        String A[] = cad.split("-");
        char B[] = new char[9];
        
        if(A.length<3 || A.length>3)throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        
        for (int i = 0; i < 3; i++) {
            if((cad.charAt(i)<65 || cad.charAt(i)>90))throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        }
        
        if(cad.charAt(3)!='-')throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        
        for (int i = 4; i < 6; i++) {
           if((cad.charAt(i)<48 || cad.charAt(i)>57))throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        }
        
        if(cad.charAt(6)!='-')throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        
        for (int i = 7; i < 9; i++) {
            if((cad.charAt(i)<48 || cad.charAt(i)>57))throw new AutomovilException("Error: Formato erroneo. (XYZ-00-00)");
        }
    }
    
    private void validaCMBIndex(JComboBox c) throws AutomovilException{
        if(c.getSelectedIndex()==0)throw new AutomovilException("Error: Seleccione alguna opcion del combobox: " + c.getName());
    }
    
    private boolean validarEspacio(JTextField c){
        try{
            validaEspacio(c);
        }catch (AutomovilException exc) {
            showMessageDialog(this, exc.getMessage());
            c.requestFocus();
            return false;
        }
        return true;
    }
    
    private boolean validarCMB(JComboBox c){
        try{
            validaCMBIndex(c);
        }catch (AutomovilException exc) {
            showMessageDialog(this, exc.getMessage());
            c.setForeground(new Color(204,0,0,0));
            c.requestFocus();
            return false;
        }
        return true;
    }
        
    private boolean validartxtAño(JTextField c, int e){
        try{
            validaAño(e);
        }catch (AutomovilException exc) {
            showMessageDialog(this, exc.getMessage());
            c.requestFocus();
            return false;
        }
        return true;
    }   
    
    private boolean validarTXTPlaca(JTextField c){
        try{
            validaPlaca(c);
        }catch (AutomovilException exc) {
            showMessageDialog(this, exc.getMessage());
            c.requestFocus();
            return false;
        }
        return true;
    }
////////////////////////////////////////////////////////////////////////////////
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMarca;
    private javax.swing.JToggleButton btnActivar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbAlternar;
    private javax.swing.JComboBox cmbModelo;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JRadioButton rbFord;
    private javax.swing.JRadioButton rbNissan;
    private javax.swing.JRadioButton rbToyota;
    private javax.swing.JSeparator sepAño;
    private javax.swing.JSeparator sepPlacas;
    private javax.swing.JTable tblAutomovil;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables
}
