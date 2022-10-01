package co.edu.itm.monopoly.modelo;

public class Carcel extends Casilla {

    private int acumuladoImpuestos;

    public Carcel(int numero, int x, int y) {
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public String getNombreCasilla() {
        return "Carcel";
    }

    public void acumularImpuesto(int impuesto) {
        acumuladoImpuestos += impuesto;
    }

    public int pagarAcumulado() {
        return acumuladoImpuestos;
    }

    @Override
    public String toString() {
        return "Carcel{"
                + "numero=" + numero
                + ", x=" + x
                + ", y=" + y
                + ", acumuladoImpuestos=" + acumuladoImpuestos
                + '}';
    }
}
