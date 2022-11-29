
package elements;

import entidades.Juego;
import observer.AbstractObservable;


public class blackboard extends AbstractObservable{
    
    public static Juego juego = Juego.getInstance();

    public static Juego getJuego() {
        return juego;
    }

    public static void setJuego(Juego juego) {
        blackboard.juego = juego;
    }
    
   
    
}
