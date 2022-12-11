/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujado;

import entidades.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;

/**
 *
 * @author joshi
 */
public class dibujaCircular implements IDibujar {

    @Override
    public void dibujar(Graphics2D g2d, Casilla casilla, int numCasillasAspa, int TAMANIOCASILLA) {
        if (casilla.getTipoCasilla().equalsIgnoreCase("circulo")) {
            Shape punta = null;
            g2d.setStroke(new BasicStroke(2));
            if (casilla.getLugarcirculo() != null) {
                int x = casilla.getCoordenadaX();
                int y = casilla.getCoordenadaY();
                if (numCasillasAspa % 2 == 0) {
                    switch (casilla.getLugarcirculo()) {
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
    }

}
