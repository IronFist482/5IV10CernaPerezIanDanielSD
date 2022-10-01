package co.edu.itm.monopoly.modelo;

public class EmPublicas extends Patrimonio {

    public EmPublicas(String nombre, int numero, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.renta = new int[2];
    }

}
