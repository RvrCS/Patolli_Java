package entidades;

public class Ficha {
    private boolean enJuego;
    private Casilla posicionActual, posicionAnterior;

    public Ficha() {
    }
 
    public Ficha(boolean enJuego, Casilla posicionActual, Casilla posicionAnterior) {
        this.enJuego = enJuego;
        this.posicionActual = posicionActual;
        this.posicionAnterior = posicionAnterior;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public void setEnJuego(boolean enJuego) {
        this.enJuego = enJuego;
    }

    public Casilla getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Casilla posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Casilla getPosicionAnterior() {
        return posicionAnterior;
    }

    public void setPosicionAnterior(Casilla posicionAnterior) {
        this.posicionAnterior = posicionAnterior;
    }
}
