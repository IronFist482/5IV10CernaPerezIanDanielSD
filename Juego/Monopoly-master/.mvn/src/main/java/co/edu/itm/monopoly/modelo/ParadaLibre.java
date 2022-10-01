package co.edu.itm.monopoly.modelo;

public class ParadaLibre extends Casilla {

    private int acumuladoImpuestos;

    public String getNombreCasilla() {
        return "Parada libre";
    }

    public ParadaLibre(int numero, int x, int y) {
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

}
