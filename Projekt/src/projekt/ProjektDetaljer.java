/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekt;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.awt.Color;


/**
 *
 * @author jakobolofsson
 */
public class ProjektDetaljer extends javax.swing.JFrame {
    private InfDB idb;
    private String aktuelltProjekt;
    /**
     * Creates new form ProjektDetaljer
     */
    public ProjektDetaljer(InfDB idb, String aktuelltProjekt) {
        this.idb = idb;
        this.aktuelltProjekt = aktuelltProjekt;
        initComponents();
        tilldelaVardeCBStatus();
        tilldelaVardeCBPrioritet();
        hamtaLabelNamn();
        hamtaProjektNamn();
        hamtaPid();
        hamtaBeskrivning();
        hamtaStartdatum();
        hamtaSlutdatum();
        hamtaKostnad();
        hamtaStatus();
        hamtaPrioritet();
        hamtaProjektchef();
        hamtaLand();
       
        lblStatusUpdate.setVisible(false);
        lblStartdatumFelm.setVisible(false);
        lblSlutdatumFelm.setVisible(false);
        lblProjektchefFelm.setVisible(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPid = new javax.swing.JTextField();
        tfProjektnamn = new javax.swing.JTextField();
        tfBeskrivning = new javax.swing.JTextField();
        tfStartdatum = new javax.swing.JTextField();
        tfSlutdatum = new javax.swing.JTextField();
        tfKostnad = new javax.swing.JTextField();
        lblAktuelltProjektNamn = new javax.swing.JLabel();
        tfProjektchef = new javax.swing.JTextField();
        tfLand = new javax.swing.JTextField();
        btnRedigeraUppgifter = new javax.swing.JButton();
        lblPid = new javax.swing.JLabel();
        lblProjektnamn = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        lblKostnad = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPrioritet = new javax.swing.JLabel();
        lblProjektChef = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();
        lblStatusUpdate = new javax.swing.JLabel();
        lblStatusFelm = new javax.swing.JLabel();
        lblStartdatumFelm = new javax.swing.JLabel();
        lblSlutdatumFelm = new javax.swing.JLabel();
        lblPrioritetFelm = new javax.swing.JLabel();
        lblProjektchefFelm = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        cbPrioritet = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfPid.setText("jTextField1");

        tfProjektnamn.setText("jTextField2");
        tfProjektnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProjektnamnActionPerformed(evt);
            }
        });

        tfBeskrivning.setText("jTextField3");

        tfStartdatum.setText("jTextField4");

        tfSlutdatum.setText("jTextField5");

        tfKostnad.setText("jTextField6");

        lblAktuelltProjektNamn.setText("jLabel1");

        tfProjektchef.setText("jTextField9");

        tfLand.setText("jTextField10");

        btnRedigeraUppgifter.setText("Uppdatera");
        btnRedigeraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraUppgifterActionPerformed(evt);
            }
        });

        lblPid.setText("Projekt-ID:");

        lblProjektnamn.setText("Namn:");

        lblBeskrivning.setText("Beskrivning:");

        lblStartdatum.setText("Startdatum:");

        lblSlutdatum.setText("Slutdatum:");

        lblKostnad.setText("Kostnad:");

        lblStatus.setText("Status:");

        lblPrioritet.setText("Prioritet:");

        lblProjektChef.setText("Projektchef:");

        lblLand.setText("Land:");

        lblStatusUpdate.setText("jLabel1");

        lblStatusFelm.setText("Ej godkänd status");

        lblStartdatumFelm.setText("Fel datumformat: ÅÅÅÅ-MM-DD");

        lblSlutdatumFelm.setText("Fel datumformat: ÅÅÅÅ-MM-DD");

        lblPrioritetFelm.setText("Prioritet finns ej");

        lblProjektchefFelm.setText("Ej befintlig handläggare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAktuelltProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRedigeraUppgifter)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblProjektnamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblBeskrivning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblStartdatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblStartdatumFelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSlutdatumFelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblSlutdatum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKostnad)
                            .addComponent(lblStatus)
                            .addComponent(lblPrioritet)
                            .addComponent(lblProjektChef)
                            .addComponent(lblLand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStatusFelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfProjektchef)
                            .addComponent(tfKostnad)
                            .addComponent(tfLand, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lblProjektchefFelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrioritetFelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPrioritet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblStatusUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAktuelltProjektNamn)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPid)
                    .addComponent(lblKostnad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektnamn)
                    .addComponent(lblStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusFelm, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBeskrivning)
                    .addComponent(lblPrioritet)
                    .addComponent(cbPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrioritetFelm, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartdatum)
                    .addComponent(lblProjektChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartdatumFelm, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektchefFelm))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSlutdatum)
                    .addComponent(lblLand))
                .addGap(2, 2, 2)
                .addComponent(lblSlutdatumFelm, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnRedigeraUppgifter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusUpdate)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfProjektnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProjektnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProjektnamnActionPerformed

    private void btnRedigeraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraUppgifterActionPerformed
        String nyttProjektNamn = tfProjektnamn.getText();
        String nyttBeskrivning  = tfBeskrivning.getText();
        String nyttStartdatum = tfStartdatum.getText();
        String nyttSlutdatum = tfSlutdatum.getText();
        String nyttKostnad = tfKostnad.getText();
        String nyttStatus = cbStatus.getSelectedItem().toString();
        String nyttPrioritet = cbPrioritet.getSelectedItem().toString();
        String nyttProjektChef = tfProjektchef.getText();
        String nyttLand = tfLand.getText();
        
    boolean allaFaltOk = true;    

        try {
    if (!Validering.isValidDatum(nyttStartdatum) ){
       lblStartdatumFelm.setForeground(Color.RED); 
       lblStartdatumFelm.setVisible(true);
       allaFaltOk = false;
    }
   if(!Validering.isValidDatum(nyttSlutdatum)){
       lblSlutdatumFelm.setForeground(Color.RED);
       lblSlutdatumFelm.setVisible(true);
       allaFaltOk = false;
    }
  
    if(idb.fetchSingle("Select aid from handlaggare where aid=" +nyttProjektChef) == null){
        lblProjektchefFelm.setForeground(Color.RED); 
        lblProjektchefFelm.setVisible(true);
        allaFaltOk = false;
    }
    if (!allaFaltOk) {
            lblStatusUpdate.setText("Fel i formuläret, rätta fälten.");
            lblStatusUpdate.setForeground(Color.RED);
            lblStatusUpdate.setVisible(true);
            return;
    }
    
    lblStatusUpdate.setVisible(false);
    lblStartdatumFelm.setVisible(false);
    lblSlutdatumFelm.setVisible(false);
    lblProjektchefFelm.setVisible(false);  
    
    String sql1 = "UPDATE Projekt SET projektnamn = '" + nyttProjektNamn + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql1);

    String sql2 = "UPDATE Projekt SET beskrivning = '" + nyttBeskrivning + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql2);
    
    String sql3 = "UPDATE Projekt SET startdatum = '" + nyttStartdatum + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql3);
  
    String sql4 = "UPDATE Projekt SET slutdatum = '" + nyttSlutdatum + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql4);
    
    String sql5 = "UPDATE Projekt SET kostnad = '" + nyttKostnad + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql5);
    
    String sql6 = "UPDATE Projekt SET prioritet = '" + nyttPrioritet + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql6);
    
    String sql7 = "UPDATE Projekt SET projektchef = '" + nyttProjektChef + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql7);
    
    String sql8 = "UPDATE Projekt SET land = '" + nyttLand + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql8);
    
    String sql9 = "UPDATE Projekt SET status = '" + nyttStatus + "' WHERE pid = " + aktuelltProjekt;
    idb.update(sql9);
   
    
    //Uppdateringsstatus meddelande
    lblStatusUpdate.setText("Projekt uppdaterat!");
    lblStatusUpdate.setForeground(Color.GREEN);
    lblStatusUpdate.setVisible(true);

} catch (InfException ex) {
    lblStatusUpdate.setText("Fel vid uppdatering: " + ex.getMessage());
    lblStatusUpdate.setForeground(Color.RED);  
    lblStatusUpdate.setVisible(true);
    System.out.println(ex.getMessage());
}   
    }//GEN-LAST:event_btnRedigeraUppgifterActionPerformed

    public void hamtaLabelNamn(){
        String sqlFraga = "SELECT projektnamn FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblAktuelltProjektNamn.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
        
    public void hamtaProjektNamn(){
        String sqlFraga = "SELECT projektnamn FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        tfProjektnamn.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaPid(){
        String sqlFraga = "SELECT pid FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektPid = idb.fetchSingle(sqlFraga);
        tfPid.setText(projektPid);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
     public void hamtaBeskrivning(){
        String sqlFraga = "SELECT beskrivning FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektBeskrivning = idb.fetchSingle(sqlFraga);
        tfBeskrivning.setText(projektBeskrivning);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaStartdatum(){
        String sqlFraga = "SELECT startdatum FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektStartdatum = idb.fetchSingle(sqlFraga);
        tfStartdatum.setText(projektStartdatum);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaSlutdatum(){
        String sqlFraga = "SELECT slutdatum FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektSlutdatum = idb.fetchSingle(sqlFraga);
        tfSlutdatum.setText(projektSlutdatum);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaKostnad(){
        String sqlFraga = "SELECT kostnad FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektKostnad = idb.fetchSingle(sqlFraga);
        tfKostnad.setText(projektKostnad);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaStatus(){
        String sqlFraga = "SELECT status FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektStatus = idb.fetchSingle(sqlFraga);
        cbStatus.setSelectedItem(projektStatus);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
    public void hamtaPrioritet(){
        String sqlFraga = "SELECT prioritet FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektPrioritet = idb.fetchSingle(sqlFraga);
        cbPrioritet.setSelectedItem(projektPrioritet);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaProjektchef(){
        String sqlFraga = "SELECT projektchef FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektChef = idb.fetchSingle(sqlFraga);
        tfProjektchef.setText(projektChef);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaLand(){
        String sqlFraga = "SELECT land FROM projekt WHERE pid = "+aktuelltProjekt;
        try{
        String projektLand = idb.fetchSingle(sqlFraga);
        tfLand.setText(projektLand);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void tilldelaVardeCBStatus(){
        cbStatus.addItem("Planerat");
        cbStatus.addItem("Pågående");
        cbStatus.addItem("Avslutat");
    }
    
     public void tilldelaVardeCBPrioritet(){
        cbPrioritet.addItem("Låg");
        cbPrioritet.addItem("Medel");
        cbPrioritet.addItem("Hög");
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
            java.util.logging.Logger.getLogger(ProjektDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new ProjektDetaljer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedigeraUppgifter;
    private javax.swing.JComboBox<String> cbPrioritet;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel lblAktuelltProjektNamn;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblKostnad;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblPrioritetFelm;
    private javax.swing.JLabel lblProjektChef;
    private javax.swing.JLabel lblProjektchefFelm;
    private javax.swing.JLabel lblProjektnamn;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblSlutdatumFelm;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblStartdatumFelm;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusFelm;
    private javax.swing.JLabel lblStatusUpdate;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfKostnad;
    private javax.swing.JTextField tfLand;
    private javax.swing.JTextField tfPid;
    private javax.swing.JTextField tfProjektchef;
    private javax.swing.JTextField tfProjektnamn;
    private javax.swing.JTextField tfSlutdatum;
    private javax.swing.JTextField tfStartdatum;
    // End of variables declaration//GEN-END:variables
}
