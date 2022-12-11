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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;

public class tableroCanvas extends JPanel{
	private LinkedList<Casilla> casillas;
	private int numCasillasAspa;
	private int anchoPantalla;
	private Graphics2D g2d;
	private  final int TAMANIOCASILLA = 25;
        private List<IDibujar> listaDibujar;
	
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
                this.listaDibujar = new ArrayList<>();
                listaDibujar.add(new dibujarNormal());
                listaDibujar.add(new dibujarPropia());
                listaDibujar.add(new dibujarCentro());
                listaDibujar.add(new dibujaCircular());
                listaDibujar.add(new dibujaTriangulo());
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
                    for (IDibujar dibuja : listaDibujar) {
                        dibuja.dibujar(g2d, casilla, numCasillasAspa, TAMANIOCASILLA);
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

}
