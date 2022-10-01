package co.edu.itm.monopoly.modelo;

public class Villanos extends Casilla implements ITarjeta {

    public Villanos(String nombre, int numero, int x, int y) {
        this.nombre = nombre;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public String getNombreCasilla() {
        return nombre;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}
