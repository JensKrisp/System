/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekt;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author jakobolofsson
 */
public class Validering {
    
    // Validerar att formatatet för Epostadressen är korrekt
    public static boolean isValidEpost(String epost) {
        
    boolean resultat = true;
        
        String epostRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!epost.matches(epostRegex)) {
            JOptionPane.showMessageDialog(null, "Ogiltig e-postadress");
            resultat = false;
        }
        
        return resultat;
    }
   
    public static boolean ejTomtFalt(JTextField faltAttKontrollera) {
    
    boolean resultat = true;
    
        if (faltAttKontrollera.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Inmatnignsrutan är tom!");
         resultat = false;
         faltAttKontrollera.requestFocus();
        }
        
        return resultat;
    }

    public static boolean isHeltal(JTextField faltAttKontrollera){
        
        boolean resultat = true;
        // Här görs en try och catch, inte det bästa enligt Johan. Men han tycker att det är pedagogiskt.
        
        try {
        String inStrang = faltAttKontrollera.getText();
        Integer.parseInt(inStrang);
        // Skicka tillbaka markören till rutan
        faltAttKontrollera.requestFocus();
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan får endast innehålla heltal");
            resultat = false;
        }
        
        return resultat;
    }
    
    // Validerar att användarens lösenord är minst 10 tecken långt 
    public static boolean isValidLosenord(String losenord) {
        
        boolean resultat = true;
    {
        String losenordRegex = "^[a-zA-Z0-9]{10,}$";
        if (!losenord.matches(losenordRegex)) {
            JOptionPane.showMessageDialog(null, "Ogiltigt lösenord");
            resultat = false;
        }
        
        return resultat;
    }
    }
    
    // Validerar att datumformatet är "YYYY-MM-DD"
    public static boolean isValidDatum(String datum) {
        
        boolean resultat = true;
    {
        String datumRegex = "^\\d{4}-\\d{2}-\\d{2}$";
        if (!datum.matches(datumRegex)) {
            JOptionPane.showMessageDialog(null, "Datumformatet ska vara \"YYYY-MM-DD\"");
            resultat = false;
        }
        
        return resultat;
    }
    }
    
    // Validerar att textfältet endast innehåller bokstäver
    public static boolean isOnlyLetters(String letter) {
        
        boolean resultat = true;
    {
        String letterRegex = "^[A-Za-zÅÄÖåäö]+$";
        if (!letter.matches(letterRegex)) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan får endast innehålla bokstäver");
            resultat = false;
    }
        
        return resultat;
    }
    }
}
