/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekt;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author elisl
 */
public class MenyHandlaggare extends javax.swing.JFrame {
    private InfDB idb;
    private String inloggadAnvandare;
    private String anvandarensAvdelning;
    private String anvandarensAID;

    /**
     * Creates new form MenyHandlaggare
     */
    public MenyHandlaggare(InfDB idb,String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        try{
        anvandarensAvdelning = idb.fetchSingle("SELECT avdelning FROM anstalld where epost ='"+inloggadAnvandare+"'");
        anvandarensAID = idb.fetchSingle("SELECT aid FROM anstalld where epost ='"+inloggadAnvandare+"'");
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        initComponents();
        lblFelmeddelandeSokning.setVisible(false);
        lblFelmeddelandeProjSok.setVisible(false);
        listaOverKollegor();
        listaOverProjektAvdelning();
        listaMinaProjekt();
        listaProjektJagLeder();
        listaPartnersTillMinaProjekt();
        listaOverHallbarhetsmal();
        setLblMittNamn();
        setLblMittLosenord();
        setLblMittAnstallningsDatum();
        setLblMinTelefon();
        setLblMinEpost();
        setLblMinAvdelning();
        setLblMinAdress();
        
       
       
        
    }
    public void listaOverKollegor(){
try{
     ArrayList<String> anstallda =  idb.fetchColumn("SELECT concat (fornamn,' ',efternamn) FROM anstalld where avdelning="+anvandarensAvdelning);
     DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : anstallda){
                overforingsLista.addElement(a); }
            listaAnstallda.setModel(overforingsLista);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}
    }
    public void listaOverHallbarhetsmal(){
try{
     ArrayList<String> hallbarhetsmal =  idb.fetchColumn("SELECT concat(namn,' ,Beskrivning: ',beskrivning,' ,Prioritet: ',prioritet,' ,Målnummer: ',malnummer) from hallbarhetsmal");
     DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : hallbarhetsmal){
                overforingsLista.addElement(a);
            overforingsLista.addElement(" ");}
            listaHallbarhetsmal.setModel(overforingsLista);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}
    }
    
    public void listaOverProjektAvdelning(){
        String sqlFraga = "SELECT concat(projektnamn, ', ',status) from projekt where pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where avdelning ="+anvandarensAvdelning+"))";
        System.out.println(sqlFraga);
       try{ ArrayList<String> anstallda = idb.fetchColumn(sqlFraga);
       DefaultListModel<String> overforingsLista = new DefaultListModel<>();
        for(String a : anstallda){
                overforingsLista.addElement(a);
        System.out.println(a);}
        listaProjektAvdelningHandlaggare.setModel(overforingsLista);
    }catch(InfException ex){
        System.out.println(ex.getMessage());
    }}
    public void setLblMinEpost(){
try{
    String epost = idb.fetchSingle("select epost from anstalld where aid ="+anvandarensAID);
    lblMinEpost.setText("Min epost: "+epost);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}
    public void setLblMittNamn(){
try{
    String namn = idb.fetchSingle("select concat(fornamn,' ',efternamn) from anstalld where aid ="+anvandarensAID);
    lblMittnamn.setText("Mitt namn: "+namn);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}
    public void setLblMinAdress(){
try{
    String adress = idb.fetchSingle("select adress from anstalld where aid ="+anvandarensAID);
    lblMinAdress.setText("Min adress: "+adress);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}
       public void setLblMittLosenord(){
try{
    String losenord = idb.fetchSingle("select losenord from anstalld where aid ="+anvandarensAID);
    lblMittLosenord.setText("Min adress: "+losenord);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}
          public void setLblMinAvdelning(){
lblMinAvdelning.setText("Min avdelning: "+anvandarensAvdelning);
}
   public void setLblMinTelefon(){
try{
    String telefon = idb.fetchSingle("select telefon from anstalld where aid ="+anvandarensAID);
    lblMinTelefon.setText("Min telefon: "+telefon);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}
      public void setLblMittAnstallningsDatum(){
try{
    String anstallningsDatum = idb.fetchSingle("select anstallningsdatum from anstalld where aid ="+anvandarensAID);
    lblMittAnstallningsDatum.setText("Mitt anstallningsdatum: "+anstallningsDatum);
}catch(InfException ex){
    System.out.println(ex.getMessage());
}}

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabHuvudtabHandlaggare = new javax.swing.JTabbedPane();
        tabMinaProjekt = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMinaProjekt = new javax.swing.JList<>();
        lblMinaProjekt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProjektDuLeder = new javax.swing.JList<>();
        lblProjektDuLeder = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPartnersIDinaProjekt = new javax.swing.JList<>();
        lblPartnersTillDinaProjekt = new javax.swing.JLabel();
        sokRutaProjektHandlaggare = new javax.swing.JTextField();
        lblSokRutaProjektHandlaggare = new javax.swing.JLabel();
        lblFelmeddelandeProjSok = new javax.swing.JLabel();
        tabMinAvdelning = new javax.swing.JPanel();
        AnstalldaScrollPane = new javax.swing.JScrollPane();
        listaAnstallda = new javax.swing.JList<>();
        lblKollegorListTitel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProjektAvdelningHandlaggare = new javax.swing.JList<>();
        lblProjektAvdelning = new javax.swing.JLabel();
        btnVisaPagaende = new javax.swing.JButton();
        btnVisaPlanerade = new javax.swing.JButton();
        btnVisaAvslutade = new javax.swing.JButton();
        btnVisaAlla = new javax.swing.JButton();
        lblSokHandlaggare = new javax.swing.JLabel();
        tfSokRutaHandlaggare = new javax.swing.JTextField();
        lblFelmeddelandeSokning = new javax.swing.JLabel();
        tfStartdatum = new javax.swing.JTextField();
        tfSlutdatum = new javax.swing.JTextField();
        btnSokEfterDatum = new javax.swing.JButton();
        tabMinaUppgifter = new javax.swing.JPanel();
        lblMittnamn = new javax.swing.JLabel();
        lblMinEpost = new javax.swing.JLabel();
        lblMinAdress = new javax.swing.JLabel();
        lblMittLosenord = new javax.swing.JLabel();
        lblMinAvdelning = new javax.swing.JLabel();
        lblMinTelefon = new javax.swing.JLabel();
        lblMittAnstallningsDatum = new javax.swing.JLabel();
        btnAndraMinaUppgifter = new javax.swing.JButton();
        tabHallbarhetsmal = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaHallbarhetsmal = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listMinaProjekt.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listMinaProjekt);

        lblMinaProjekt.setText("Dina projekt");

        listProjektDuLeder.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listProjektDuLeder);

        lblProjektDuLeder.setText("Projekt du leder");

        listaPartnersIDinaProjekt.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaPartnersIDinaProjekt);

        lblPartnersTillDinaProjekt.setText("Partners till dina projekt");

        sokRutaProjektHandlaggare.setText("PID");
        sokRutaProjektHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokRutaProjektHandlaggareActionPerformed(evt);
            }
        });

        lblSokRutaProjektHandlaggare.setText("Sök på projekt");

        lblFelmeddelandeProjSok.setText("Det blev fel, vänligen skriv in projektID.");

        javax.swing.GroupLayout tabMinaProjektLayout = new javax.swing.GroupLayout(tabMinaProjekt);
        tabMinaProjekt.setLayout(tabMinaProjektLayout);
        tabMinaProjektLayout.setHorizontalGroup(
            tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinaProjektLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sokRutaProjektHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabMinaProjektLayout.createSequentialGroup()
                        .addGroup(tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabMinaProjektLayout.createSequentialGroup()
                                .addComponent(lblMinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProjektDuLeder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tabMinaProjektLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPartnersTillDinaProjekt)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSokRutaProjektHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFelmeddelandeProjSok))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        tabMinaProjektLayout.setVerticalGroup(
            tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinaProjektLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinaProjekt)
                    .addComponent(lblProjektDuLeder)
                    .addComponent(lblPartnersTillDinaProjekt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMinaProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblSokRutaProjektHandlaggare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sokRutaProjektHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFelmeddelandeProjSok)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabHuvudtabHandlaggare.addTab("Mina Projekt", tabMinaProjekt);

        listaAnstallda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AnstalldaScrollPane.setViewportView(listaAnstallda);

        lblKollegorListTitel.setText("MinaKollegor");

        listaProjektAvdelningHandlaggare.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaProjektAvdelningHandlaggare);

        lblProjektAvdelning.setText("Projekt i avdelningen");

        btnVisaPagaende.setText("Visa Pågående Projekt");
        btnVisaPagaende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaPagaendeActionPerformed(evt);
            }
        });

        btnVisaPlanerade.setText("Visa Planerade Projekt");
        btnVisaPlanerade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaPlaneradeActionPerformed(evt);
            }
        });

        btnVisaAvslutade.setText("Visa Avslutade Projekt");
        btnVisaAvslutade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAvslutadeActionPerformed(evt);
            }
        });

        btnVisaAlla.setText("Visa Alla Projekt");
        btnVisaAlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAllaActionPerformed(evt);
            }
        });

        lblSokHandlaggare.setText("Sök på en handläggare:");

        tfSokRutaHandlaggare.setText("Namn/Epost");
        tfSokRutaHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSokRutaHandlaggareActionPerformed(evt);
            }
        });

        lblFelmeddelandeSokning.setBackground(new java.awt.Color(255, 0, 51));
        lblFelmeddelandeSokning.setForeground(new java.awt.Color(51, 51, 51));
        lblFelmeddelandeSokning.setText("Hittade ingen, skriv om frågan");

        tfStartdatum.setText("Startdatum");

        tfSlutdatum.setText("Slutdatum");

        btnSokEfterDatum.setText("Visa Projekt efter datum");
        btnSokEfterDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokEfterDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMinAvdelningLayout = new javax.swing.GroupLayout(tabMinAvdelning);
        tabMinAvdelning.setLayout(tabMinAvdelningLayout);
        tabMinAvdelningLayout.setHorizontalGroup(
            tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinAvdelningLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFelmeddelandeSokning)
                    .addGroup(tabMinAvdelningLayout.createSequentialGroup()
                        .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfSokRutaHandlaggare)
                            .addComponent(lblSokHandlaggare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnstalldaScrollPane)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabMinAvdelningLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblKollegorListTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(lblProjektAvdelning, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVisaPagaende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisaPlanerade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSokEfterDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisaAlla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisaAvslutade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tabMinAvdelningLayout.createSequentialGroup()
                                .addComponent(tfStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(tfSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        tabMinAvdelningLayout.setVerticalGroup(
            tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinAvdelningLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKollegorListTitel)
                    .addComponent(lblProjektAvdelning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnstalldaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabMinAvdelningLayout.createSequentialGroup()
                        .addComponent(btnVisaPagaende)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisaPlanerade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisaAvslutade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisaAlla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMinAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSokHandlaggare)
                    .addComponent(btnSokEfterDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSokRutaHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFelmeddelandeSokning)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabHuvudtabHandlaggare.addTab("Min Avdelning", tabMinAvdelning);

        lblMittnamn.setText("jLabel1");

        lblMinEpost.setText("jLabel1");

        lblMinAdress.setText("jLabel1");

        lblMittLosenord.setText("jLabel1");

        lblMinAvdelning.setText("jLabel1");

        lblMinTelefon.setText("jLabel1");

        lblMittAnstallningsDatum.setText("jLabel1");

        btnAndraMinaUppgifter.setText("Ändra Uppgifter");
        btnAndraMinaUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraMinaUppgifterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMinaUppgifterLayout = new javax.swing.GroupLayout(tabMinaUppgifter);
        tabMinaUppgifter.setLayout(tabMinaUppgifterLayout);
        tabMinaUppgifterLayout.setHorizontalGroup(
            tabMinaUppgifterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinaUppgifterLayout.createSequentialGroup()
                .addGroup(tabMinaUppgifterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMinaUppgifterLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(tabMinaUppgifterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMittnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabMinaUppgifterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMittAnstallningsDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(lblMinTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMinAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMittLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMinAdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMinEpost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(tabMinaUppgifterLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAndraMinaUppgifter)))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        tabMinaUppgifterLayout.setVerticalGroup(
            tabMinaUppgifterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMinaUppgifterLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMittnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinAdress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMittLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinAvdelning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinTelefon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMittAnstallningsDatum)
                .addGap(18, 18, 18)
                .addComponent(btnAndraMinaUppgifter)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tabHuvudtabHandlaggare.addTab("Mina Uppgifter", tabMinaUppgifter);

        listaHallbarhetsmal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(listaHallbarhetsmal);

        javax.swing.GroupLayout tabHallbarhetsmalLayout = new javax.swing.GroupLayout(tabHallbarhetsmal);
        tabHallbarhetsmal.setLayout(tabHallbarhetsmalLayout);
        tabHallbarhetsmalLayout.setHorizontalGroup(
            tabHallbarhetsmalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHallbarhetsmalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );
        tabHallbarhetsmalLayout.setVerticalGroup(
            tabHallbarhetsmalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHallbarhetsmalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
        );

        tabHuvudtabHandlaggare.addTab("Hållbarhetsmål", tabHallbarhetsmal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabHuvudtabHandlaggare, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabHuvudtabHandlaggare, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSokRutaHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSokRutaHandlaggareActionPerformed
        String kollegaAttSoka = tfSokRutaHandlaggare.getText();

        try {
            String sqlFraga = "SELECT AID from anstalld where concat(fornamn,' ',efternamn,' ',epost) like concat('%','"+kollegaAttSoka+"','%') and avdelning ="+anvandarensAvdelning+" limit 1";
            System.out.println(sqlFraga);
            String aktuellSokning = idb.fetchSingle(sqlFraga);
            if(aktuellSokning==null){
                lblFelmeddelandeSokning.setVisible(true);
            }else{
                informationsrutaHandläggare x = new informationsrutaHandläggare(idb,aktuellSokning);
                x.setVisible(true);
                System.out.println(aktuellSokning);
                lblFelmeddelandeSokning.setVisible(false);
            }}
            catch(InfException ex){
                System.out.println(ex.getMessage());

            }
            
    }//GEN-LAST:event_tfSokRutaHandlaggareActionPerformed
    
    private void btnVisaAllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAllaActionPerformed
        listaOverProjektAvdelning();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaAllaActionPerformed

    private void btnVisaAvslutadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAvslutadeActionPerformed
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where status = 'Avslutat' and pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where avdelning ="+anvandarensAvdelning+"))");
            DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : anstallda){
                overforingsLista.addElement(a);
                System.out.println(a);}
            listaProjektAvdelningHandlaggare.setModel(overforingsLista);
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaAvslutadeActionPerformed

    private void btnVisaPlaneradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaPlaneradeActionPerformed
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where status = 'Planerat' and pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where avdelning ="+anvandarensAvdelning+"))");
            DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : anstallda){
                overforingsLista.addElement(a);
                System.out.println(a);}
            listaProjektAvdelningHandlaggare.setModel(overforingsLista);
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaPlaneradeActionPerformed

    private void btnVisaPagaendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaPagaendeActionPerformed
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where status = 'Pågående' and pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where avdelning ="+anvandarensAvdelning+"))");
            DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : anstallda){
                overforingsLista.addElement(a);
                System.out.println(a);}
            listaProjektAvdelningHandlaggare.setModel(overforingsLista);
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaPagaendeActionPerformed

    private void sokRutaProjektHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokRutaProjektHandlaggareActionPerformed
        String projektID = sokRutaProjektHandlaggare.getText();

        try {
            String sqlFraga = "SELECT pid FROM projekt WHERE pid = "+ projektID;
            System.out.println(sqlFraga);
            String pidFinns = idb.fetchSingle(sqlFraga);
            if(projektID.equals(pidFinns)){
                String sqlFragaProjektLedare= "SELECT projektchef FROM projekt where pid="+pidFinns;
                String isLedare = idb.fetchSingle(sqlFragaProjektLedare);
                if(isLedare.equals(anvandarensAID)){
                    new ProjektDetaljer(idb,pidFinns).setVisible(true);
                    lblFelmeddelandeProjSok.setVisible(false);}else{
                    new projektInformation(idb,pidFinns).setVisible(true);
                    lblFelmeddelandeProjSok.setVisible(false);
                }
            }else{

                lblFelmeddelandeProjSok.setVisible(true);}
        }

        catch(InfException ex){
            System.out.println(ex.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_sokRutaProjektHandlaggareActionPerformed

    private void btnAndraMinaUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraMinaUppgifterActionPerformed
new AndraMinaUppgifter(idb,anvandarensAID).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAndraMinaUppgifterActionPerformed

    private void btnSokEfterDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokEfterDatumActionPerformed
        String startDatum = tfStartdatum.getText();
        String slutDatum = tfSlutdatum.getText();
    if(Validering.isValidDatum(startDatum)){
            System.out.println("Startdatum korrekt format");
        if(Validering.isValidDatum(slutDatum)){
        System.out.println("slutdatum korrekt format");
         try{ ArrayList<String> projekt = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where startdatum >'"+startDatum+"' and slutdatum <'"+slutDatum+"' and pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where avdelning ="+anvandarensAvdelning+"))");
            DefaultListModel<String> overforingsLista = new DefaultListModel<>();
            for(String a : projekt){
                overforingsLista.addElement(a);
                System.out.println(a);}
            listaProjektAvdelningHandlaggare.setModel(overforingsLista);
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        }else{System.out.println("slutdatum fel format");}
    }else{System.out.println("startdatum fel format");}        // TODO add your handling code here:
    }//GEN-LAST:event_btnSokEfterDatumActionPerformed
    private void listaMinaProjekt(){
 try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where pid in(SELECT pid from ans_proj where aid in(SELECT aid from anstalld where epost ='"+inloggadAnvandare+"'))");
       DefaultListModel<String> overforingsLista = new DefaultListModel<>();
        for(String a : anstallda){
                overforingsLista.addElement(a);
        System.out.println(a);}
        listMinaProjekt.setModel(overforingsLista);
    }catch(InfException ex){
        System.out.println(ex.getMessage());
    }
}
    private void listaProjektJagLeder(){
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(projektnamn, ', ',status) from projekt where projektchef =(SELECT aid from anstalld where epost ='"+inloggadAnvandare+"')");
      
       DefaultListModel<String> overforingsLista = new DefaultListModel<>();
        for(String a : anstallda){
                overforingsLista.addElement(a);
        System.out.println(a);}
        listProjektDuLeder.setModel(overforingsLista);
    }catch(InfException ex){
        System.out.println(ex.getMessage());
    }
    }
    
    private void listaPartnersTillMinaProjekt(){
        try{ ArrayList<String> anstallda = idb.fetchColumn("SELECT concat(namn,', kontaktperson:',kontaktperson,', Telefon:',telefon) from partner where pid in(SELECT projekt.pid from projekt join ans_proj on projekt.pid=ans_proj.pid where aid in(SELECT aid from anstalld where epost ='"+inloggadAnvandare+"'))");
       DefaultListModel<String> overforingsLista = new DefaultListModel<>();
        for(String a : anstallda){
                overforingsLista.addElement(a);
        System.out.println(a);}
        listaPartnersIDinaProjekt.setModel(overforingsLista);
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
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new MenyHandlaggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AnstalldaScrollPane;
    private javax.swing.JButton btnAndraMinaUppgifter;
    private javax.swing.JButton btnSokEfterDatum;
    private javax.swing.JButton btnVisaAlla;
    private javax.swing.JButton btnVisaAvslutade;
    private javax.swing.JButton btnVisaPagaende;
    private javax.swing.JButton btnVisaPlanerade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblFelmeddelandeProjSok;
    private javax.swing.JLabel lblFelmeddelandeSokning;
    private javax.swing.JLabel lblKollegorListTitel;
    private javax.swing.JLabel lblMinAdress;
    private javax.swing.JLabel lblMinAvdelning;
    private javax.swing.JLabel lblMinEpost;
    private javax.swing.JLabel lblMinTelefon;
    private javax.swing.JLabel lblMinaProjekt;
    private javax.swing.JLabel lblMittAnstallningsDatum;
    private javax.swing.JLabel lblMittLosenord;
    private javax.swing.JLabel lblMittnamn;
    private javax.swing.JLabel lblPartnersTillDinaProjekt;
    private javax.swing.JLabel lblProjektAvdelning;
    private javax.swing.JLabel lblProjektDuLeder;
    private javax.swing.JLabel lblSokHandlaggare;
    private javax.swing.JLabel lblSokRutaProjektHandlaggare;
    private javax.swing.JList<String> listMinaProjekt;
    private javax.swing.JList<String> listProjektDuLeder;
    private javax.swing.JList<String> listaAnstallda;
    private javax.swing.JList<String> listaHallbarhetsmal;
    private javax.swing.JList<String> listaPartnersIDinaProjekt;
    private javax.swing.JList<String> listaProjektAvdelningHandlaggare;
    private javax.swing.JTextField sokRutaProjektHandlaggare;
    private javax.swing.JPanel tabHallbarhetsmal;
    private javax.swing.JTabbedPane tabHuvudtabHandlaggare;
    private javax.swing.JPanel tabMinAvdelning;
    private javax.swing.JPanel tabMinaProjekt;
    private javax.swing.JPanel tabMinaUppgifter;
    private javax.swing.JTextField tfSlutdatum;
    private javax.swing.JTextField tfSokRutaHandlaggare;
    private javax.swing.JTextField tfStartdatum;
    // End of variables declaration//GEN-END:variables
}
