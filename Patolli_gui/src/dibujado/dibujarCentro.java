package dibujado;

import entidades.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class dibujarCentro implements Dibujar {

    @Override
    public void dibujar(Graphics2D g2d, Casilla casilla, int numCasillasAspa, int TAMANIOCASILLA) {
        if (casilla.getTipoCasilla().equalsIgnoreCase("centro")) {
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
    }

}
