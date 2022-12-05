
package elements;

import entidades.Juego;
import entidades.Jugador;
import observer.AbstractObservable;


public class blackboard extends AbstractObservable{
    
    public static Juego juego = Juego.getInstance();


   public void añadirJugador(Jugador jugador){
       juego.addJugador(jugador);
       notifyAll();
   }
    
}
