/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekt;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author elisl
 */
public class HanteraProjektProjektledare extends javax.swing.JFrame {
InfDB idb;
String anvandarensAID;
int knappRaknareAktiva;
int knappRaknareAvslutade;
int knappRaknarePlanerade;
    /**
     * Creates new form HanteraProjektProjektledare
     */
    public HanteraProjektProjektledare(InfDB idb,String anvandarensAID) {
        this.idb = idb;
        this.anvandarensAID = anvandarensAID;
        knappRaknareAktiva = 0;
        knappRaknareAvslutade = 0;
        knappRaknarePlanerade = 0;
        initComponents();
        listaProjektJagLeder();
    }
 public void totalKostnadAktiva(){
 String sqlFraga = "Select sum(kostnad) from projekt where status = 'Pågående' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina aktiva projekt kostar sammanlagt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några aktiva projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
 public void maxKostnadAktiva(){
 String sqlFraga = "Select max(kostnad) from projekt where status = 'Pågående' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt dyraste aktiva projekt kostar: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några aktiva projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
 public void minKostnadAktiva(){
 String sqlFraga = "Select min(kostnad) from projekt where status = 'Pågående' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt billigaste aktiva projekt kostar: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några aktiva projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
 public void avgKostnadAktiva(){
 String sqlFraga = "Select avg(kostnad) from projekt where status = 'Pågående' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina aktiva projekt kostar i genomsnitt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några aktiva projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
 
  public void totalKostnadAvslutade(){
 String sqlFraga = "Select sum(kostnad) from projekt where status = 'Avslutat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina avslutade projekt kostar sammanlagt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några avslutade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 } public void avgKostnadAvslutade(){
 String sqlFraga = "Select avg(kostnad) from projekt where status = 'Avslutat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina avslutade projekt kostar i genomsnitt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några avslutade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
   public void maxKostnadAvslutade(){
 String sqlFraga = "Select max(kostnad) from projekt where status = 'Avslutat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt dyraste avslutade projekt kostar: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några avslutade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
     public void minKostnadAvslutade(){
 String sqlFraga = "Select min(kostnad) from projekt where status = 'Avslutat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt billigaste avslutade projekt kostar: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några avslutade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
  
  public void totalKostnadPlanerade(){
 String sqlFraga = "Select sum(kostnad) from projekt where status = 'Planerat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina planerade projekt kommer kosta sammanlagt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några planerade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
public void maxKostnadPlanerade(){
   String sqlFraga = "Select max(kostnad) from projekt where status = 'Planerat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt dyraste planerade projekt kommer kosta: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några planerade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
public void minKostnadPlanerade(){
   String sqlFraga = "Select min(kostnad) from projekt where status = 'Planerat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Ditt billigaste planerade projekt kommer kosta: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några planerade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
public void avgKostnadPlanerade(){
   String sqlFraga = "Select avg(kostnad) from projekt where status = 'Planerat' and projektchef ="+anvandarensAID;
 try{ String summa;
     summa = idb.fetchSingle(sqlFraga);
     if(summa != null){
     lblTotalKostnad.setText("Dina planerade projekt kostar i genomsnitt: "+summa);}
     else{lblTotalKostnad.setText("Du verkar inte ha några planerade projekt");}
 }catch(InfException ex){
 System.out.println(ex.getMessage());}
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listProjektDuLeder = new javax.swing.JList<>();
        lblRubrikTotalKostnad = new javax.swing.JLabel();
        lblTotalKostnad = new javax.swing.JLabel();
        btnAktiva = new javax.swing.JButton();
        btnAvslutade = new javax.swing.JButton();
        btnPlanerade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sokRutaDinaProjekt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listProjektDuLeder.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listProjektDuLeder);

        lblRubrikTotalKostnad.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblRubrikTotalKostnad.setText("Kostnad för dina projekt");

        lblTotalKostnad.setText("Tryck på en knapp  och FASCINERASSSSSSSS");

        btnAktiva.setText("Aktiva");
        btnAktiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAktivaActionPerformed(evt);
            }
        });

        btnAvslutade.setText("Avslutade");
        btnAvslutade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvslutadeActionPerformed(evt);
            }
        });

        btnPlanerade.setText("Planerade");
        btnPlanerade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneradeActionPerformed(evt);
            }
        });

        jLabel1.setText("tryck på knapparna flera gånger för annan info");

        sokRutaDinaProjekt.setText("Sök på projekt");
        sokRutaDinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokRutaDinaProjektActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRubrikTotalKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnAktiva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvslutade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlanerade))
                            .addComponent(jLabel1)
                            .addComponent(lblTotalKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                    .addComponent(sokRutaDinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrikTotalKostnad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAktiva)
                            .addComponent(btnAvslutade)
                            .addComponent(btnPlanerade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sokRutaDinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAktivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAktivaActionPerformed
if(knappRaknareAktiva == 0){
    totalKostnadAktiva();
    knappRaknareAktiva = 1;
    return;
            
}
if(knappRaknareAktiva == 1){
    avgKostnadAktiva();
    knappRaknareAktiva = 2;
    return;
}
if(knappRaknareAktiva == 2){
    maxKostnadAktiva();
    knappRaknareAktiva = 3;
    return;
}
if(knappRaknareAktiva == 3){
    minKostnadAktiva();
    knappRaknareAktiva = 0;
    
}
    }//GEN-LAST:event_btnAktivaActionPerformed

    private void btnAvslutadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutadeActionPerformed
if(knappRaknareAvslutade == 0){
    totalKostnadAvslutade();
    knappRaknareAvslutade = 1;
    return;
            
}
if(knappRaknareAvslutade == 1){
    avgKostnadAvslutade();
    knappRaknareAvslutade = 2;
    return;
}
if(knappRaknareAvslutade == 2){
    maxKostnadAvslutade();
    knappRaknareAvslutade = 3;
    return;
}
if(knappRaknareAvslutade == 3){
    minKostnadAvslutade();
    knappRaknareAvslutade = 0;
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvslutadeActionPerformed

    private void btnPlaneradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneradeActionPerformed
if(knappRaknarePlanerade == 0){
    totalKostnadPlanerade();
    knappRaknarePlanerade = 1;
    return;
            
}
if(knappRaknarePlanerade == 1){
    avgKostnadPlanerade();
    knappRaknareAktiva = 2;
    return;
}
if(knappRaknarePlanerade == 2){
    maxKostnadPlanerade();
    knappRaknarePlanerade = 3;
    return;
}
if(knappRaknareAktiva == 3){
    minKostnadPlanerade();
    knappRaknarePlanerade = 0;
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaneradeActionPerformed

    private void sokRutaDinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokRutaDinaProjektActionPerformed
 String projektID = sokRutaDinaProjekt.getText();

        try {
            String sqlFraga = "SELECT pid FROM projekt WHERE pid = "+ projektID;
            System.out.println(sqlFraga);
            String pidFinns = idb.fetchSingle(sqlFraga);
            if(projektID.equals(pidFinns)){
                String sqlFragaProjektLedare= "SELECT projektchef FROM projekt where pid="+pidFinns;
                String isLedare = idb.fetchSingle(sqlFragaProjektLedare);
                if(isLedare.equals(anvandarensAID)){
                    new HanteraPartnersOchSamarbeten(idb,pidFinns).setVisible(true);
                }
            }
        
        }catch(InfException ex){
      System.out.println(ex.getMessage());}
    }//GEN-LAST:event_sokRutaDinaProjektActionPerformed
 private void listaProjektJagLeder(){
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat('ProjektID: ',pid,' ',projektnamn, ', ',status) from projekt where (status = 'Pågående' or status = 'planerat') and projektchef ="+anvandarensAID);
      
       DefaultListModel<String> overforingsLista = new DefaultListModel<>();
        for(String a : anstallda){
                overforingsLista.addElement(a);
        System.out.println(a);}
        listProjektDuLeder.setModel(overforingsLista);
    }catch(InfException ex){
        System.out.println(ex.getMessage());
    }
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
            java.util.logging.Logger.getLogger(HanteraProjektProjektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HanteraProjektProjektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HanteraProjektProjektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HanteraProjektProjektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new HanteraProjektProjektledare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAktiva;
    private javax.swing.JButton btnAvslutade;
    private javax.swing.JButton btnPlanerade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrikTotalKostnad;
    private javax.swing.JLabel lblTotalKostnad;
    private javax.swing.JList<String> listProjektDuLeder;
    private javax.swing.JTextField sokRutaDinaProjekt;
    // End of variables declaration//GEN-END:variables
}
