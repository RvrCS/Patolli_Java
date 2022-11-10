package entidades;

public class Jugador {

	private String nombre;
	private int fondo;
	private String color;

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
}
