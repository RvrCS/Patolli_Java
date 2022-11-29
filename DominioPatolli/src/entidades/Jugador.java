package entidades;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

	private String nombre;
	private int fondo;
	private String color;
        private List<Ficha> fichas = new ArrayList<>();
	public Jugador(String nombre, int fondo) {
		this.nombre = nombre;
		this.fondo = fondo;
	}

	public Jugador() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas() {
        for (int i = 0; i < 6; i++) {
            this.fichas.add(new Ficha(false,null,null));
        }
    }
        
        
}
