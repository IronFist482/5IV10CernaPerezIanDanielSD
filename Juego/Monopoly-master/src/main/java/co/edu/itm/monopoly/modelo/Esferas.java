package co.edu.itm.monopoly.modelo;

/**
 * @author alejandro
 * @version 1.0
 * @created 05-oct.-2014 6:21:02 p. m.
 */
public class Esferas extends Casilla implements ITarjeta {

	public Esferas(int numero, int x, int y){
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