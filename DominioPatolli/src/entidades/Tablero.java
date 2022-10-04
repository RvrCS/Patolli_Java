package entidades;

import java.util.LinkedList;

public class Tablero {
	private LinkedList<Casilla> casillas;

	public Tablero() {
		casillas = new LinkedList<>();
	}

	public LinkedList<Casilla> getCasillas() {
		return casillas;
	}

	public void setCasillas(LinkedList<Casilla> casillas) {
		this.casillas = casillas;
	}
}
