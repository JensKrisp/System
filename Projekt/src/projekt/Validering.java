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
    
    public static boolean isValidEpost(String epost) {
        // Validering för e-post med reguljära uttryck
        String epostRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return epost.matches(epostRegex);
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
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ange heltal!");
            resultat = false;
        }
    return resultat;
    }
    
    
    
    
    public static boolean isValidLosenord(String losenord) {
        //  Validering för lösenord: det ska vara minst 10 tecken långt
        return losenord.length() >= 10;
    }
}
