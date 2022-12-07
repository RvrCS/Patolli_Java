
package elements;

import entidades.Juego;
import entidades.Jugador;
import observer.AbstractObservable;


public class blackboard extends AbstractObservable{
    
   public static Juego juego = Juego.getInstance();

    public blackboard() {
        this.addObserver(new controlBlackboard());
    }

   

   
   
   public void añadirJugador(Jugador jugador){
       System.out.println("NOTIFICARE!");
       notifyObservers("partidaCreada", jugador);
   }
   
    
}
