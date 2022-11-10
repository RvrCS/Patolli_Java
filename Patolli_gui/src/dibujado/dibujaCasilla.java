package dibujado;

import entidades.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;

public class dibujaCasilla {
	
	/**
	 * Metodo que dibuja exclusivamente la casilla del centro, mediante los parametros recibidos
	 * @param g2d
	 * @param casilla
	 * @param numCasillasAspa 
	 */
	public void dibujarCentro(Graphics2D g2d,Casilla casilla, int numCasillasAspa, int TAMANIOCASILLA) {
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
	    public void dibujarCirculo(Graphics2D g2d,Casilla casilla, int TAMANIOCASILLA,int numCasillasAspa ) {
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
	public void dibujarTriangulo(Graphics2D g2d,Casilla casilla, int TAMANIOCASILLA) {
		
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
	public void dibujarPropia(Graphics2D g2d,Casilla casilla,int TAMANIOCASILLA) {
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
	public void dibujarNormal(Graphics2D g2d,Casilla casilla, int TAMANIOCASILLA) {
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.pink);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), TAMANIOCASILLA, TAMANIOCASILLA);
		g2d.fill(rect);
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
}
