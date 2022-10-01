package co.edu.itm.monopoly.modelo;

public class Heroes extends Casilla implements ITarjeta {

    public Heroes(String nombre, int numero, int x, int y) {
        this.nombre = nombre;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public String getNombreCasilla() {
        return "Goku";
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}
