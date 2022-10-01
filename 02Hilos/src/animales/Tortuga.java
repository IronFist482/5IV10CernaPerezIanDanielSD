/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author cerna
 */
public class Tortuga extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Avanzó tortuga: "+(i+1));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Terminó tortuga");
    }
}
