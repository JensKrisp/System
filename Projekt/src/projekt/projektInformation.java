/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekt;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author hsund
 */
public class projektInformation extends javax.swing.JFrame {
    private InfDB idb;
    private String ettProjekt;

    /**
     * Creates new form projektInformation
     */
    public projektInformation(InfDB idb, String ettProjekt) {
        this.idb = idb;
        this.ettProjekt = ettProjekt;
        initComponents();
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
    }
    
    public void hamtaProjektNamn(){
        String sqlFraga = "SELECT projektnamn FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblNamn.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
     public void hamtaPid(){
        String sqlFraga = "SELECT pid FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblProjektId.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaBeskrivning(){
        String sqlFraga = "SELECT beskrivning FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblBeskrivning.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaStartdatum(){
        String sqlFraga = "SELECT startdatum FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblStartdatum.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaSlutdatum(){
        String sqlFraga = "SELECT slutdatum FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblSlutdatum.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaKostnad(){
        String sqlFraga = "SELECT kostnad FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblKostnad.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaStatus(){
        String sqlFraga = "SELECT status FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblStatus.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
     
     public void hamtaPrioritet(){
        String sqlFraga = "SELECT prioritet FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblPrioritet.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaProjektchef(){
        String sqlFraga = "SELECT projektchef FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblProjektchef.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }
    
    public void hamtaLand(){
        String sqlFraga = "SELECT land FROM projekt WHERE pid = "+ettProjekt;
        try{
        String projektNamn = idb.fetchSingle(sqlFraga);
        lblLand.setText(projektNamn);
        }
        catch(InfException ex){
        System.out.println(ex.getMessage());
    } }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblProjektId = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblKostnad = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPrioritet = new javax.swing.JLabel();
        lblProjektchef = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Projekt-ID:");

        jLabel2.setText("Namn:");

        jLabel3.setText("Beskrivning:");

        jLabel4.setText("Startdatum:");

        jLabel5.setText("Slutdatum:");

        lblProjektId.setText("jLabel6");

        lblBeskrivning.setText("jLabel7");

        lblNamn.setText("jLabel8");

        lblStartdatum.setText("jLabel9");

        lblSlutdatum.setText("jLabel10");

        jLabel11.setText("Kostnad:");

        jLabel12.setText("Status:");

        jLabel13.setText("Prioritet:");

        jLabel14.setText("Projektchef:");

        jLabel15.setText("Land:");

        lblKostnad.setText("jLabel16");

        lblStatus.setText("jLabel17");

        lblPrioritet.setText("jLabel18");

        lblProjektchef.setText("jLabel19");

        lblLand.setText("jLabel20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblProjektId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBeskrivning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(lblStartdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProjektchef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrioritet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjektId)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(lblKostnad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeskrivning)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblPrioritet))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblNamn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStartdatum)
                    .addComponent(jLabel14)
                    .addComponent(lblProjektchef))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSlutdatum)
                    .addComponent(jLabel15)
                    .addComponent(lblLand))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(projektInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projektInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projektInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projektInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //
                //projektInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblKostnad;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblProjektId;
    private javax.swing.JLabel lblProjektchef;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
