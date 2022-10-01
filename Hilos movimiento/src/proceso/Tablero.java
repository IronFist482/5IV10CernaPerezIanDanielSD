/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proceso;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tablero extends JPanel implements Runnable{
    private final Image background;
    private  Image tortuga;
    private  Image liebre;
    private Thread hilo;
    
    private  int n,m,y;
    
    public Tablero(){
        
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        background = new ImageIcon(this.getClass().getResource("/img/paisaje1.png")).getImage();
        n=800;
        m=800;
        y=300;
        tortuga();
        liebre();
        hilo = new Thread(this);
        hilo.start();
   }
    
    void tortuga(){
        tortuga = new ImageIcon(this.getClass().getResource("/img/tortuga.png")).getImage();
        
        
    }
    void liebre(){
        liebre = new ImageIcon(this.getClass().getResource("/img/liebre.png")).getImage();
       
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(background, 0,0, null);
        g2.drawImage(tortuga,n,y, null);
        g2.drawImage(liebre,m,y-200,null);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    public void cicloTortuga(){
        n += 30;
        if ( n > 800 ){
            n = -200;
        }
    }
    public void cicloConejo(){
        m += 100;
        if ( m > 800 ){
            m = -200;
        }
    }
    
    @Override
    public void run() {
        while(true){
            cicloTortuga();
            cicloConejo();
            repaint();
            try{
                Thread.sleep(100);
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
