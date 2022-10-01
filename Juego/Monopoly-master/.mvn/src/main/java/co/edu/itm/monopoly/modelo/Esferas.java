package co.edu.itm.monopoly.modelo;

public class Esferas extends Casilla implements ITarjeta {

    public Esferas(int numero, int x, int y) {
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public String getNombreCasilla() {
        return "Suerte";
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}
