/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekt;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author elisl
 */  
 




public class Projekt {

private InfDB idb;
 


    

    public Projekt() {
       
        try{
        idb = new InfDB("sdgsweden","3306","dbAdmin2024","dbAdmin2024PW");
        
        System.out.println("funkar");
    }
        catch(InfException infex){System.out.println(infex.getMessage());
            
        }
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args){
Projekt p = new Projekt();
new NewJFrame().setVisible(true);
}
}


