package dibujado;


import entidades.Casilla;
import entidades.LugarSemicirculo;
import entidades.LugarTriangulo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.util.LinkedList;
import javax.swing.JPanel;

public class tableroCanvas extends JPanel{
	private LinkedList<Casilla> casillas;
	private int numCasillasAspa;
	private int anchoPantalla;
	private Graphics2D g2d;
	private  final int TAMANIOCASILLA = 25;
	
	
	/**
	 * Método constructor que recibe e instancia los valores  enviados
	 * @param casillas
	 * @param numCasillasAspa
	 * @param anchoPantalla 
	 */
	
	public tableroCanvas(LinkedList<Casilla> casillas, int numCasillasAspa, int anchoPantalla) {
		this.casillas = casillas;
		this.numCasillasAspa = numCasillasAspa;
		this.anchoPantalla=anchoPantalla/6;
		inicializar();
	}
	
	/**
	 * Metodo que pone en blanco el fondo de la ventana
	 */
	private void inicializar() {
		this.setBackground(new Color(0, 0, 0, 0));
	}
	
	
	/**
	 * Metodo que dibuja todas las casillas del tablero, estas se dibujan mediante la lista Casillas
	 * @param g 
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.g2d = (Graphics2D) g;
		for (Casilla casilla : casillas) {
			if (casilla.getTipoCasilla().equalsIgnoreCase("centro")) {
				this.dibujarCentro(g2d, casilla, numCasillasAspa);
			} else if (casilla.getTipoCasilla().equalsIgnoreCase("circulo")) {
				this.dibujarCirculo(g2d, casilla);
			}else if (casilla.getTipoCasilla().equalsIgnoreCase("triangulo")) {
				this.dibujarTriangulo(g2d, casilla);
			 }else if (casilla.getTipoCasilla().equalsIgnoreCase("propia")) {
				 this.dibujarPropia(g2d, casilla);
			} else {
				this.dibujarNormal(g2d, casilla);
			}
		}
	}
	
	/**
	 * Metodo que genera todas las casillas del juego
	 * Aqui se calcula en donde se dibujara espesificamente cada casilla
	 * @return 
	 */
	
