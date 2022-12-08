package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Juego implements Serializable {

	private Tablero tablero;
	private int apuesta, fondoFijo,numCasillasAspa;
	private List<Jugador> jugadores;
	private static Juego singletonJuego;
	private boolean pCreada= false;
        private boolean pIniciada = false;
        private int turno = 0;
        private int valorUltTiro = 0;
	
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
	
	public static Juego getInstance(){
		if (singletonJuego == null) {
			singletonJuego = new Juego();
		}
		return singletonJuego;
	}	

	public boolean ispCreada() {
		return pCreada;
	}

	public void setpCreada(boolean pCreada) {
		this.pCreada = pCreada;
	}
        
        public void emepzarPartida(){
            this.pIniciada = true;
        }
        
        public boolean getpIniciada(){
            return this.pIniciada;
        }
        public int getTurnp(){
            return this.turno;
        }
        
        public void setTurno(){
            this.turno += 1;
            if (this.turno == this.getListaJugador().size()) {
                this.turno = 0;
            }
        }

    public int getValorUltTiro() {
        return valorUltTiro;
    }

    public void setValorUltTiro(int valorUltTiro) {
        this.valorUltTiro = valorUltTiro;
    }
}
