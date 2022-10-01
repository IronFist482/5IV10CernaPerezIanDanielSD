/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cerna
 */
public class Liebre extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Avanzó liebre: "+(i+1));
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termino tortuga");
    }
    
    
}
