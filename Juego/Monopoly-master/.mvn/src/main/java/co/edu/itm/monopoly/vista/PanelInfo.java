package co.edu.itm.monopoly.vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelInfo extends JPanel {

    public PanelInfo(
            JLabel lblJugador1,
            JLabel lblJugador2,
            JLabel lblJugador3,
            JLabel lblJugador4) {
        
        setBackground(Color.red);
        this.setBounds(1067, 0, 299, 768);
        setLayout(null);

        lblJugador1.setBounds(49, 50, 200, 50);
        lblJugador1.setBackground(Color.white);
        add(lblJugador1);
        lblJugador2.setBounds(49, 150, 200, 50);
        lblJugador2.setBackground(Color.white);
        add(lblJugador2);
        lblJugador3.setBounds(49, 250, 200, 50);
        lblJugador3.setBackground(Color.white);
        add(lblJugador3);
        lblJugador4.setBounds(49, 350, 200, 50);
        lblJugador4.setBackground(Color.white);
        add(lblJugador4);
    }

}
