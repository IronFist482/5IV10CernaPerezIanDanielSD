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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero1 extends JPanel implements Runnable{
    private final Image background;
    private  Image tortuga;
    private  Image liebre;
    private Thread hilo;
    private Contador objContador;
    private  int n,m,y1,y2,contador;
    
    public Tablero1(){
        objContador=new Contador(contador);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        background = new ImageIcon(this.getClass().getResource("/img/EntradaMidjourney.png")).getImage();
        n=-700;
        m=800;
        y1=500;
        y2=500;
        tortuga();
        liebre();
        hilo = new Thread(this);
        hilo.start();
   }
    
    void tortuga(){
        tortuga = new ImageIcon(this.getClass().getResource("/img/images.png")).getImage();
        
        
    }
    void liebre(){
        liebre = new ImageIcon(this.getClass().getResource("/img/images.png")).getImage();
       
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(background, 0,0, null);
        g2.drawImage(tortuga,n,y1, null);
        g2.drawImage(liebre,m,y2,null);
        g2.drawString(("Contador: "+contador), 420, 100);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    public void cicloIzquierdaSale(){
        n += 2;
        y1 -=.01;
        
        if (y1 < 100){
            y1= 500;
            n = -700;
            contador=objContador.getContador();
            contador+=20;
        }
        objContador.setContador(contador);
    }
    public void cicloDerechaSale(){
        m -= 2;
        y2 -= .01;
        if (y2 < 100){
            y2= 500;
            m = 800;
            contador=objContador.getContador();
            contador+=20;
        }
        objContador.setContador(contador);
    }
    
    @Override
    public void run() {
        while(contador!=1000){
            cicloDerechaSale();
            cicloIzquierdaSale();
            repaint();
            try{
                Thread.sleep(10);
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
