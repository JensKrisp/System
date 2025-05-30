/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ajdin
 */
public class LandDetaljer extends javax.swing.JFrame {

    private InfDB idb;
    private String aktuelltLand;

    /**
     * Creates new form LandDetaljer
     */
    public LandDetaljer(InfDB idb, String aktuelltLand) {
        initComponents();
        this.idb = idb;
        this.aktuelltLand = aktuelltLand;
        hamtaLabelLand();
        hamtaLandNamn();
        hamtaSprak();
        hamtaValuta();
        hamtaTidszon();
        hamtaPolitik();
        hamtaEkonomi();
        hamtaLid();

    }

    public void hamtaLabelLand() {
        String sqlFraga = "SELECT namn FROM land WHERE lid = " + aktuelltLand;
        try {
            String landNamn = idb.fetchSingle(sqlFraga);
            lblAktuelltLand.setText(landNamn);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaLid() {
        String sqlFraga = "SELECT lid FROM land where lid = " + aktuelltLand;
        try {
            String landLid = idb.fetchSingle(sqlFraga);
            tfLandID.setText(landLid);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaLandNamn() {
        String sqlFraga = "SELECT namn FROM land WHERE lid = " + aktuelltLand;
        try {
            String landNamn = idb.fetchSingle(sqlFraga);
            tfLandNamn.setText(landNamn);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaSprak() {
        String sqlFraga = "SELECT sprak from land WHERE lid = " + aktuelltLand;
        try {
            String landSprak = idb.fetchSingle(sqlFraga);
            tfLandSprak.setText(landSprak);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaValuta() {
        String sqlFraga = "SELECT valuta from land where lid = " + aktuelltLand;
        try {
            String landValuta = idb.fetchSingle(sqlFraga);
            tfLandValuta.setText(landValuta);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaTidszon() {
        String sqlFraga = "SELECT tidszon from land where lid = " + aktuelltLand;
        try {
            String landTid = idb.fetchSingle(sqlFraga);
            tfLandTid.setText(landTid);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaPolitik() {
        String sqlFraga = "SELECT politisk_struktur FROM land WHERE lid = " + aktuelltLand;
        try {
            String landPolitik = idb.fetchSingle(sqlFraga);
            tfLandPolitik.setText(landPolitik);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void hamtaEkonomi() {
        String sqlFraga = "SELECT ekonomi FROM land WHERE lid = " + aktuelltLand;
        try {
            String landEkonomi = idb.fetchSingle(sqlFraga);
            tfLandEkonomi.setText(landEkonomi);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfLandID = new javax.swing.JTextField();
        tfLandTid = new javax.swing.JTextField();
        tfLandEkonomi = new javax.swing.JTextField();
        tfLandNamn = new javax.swing.JTextField();
        tfLandSprak = new javax.swing.JTextField();
        tfLandPolitik = new javax.swing.JTextField();
        tfLandValuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRedigeraUppgifter = new javax.swing.JButton();
        lblAktuelltLand = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfLandID.setText("jTextField1");

        tfLandTid.setText("jTextField1");

        tfLandEkonomi.setText("jTextField1");

        tfLandNamn.setText("jTextField1");

        tfLandSprak.setText("jTextField1");

        tfLandPolitik.setText("jTextField1");

        tfLandValuta.setText("jTextField1");

        jLabel1.setText("Land-ID:");

        jLabel2.setText("Namn:");

        jLabel3.setText("Språk:");

        jLabel4.setText("Valuta:");

        jLabel5.setText("Tidszon:");

        jLabel6.setText("Politisk Struktur:");

        jLabel7.setText("Ekonomi:");

        btnRedigeraUppgifter.setText("Uppdatera");
        btnRedigeraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraUppgifterActionPerformed(evt);
            }
        });

        lblAktuelltLand.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfLandValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfLandSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfLandNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfLandID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLandPolitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLandEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLandTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRedigeraUppgifter))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAktuelltLand)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAktuelltLand)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLandID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLandTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLandNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLandPolitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLandEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLandSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLandValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnRedigeraUppgifter)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedigeraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraUppgifterActionPerformed

        String nyttLandNamn = tfLandNamn.getText();
        String nyttLandSprak = tfLandSprak.getText();
        String nyttLandValuta = tfLandValuta.getText();
        String nyttLandTidszon = tfLandTid.getText();
        String nyttLandPolitik = tfLandPolitik.getText();
        String nyttLandEkonomi = tfLandEkonomi.getText();
        
        try {
            String sql = "UPDATE land SET namn = '" + nyttLandNamn + "', sprak = '" + nyttLandSprak + "', valuta = '" + nyttLandValuta + "', tidszon = '" + nyttLandTidszon + "', politisk_struktur = '" + nyttLandPolitik + "', ekonomi = '" + nyttLandEkonomi + "' WHERE lid = " + aktuelltLand;
            idb.update(sql);
            JOptionPane.showMessageDialog(null, "Uppgifterna har uppdaterats");
        }
        catch  (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Något gick fel!: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRedigeraUppgifterActionPerformed

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
            java.util.logging.Logger.getLogger(LandDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandDetaljer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LandDetaljer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedigeraUppgifter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAktuelltLand;
    private javax.swing.JTextField tfLandEkonomi;
    private javax.swing.JTextField tfLandID;
    private javax.swing.JTextField tfLandNamn;
    private javax.swing.JTextField tfLandPolitik;
    private javax.swing.JTextField tfLandSprak;
    private javax.swing.JTextField tfLandTid;
    private javax.swing.JTextField tfLandValuta;
    // End of variables declaration//GEN-END:variables
}
