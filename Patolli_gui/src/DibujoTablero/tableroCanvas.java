package DibujoTablero;


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
	private int ancho;
	private int alto;
	private int anchoPantalla;
	private Graphics2D g2d;
	protected final int ANCHO=50;
	protected final int ALTO=50;
	
	
	public tableroCanvas(LinkedList<Casilla> casillas, int numCasillasAspa, int anchoPantalla) {
		this.casillas = casillas;
		this.numCasillasAspa = numCasillasAspa;
		this.anchoPantalla=anchoPantalla/4;
		this.ancho = casillas.size() * 50 + 50 * 3;
		this.alto=ancho;
		inicializar();
	}
	
	private void inicializar() {
		this.setBackground(new Color(0, 0, 0, 0));
	}
	
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
	
	public LinkedList<Casilla> generarCasillas() {
		int tamanioCasilla = 50;
		int casilla = 0;
		int x = anchoPantalla;
		int y = 0;
		if (numCasillasAspa % 2 == 0) {
			//Verticales arriba izquierda
			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.TOP,null,"circulo"));
			casilla++;
			y += tamanioCasilla;
			//casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.TOP_LEFT_A,"triangulo"));
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
			
			//Horizontal izquierda arriba
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
			//casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.LEFT_TOP_A,"triangulo"));
			casillas.add(new Casilla(x, y, casilla,null,null,"normal"));
			casilla++;
			x -= tamanioCasilla;
			casillas.add(new Casilla(x, y, casilla, LugarSemicirculo.LEFT,null,"circulo"));
			casilla++;
			y += tamanioCasilla;
			
			//Horizontal izquierda abajo
			casillas.add(new Casilla(x, y, casilla, null,null,"circulo"));
			casilla++;
			x += tamanioCasilla;
			//casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.LEFT_BOTTOM_A,"triangulo"));
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
			//casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.BOTTOM_LEFT_B,"triangulo"));
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

			//casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.BOTTOM_RIGHT_A,"triangulo"));
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
//			casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.RIGHT_BOTTOM_B,"triangulo"));
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
			
			//casillas.add(new Casilla(x, y, casilla,null, LugarTriangulo.RIGHT_TOP_A,"triangulo"));
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
//			casillas.add(new Casilla(x, y, casilla, null,LugarTriangulo.TOP_RIGHT_B,"triangulo"));
		}
		return casillas;
	}
	
	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
	
	public void setCasillas(LinkedList<Casilla> casillas) {
		this.casillas = casillas;
	}
	
	public void dibujarCentro(Graphics2D g2d,Casilla casilla, int numCasillasAspa) {
		Graphics g;
		g2d.setStroke(new BasicStroke(2));
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.CYAN);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.fill(rect);
		g2d.draw(rect);
		g2d.setColor(Color.BLACK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.draw(rect);
		
	}
	    public void dibujarCirculo(Graphics2D g2d,Casilla casilla) {
		Shape punta = null;
		g2d.setStroke(new BasicStroke(2));
		if (casilla.getLugarcirculo() != null) {
			int x = casilla.getCoordenadaX();
			int y = casilla.getCoordenadaY();
			if (numCasillasAspa % 2 == 0) {
				switch ( casilla.getLugarcirculo()) {
					case TOP:
						punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 0, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x + ANCHO, y, x + ANCHO, y + ALTO);
						break;
					case LEFT:
						punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 90, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.setStroke(new BasicStroke(2));
						g2d.drawLine(x, y + ALTO, x + ANCHO, y + ALTO);
						break;
					case BOTTOM:
						punta = new Arc2D.Double(x, y - ALTO, ANCHO * 2, ALTO * 2, 180, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x + ANCHO, y, x + ANCHO, y + ALTO);
						break;
					case RIGHT:
						punta = new Arc2D.Double(x - ANCHO, y, ANCHO * 2, ALTO * 2, 270, 180, Arc2D.OPEN);
						g2d.setColor(Color.GRAY);
						g2d.fill(punta);
						g2d.setColor(Color.BLACK);
						g2d.drawLine(x, y + ALTO, x + ANCHO, y + ALTO);
						break;
				}
			} //else {
//				switch (casilla.getLugarcirculo()) {
//					case TOP:
//						punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 0, 180, Arc2D.OPEN);
//						break;
//					case LEFT:
//						punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 90, 180, Arc2D.OPEN);
//						break;
//					case BOTTOM:
//						punta = new Arc2D.Double(x, y - ALTO, ANCHO * 2, ALTO * 2, 180, 180, Arc2D.OPEN);
//						break;
//					case RIGHT:
//						punta = new Arc2D.Double(x - ANCHO, y - ALTO, ANCHO * 2, ALTO * 2, 270, 180, Arc2D.OPEN);
//						break;
//				}
//			}
		}
		if (punta != null) {
			g2d.setColor(Color.BLACK);
			g2d.draw(punta);
		}
	}
		
	public void dibujarTriangulo(Graphics2D g2d,Casilla casilla) {
		
		int x = casilla.getCoordenadaX();
		int y = casilla.getCoordenadaY();
		Polygon triangulo = null;
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.PINK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.fill(rect);
		
		
		g2d.setColor(Color.RED);

		switch (casilla.getLugarTriangulo()) {
//			case TOP_LEFT_A:
//				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO / 2), y + ALTO, y + (ALTO / 2) * 3}, 3);
//				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO), y + (ALTO+25), y + (ALTO / 2) * 4}, 3);
//				break;
			case TOP_LEFT:
//				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO / 2), y + ALTO, y + (ALTO / 2) * 3}, 3);
				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO/20), y + (ALTO/2), y + (ALTO / 2) * 2}, 3);
				break;
