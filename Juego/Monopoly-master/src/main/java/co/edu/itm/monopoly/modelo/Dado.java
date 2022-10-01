package co.edu.itm.monopoly.modelo;

import java.util.Random;

/**
 * @author alejandro
 * @version 1.0
 * @created 05-oct.-2014 5:57:16 p. m.
 */
public class Dado {

    int[] valor= new int[2];

    public Dado() {

    }

    public int[] lanzarDados() {

        Random aleatorio = new Random();
        valor[0] = aleatorio.nextInt(5) + 1;
        valor[1] = aleatorio.nextInt(5) + 1;
        return valor;
    }

}
