/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekt;

import javax.swing.JTextField;


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
    if (faltAttKontrollera.getText().isEmpty()) {
        return false;
    }
    return true;
}

    public static boolean isValidLosenord(String losenord) {
        //  Validering för lösenord: det ska vara minst 10 tecken långt
        return losenord.length() >= 10;
    }
}
