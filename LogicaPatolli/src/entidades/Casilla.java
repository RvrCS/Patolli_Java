package entidades;

public class Casilla {
	private boolean disponible;
	private Ficha ficha;
	private int coordenadaX;
	private int coordenadaY;
	private int numero;
	private LugarSemicirculo lugarcirculo;
	private LugarTriangulo lugarTriangulo;
	private String tipoCasilla;
	
	public Casilla() {
		
	}

	 public Casilla(int coordenadaX, int coordenadaY, int numero,LugarSemicirculo lugarcirulo,LugarTriangulo lugarTriangulo,String tipoCasilla) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.numero=numero;
		this.tipoCasilla=tipoCasilla;
		this.lugarcirculo = lugarcirulo;
		this.lugarTriangulo = lugarTriangulo;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LugarSemicirculo getLugarcirculo() {
		return lugarcirculo;
	}

	public void setLugarcirculo(LugarSemicirculo lugarcirculo) {
		this.lugarcirculo = lugarcirculo;
	}

	public LugarTriangulo getLugarTriangulo() {
		return lugarTriangulo;
	}

	public void setLugarTriangulo(LugarTriangulo lugarTriangulo) {
		this.lugarTriangulo = lugarTriangulo;
	}

	public String getTipoCasilla() {
		return tipoCasilla;
	}

	public void setTipoCasilla(String tipoCasilla) {
		this.tipoCasilla = tipoCasilla;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	
}