//			case LEFT_TOP_A:
//				triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
//				triangulo = new Polygon(new int[]{x + (ANCHO/20), x+(ANCHO/2), x + ANCHO }, new int[]{y, y + ALTO, y}, 3);
//				break;
			case LEFT_TOP:
				//triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
				triangulo = new Polygon(new int[]{x + (ANCHO/20), x+(ANCHO/2), x + (ANCHO /2) * 2}, new int[]{y, y + ALTO, y}, 3);
				break;
//			case LEFT_BOTTOM_A:
//				//triangulo = new Polygon(new int[]{x + (ANCHO / 2), x + ANCHO, x + (ANCHO / 2) * 3}, new int[]{y + ALTO, y, y + (ALTO)}, 3);
//				triangulo = new Polygon(new int[]{x + ANCHO, x + ANCHO+25, x + (ANCHO /2) * 4}, new int[]{y + ALTO, y, y + (ALTO)}, 3);
//				break;
			case LEFT_BOTTOM:
				//triangulo = new Polygon(new int[]{x + (ANCHO / 2), x + ANCHO, x + (ANCHO / 2) * 3}, new int[]{y + ALTO, y, y + (ALTO)}, 3);
				triangulo = new Polygon(new int[]{x + (ANCHO/20),  x+(ANCHO/2), x + (ANCHO /2) * 2}, new int[]{y + ALTO, y, y + (ALTO)}, 3);
				break;
			case BOTTOM_LEFT:
				//triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO / 2), y + ALTO, y + (ALTO / 2) * 3}, 3);
				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO / 20), y +(ALTO/2), y + (ALTO / 2) * 2}, 3);
				break;
//			case BOTTOM_LEFT_B:
//				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO / 2), y + ALTO, y + (ALTO / 2) * 3}, 3);
//				triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y - ALTO , y - (ALTO/2), y + (ALTO / 20) }, 3);
//				break;
//			case BOTTOM_RIGHT_A:
//				triangulo = new Polygon(new int[]{x + ANCHO, x, x + ANCHO}, new int[]{y - (ALTO / 2), y, y + (ALTO / 2)}, 3);
//				break;
			case BOTTOM_RIGHT:
//				triangulo = new Polygon(new int[]{x + ANCHO, x, x + ANCHO}, new int[]{y - (ALTO / 2), y, y + (ALTO / 2)}, 3);
				triangulo = new Polygon(new int[]{x + ANCHO, x, x + ANCHO}, new int[]{y + (ALTO / 20), y+(ALTO/2), y + (ALTO / 2) * 2}, 3);
				break;
			case RIGHT_BOTTOM:
//				triangulo = new Polygon(new int[]{x + (ANCHO / 2), x + ANCHO, x + (ANCHO / 2) * 3}, new int[]{y + (ALTO), y, y + (ALTO)}, 3);
				triangulo = new Polygon(new int[]{x + (ANCHO / 20), x + (ANCHO/2), x + (ANCHO / 2) * 2}, new int[]{y + (ALTO), y, y + (ALTO)}, 3);
				break;
//			case RIGHT_TOP_A:
//				triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
//				break;
			case RIGHT_TOP:
//				triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
				triangulo = new Polygon(new int[]{x + (ANCHO / 20), x+ (ANCHO/2), x + (ANCHO / 2)*2}, new int[]{y, y + ALTO, y}, 3);
				break;
			case TOP_RIGHT:
				//triangulo = new Polygon(new int[]{x + (ANCHO), x, x + (ANCHO)}, new int[]{y - (ALTO / 2), y, y + (ALTO / 2)}, 3);
				triangulo = new Polygon(new int[]{x + (ANCHO), x, x + (ANCHO)}, new int[]{y + (ALTO/20 ),  y + (ALTO/2),  y + (ALTO / 2) * 2}, 3);
				break;
		}

		if (triangulo != null) {
			g2d.fill(triangulo);
			g2d.drawPolygon(triangulo);
		}
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
	
	public void dibujarPropia(Graphics2D g2d,Casilla casilla) {
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.GREEN);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.fill(rect);
		g2d.draw(rect);
		g2d.setColor(Color.BLACK);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.draw(rect);
	}
	
	public void dibujarNormal(Graphics2D g2d,Casilla casilla) {
		Rectangle rect = new Rectangle();
		g2d.setColor(Color.pink);
		rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
		g2d.fill(rect);
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
}
