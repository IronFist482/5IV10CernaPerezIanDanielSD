/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.itm.monopoly.modelo;

/**
 *
 * @author cerna
 */
public class Heroes extends Casilla implements ITarjeta {

	public Heroes(int numero, int x, int y){
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