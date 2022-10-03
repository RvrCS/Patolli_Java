package entidades;

public class Casilla {
	private boolean disponible;
	private Ficha ficha;

	public Casilla() {
		this.disponible = true;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	
}
