/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import animales.Liebre;
import animales.Tortuga;

/**
 *
 * @author cerna
 */
public class Main extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tortuga tor=new Tortuga();
        Liebre lib=new Liebre();
        
        tor.start();
        lib.start();
        
        
        
    }
    
}
