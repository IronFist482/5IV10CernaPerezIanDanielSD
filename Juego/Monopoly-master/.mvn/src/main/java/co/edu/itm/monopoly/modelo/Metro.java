package co.edu.itm.monopoly.modelo;

public class Metro extends Patrimonio {

    public Metro(String nombre, int numero, int x, int y) {
        this.renta = new int[4];
        this.nombre = nombre;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}
