package dibujado;

import entidades.Casilla;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

public class dibujaTriangulo implements IDibujar {

    @Override
    public void dibujar(Graphics2D g2d, Casilla casilla, int numCasillasAspa, int TAMANIOCASILLA) {
        if (casilla.getTipoCasilla().equalsIgnoreCase("triangulo")) {
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
                    triangulo = new Polygon(new int[]{x, x + TAMANIOCASILLA, x}, new int[]{y + (TAMANIOCASILLA / 20), y + (TAMANIOCASILLA / 2), y + (TAMANIOCASILLA / 2) * 2}, 3);
                    break;
                case LEFT_TOP:
                    triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA / 20), x + (TAMANIOCASILLA / 2), x + (TAMANIOCASILLA / 2) * 2}, new int[]{y, y + TAMANIOCASILLA, y}, 3);
                    break;
                case LEFT_BOTTOM:
                    triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA / 20), x + (TAMANIOCASILLA / 2), x + (TAMANIOCASILLA / 2) * 2}, new int[]{y + TAMANIOCASILLA, y + 2, y + TAMANIOCASILLA}, 3);
                    break;
                case BOTTOM_LEFT:
                    triangulo = new Polygon(new int[]{x, x + TAMANIOCASILLA, x}, new int[]{y + (TAMANIOCASILLA / 20), y + (TAMANIOCASILLA / 2), y + (TAMANIOCASILLA / 2) * 2}, 3);
                    break;
                case BOTTOM_RIGHT:
                    triangulo = new Polygon(new int[]{x + TAMANIOCASILLA, x, x + TAMANIOCASILLA}, new int[]{y + (TAMANIOCASILLA / 20), y + (TAMANIOCASILLA / 2), y + (TAMANIOCASILLA / 2) * 2}, 3);
                    break;
                case RIGHT_BOTTOM:
                    triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA / 20), x + (TAMANIOCASILLA / 2), x + (TAMANIOCASILLA / 2) * 2}, new int[]{y + (TAMANIOCASILLA), y + 2, y + (TAMANIOCASILLA)}, 3);
                    break;
                case RIGHT_TOP:
                    triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA / 20), x + (TAMANIOCASILLA / 2), x + (TAMANIOCASILLA / 2) * 2}, new int[]{y, y + TAMANIOCASILLA, y}, 3);
                    break;
                case TOP_RIGHT:
                    triangulo = new Polygon(new int[]{x + (TAMANIOCASILLA), x, x + (TAMANIOCASILLA)}, new int[]{y + (TAMANIOCASILLA / 20), y + (TAMANIOCASILLA / 2), y + (TAMANIOCASILLA / 2) * 2}, 3);
                    break;
            }

            if (triangulo != null) {
                g2d.fill(triangulo);
                g2d.drawPolygon(triangulo);
            }
            g2d.setColor(Color.BLACK);
            g2d.draw(rect);
        }
    }

}
