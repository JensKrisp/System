/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ljud;
import javax.sound.sampled.*;
import java.io.*;
/**
 *
 * @author elisl
 */
public class LjudSystem {
    public void spelaLjud(String ljudetsNamn) {
        try {
            
            InputStream ljudKalla = getClass().getResourceAsStream("/ljud/" + ljudetsNamn);
            if (ljudKalla == null) {
                System.out.println("ljudetfinnsinte");
                return;
            }

            InputStream bufferedIn = new BufferedInputStream(ljudKalla);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
