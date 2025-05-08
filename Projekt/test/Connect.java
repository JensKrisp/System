/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author elisl
 */
public class Connect {
private InfDB idb;

   
    
    public Connect() {
       
        try{
        idb = new InfDB("sdgsweden","3306","dbAdmin2024","dbAdmin2024PW");
        
        System.out.println("funkar");
    }
        catch(InfException infex){System.out.println(infex.getMessage());
            
        }}
    
}
