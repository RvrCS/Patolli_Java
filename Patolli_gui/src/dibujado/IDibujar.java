
package dibujado;

import entidades.Casilla;
import java.awt.Graphics2D;

public interface IDibujar {
    
    public void dibujar(Graphics2D g2d,Casilla casilla, int numCasillasAspa, int TAMANIOCASILL);
    
}