	public LinkedList<Casilla> generarCasillas() {
		int tamanioCasilla = TAMANIOCASILLA;
		int casilla = 0;
		int x = anchoPantalla;
		int y = 0;
		if (numCasillasAspa % 2 == 0) {
			//Verticales arriba izquierda
			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.TOP,null,"circulo"));
			casilla++;
			y += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			y += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.TOP_LEFT,"triangulo"));
			casilla++;
			y += tamanioCasilla;
			
			for (int i = 0; i < (numCasillasAspa / 2) - 3; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				y += tamanioCasilla;
			}
			
			casillas.add(new Casilla(x, y, casilla,null,null,"centro"));
			casilla++;
			x -= tamanioCasilla;
			
			casillas.add(new Casilla(x, y, casilla,null,null,"propia"));
			casilla++;
			x -= tamanioCasilla;
			
			for (int i = 0; i < (numCasillasAspa / 2) - 4; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				x -= tamanioCasilla;
			}
			
			casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.LEFT_TOP,"triangulo"));
			casilla++;
			x -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			x -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.LEFT,null,"circulo"));
			casilla++;
			y += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, null,null,"circulo"));
			casilla++;
			x += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			x += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.LEFT_BOTTOM,"triangulo"));
			casilla++;
			x += tamanioCasilla;
			
			for (int i = 0; i < (numCasillasAspa / 2) - 3; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				x += tamanioCasilla;
			}
			
			casillas.add(new Casilla(x, y, casilla,null,null,"centro"));
			casilla++;
			y += tamanioCasilla;

			//Vertical abajo izquierda
			casillas.add(new Casilla(x, y, casilla,null,null,"propia"));
			casilla++;
			y += tamanioCasilla;

			for (int i = 0; i < (numCasillasAspa / 2) - 4; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				y += tamanioCasilla;
			}
			
			casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.BOTTOM_LEFT,"triangulo"));
			casilla++;
			y += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			y += tamanioCasilla;

			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.BOTTOM,null,"circulo"));
			casilla++;
			x += tamanioCasilla;

			//Vertical abajo derecha
			casillas.add(new Casilla(x, y, casilla, null,null,"circulo"));
			casilla++;
			y -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			y -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.BOTTOM_RIGHT,"triangulo"));
			casilla++;
			y -= tamanioCasilla;

			for (int i = 0; i < (numCasillasAspa / 2) - 3; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				y -= tamanioCasilla;
			}

			casillas.add(new Casilla(x, y, casilla,null,null,"centro"));
			casilla++;
			x += tamanioCasilla;

			//Horizontal derecha abajo
			casillas.add(new Casilla(x, y, casilla,null,null,"propia"));
			casilla++;
			x += tamanioCasilla;
			
			for (int i = 0; i < (numCasillasAspa / 2) - 4; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				x += tamanioCasilla;
			}

			casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.RIGHT_BOTTOM,"triangulo"));
			casilla++;
			x += tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			x += tamanioCasilla;

			casillas.add(new Casilla(x, y, casilla, null,null,"circulo"));
			casilla++;
			y -= tamanioCasilla;

			//Horizontal derecha arriba
			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.RIGHT,null,"circulo"));
			casilla++;
			x -= tamanioCasilla;
			
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			x -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.RIGHT_TOP,"triangulo"));
			casilla++;
			x -= tamanioCasilla;
			
			for (int i = 0; i < (numCasillasAspa / 2) - 3; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				x -= tamanioCasilla;
			}
			
			casillas.add(new Casilla(x, y, casilla,null,null,"centro"));
			casilla++;
			y -= tamanioCasilla;
			//Vertical arriba derecha
			casillas.add(new Casilla(x, y, casilla,null,null,"propia"));
			casilla++;
			y -= tamanioCasilla;
			 for (int i = 0; i < (numCasillasAspa / 2) - 4; i++) {
				casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
				casilla++;
				y -= tamanioCasilla;
			}
			casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.TOP_RIGHT,"triangulo"));
			casilla++;
			y -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
		}
		return casillas;
	}
	
	/**
	 * Metodo que establece una lista de casillas por otra recibida en el parametro
	 * @param casillas 
	 */
	public void setCasillas(LinkedList<Casilla> casillas) {
		this.casillas = casillas;
	}
	
	/**
	 * Metodo que dibuja exclusivamente la casilla del centro, mediante los parametros recibidos
	 * @param g2d
	 * @param casilla
	 * @param numCasillasAspa 
	 */
	public void dibujarCentro(Graphics2D g2d,Casilla casilla, int numCasillasAspa) {
		Graphics g;
		g2d.setStroke(new BasicStroke(2));
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.CYAN);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.fill(rect);
		g2d.draw(rect);
		g2d.setColor(Color.BLACK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.draw(rect);
		
	}
	
	/**
	 * Metodo que dibuja exclusivamente el final de las aspas de el tablero, mediante los parametros recibidos
	 * @param g2d
	 * @param casilla 
	 */
	    public void dibujarCirculo(Graphics2D g2d,Casilla casilla) {
		Shape punta = null;
		g2d.setStroke(new BasicStroke(2));
		if (casilla.getLugarcirculo() != null) {
			int x = casilla.getCoordenadaX();
			int y = casilla.getCoordenadaY();
			if (numCasillasAspa % 2 == 0) {
				switch ( casilla.getLugarcirculo()) {
					case TOP:
						punta = new Arc2D.Double(x, y, TAMANIOCASILLA * 2, TAMANIOCASILLA * 2, 0, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x + TAMANIOCASILLA, y, x + TAMANIOCASILLA, y + TAMANIOCASILLA);
						break;
					case LEFT:
						punta = new Arc2D.Double(x, y, TAMANIOCASILLA * 2, TAMANIOCASILLA * 2, 90, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.setStroke(new BasicStroke(2));
						g2d.drawLine(x, y + TAMANIOCASILLA, x + TAMANIOCASILLA, y + TAMANIOCASILLA);
						break;
					case BOTTOM:
						punta = new Arc2D.Double(x, y - TAMANIOCASILLA, TAMANIOCASILLA * 2, TAMANIOCASILLA * 2, 180, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x + TAMANIOCASILLA, y, x + TAMANIOCASILLA, y + TAMANIOCASILLA);
						break;
					case RIGHT:
						punta = new Arc2D.Double(x - TAMANIOCASILLA, y, TAMANIOCASILLA * 2, TAMANIOCASILLA * 2, 270, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x, y + TAMANIOCASILLA, x + TAMANIOCASILLA, y + TAMANIOCASILLA);
						break;
				}
			} 
		}
		
		if (punta != null) {
			g2d.setColor(Color.BLACK);
			g2d.draw(punta);
		}
	}
	
	/**
	 * Metodo que dibuja exclusivamente los triangulos del tablero, mediante los parametros recibidos
	 * @param g2d
	 * @param casilla 
	 */
	public void dibujarTriangulo(Graphics2D g2d,Casilla casilla) {
		
		int x = casilla.getCoordenadaX();
		int y = casilla.getCoordenadaY();
		Polygon triangulo = null;
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.PINK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.fill(rect);
		g2d.setColor(Color.RED);

		switch (casilla.getLugarTriangulo()) {
			case TOP_LEFT:
				triangulo = new Polygon(new int[]{x, x + TAMANIOCASILLA, x}, new int[]{y + (TAMANIOCASILLA/20), y + (TAMANIOCASILLA/2), y + (TAMANIOCASILLA / 2) * 2}, 3);
				break;
			case LEFT_TOP:
				triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA/20), x+(TAMANIOCASILLA/2), x + (TAMANIOCASILLA/2) * 2}, new int[]{y, y + TAMANIOCASILLA, y}, 3);
				break;
			case LEFT_BOTTOM:
				triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA/20),  x+(TAMANIOCASILLA/2), x + (TAMANIOCASILLA/2) * 2}, new int[]{y + TAMANIOCASILLA, y +2, y + TAMANIOCASILLA}, 3);
				break;
			case BOTTOM_LEFT:
				triangulo = new Polygon(new int[]{x, x + TAMANIOCASILLA, x}, new int[]{y + (TAMANIOCASILLA/ 20), y +(TAMANIOCASILLA/2), y + (TAMANIOCASILLA/ 2) * 2}, 3);
				break;
			case BOTTOM_RIGHT:
				triangulo = new Polygon(new int[]{x + TAMANIOCASILLA, x, x + TAMANIOCASILLA}, new int[]{y + (TAMANIOCASILLA / 20), y+(TAMANIOCASILLA/2), y + (TAMANIOCASILLA / 2) * 2}, 3);
				break;
			case RIGHT_BOTTOM:
				triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA / 20), x + (TAMANIOCASILLA/2), x + (TAMANIOCASILLA / 2) * 2}, new int[]{y + (TAMANIOCASILLA), y+2, y + (TAMANIOCASILLA)}, 3);
				break;
			case RIGHT_TOP:
				triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA/ 20), x+ (TAMANIOCASILLA/2), x + (TAMANIOCASILLA/ 2)*2}, new int[]{y, y + TAMANIOCASILLA, y}, 3);
				break;
			case TOP_RIGHT:
				triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA), x, x + (TAMANIOCASILLA)}, new int[]{y + (TAMANIOCASILLA/20 ),  y + (TAMANIOCASILLA/2),  y + (TAMANIOCASILLA/ 2) * 2}, 3);
				break;
		}
		
		if (triangulo != null) {
			g2d.fill(triangulo);
			g2d.drawPolygon(triangulo);
		}
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
	
	/**
	 * Metodo que dibuja la casilla exclusiva del jugador, mediante los parametros establecidos
	 * @param g2d
	 * @param casilla 
	 */
	public void dibujarPropia(Graphics2D g2d,Casilla casilla) {
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.GREEN);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.fill(rect);
		g2d.draw(rect);
		g2d.setColor(Color.BLACK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.draw(rect);
	}
	
	/**
	 * Metodo que dibuja exclusivamente todas las casillas normales del tablero, mediante los parametros recibidos
	 * @param g2d
	 * @param casilla 
	 */
	public void dibujarNormal(Graphics2D g2d,Casilla casilla) {
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.pink);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.fill(rect);
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
}
