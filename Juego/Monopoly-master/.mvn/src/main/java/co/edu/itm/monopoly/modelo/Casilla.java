package co.edu.itm.monopoly.modelo;

public abstract class Casilla {

    protected String nombre;
    protected int numero;
    protected int x;
    protected int y;

    public Casilla() {

    }

    public abstract String getNombreCasilla();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Casilla{"
                + "numero=" + numero
                + ", x=" + x
                + ", y=" + y
                + '}';
    }
}
