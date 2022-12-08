
package elements;

import entidades.Juego;
import entidades.Jugador;
import observer.IObservable;
import observer.IObserver;


public class blackboard implements IObservable{
    
   public static Juego juego = Juego.getInstance();

    public blackboard() {
        this.addObserver(new controlBlackboard());
    }

   

   
   
   public void añadirJugador(Jugador jugador){
       
       System.out.println("Notificare que un jugador se quiere unir a partida");
       notifyObservers("unirJugador", jugador);
   }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String command, Object source) {
        for (IObserver observer : observers) {
            observer.notifyObserver(command, source);
        }
    }
   
    
}
