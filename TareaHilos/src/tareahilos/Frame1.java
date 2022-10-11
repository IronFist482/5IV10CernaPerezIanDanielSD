/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareahilos;
/**
 *
 * @author cerna
 */
import javax.swing.JFrame;

public class Frame1 extends JFrame{
    public Frame1(){
        
       setTitle("Entrada 1");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(900,550);
       setLocationRelativeTo(null);
       setResizable(false);
       add(new Tablero1());
       setVisible(true);
    }
}
