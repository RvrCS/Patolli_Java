package entidades;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	private Tablero tablero;
	private int apuesta, fondoFijo,numCasillasAspa;
	private List<Jugador> jugadores;
	private static Juego singletonJuego;
	
	
	public Juego(Tablero tablero, int apuesta, int fondoFijo,int numCasillasAspa, List<Jugador> jugadores) {
		this.tablero = tablero;
		this.apuesta = apuesta;
		this.fondoFijo = fondoFijo;
		this.jugadores = jugadores;
		this.numCasillasAspa = numCasillasAspa;
	}

	public Juego() {
		this.tablero  = new Tablero();
		this.jugadores = new ArrayList<>();
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public int getApuesta() {
		return apuesta;
	}

	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}

	public int getFondoFijo() {
		return fondoFijo;
	}

	public void setFondoFijo(int fondoFijo) {
		this.fondoFijo = fondoFijo;
	}

	public int getNumCasillasAspa() {
		return numCasillasAspa;
	}

	public void setNumCasillasAspa(int numCasillasAspa) {
		this.numCasillasAspa = numCasillasAspa;
	}
	
	public void addJugador(Jugador jugador){
		this.jugadores.add(jugador);
	}
	
	public List<Jugador> getListaJugador(){
		return this.jugadores;
	}
	
	public static  Juego getInstance(){
		if (singletonJuego == null) {
			singletonJuego = new Juego();
		}
		return singletonJuego;
	}	
}
