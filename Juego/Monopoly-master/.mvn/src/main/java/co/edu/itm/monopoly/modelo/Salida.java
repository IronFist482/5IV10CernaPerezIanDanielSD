package co.edu.itm.monopoly.modelo;

import co.edu.itm.monopoly.modelo.Casilla;

public class Salida extends Casilla {

    private int cantidadAPagar;

    public String getNombreCasilla() {
        return "Salida";
    }

    public Salida(int numero, int x, int y) {
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}
