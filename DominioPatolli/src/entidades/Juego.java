package entidades;

import java.util.List;

public class Juego {
    private Tablero tablero;
    private int apuesta, fondoFijo;
    private List<Jugador> jugadores;

    public Juego(Tablero tablero, int apuesta, int fondoFijo, List<Jugador> jugadores) {
        this.tablero = tablero;
        this.apuesta = apuesta;
        this.fondoFijo = fondoFijo;
        this.jugadores = jugadores;
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

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
