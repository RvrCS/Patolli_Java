
package elements;

import entidades.Juego;
import entidades.Jugador;
import observer.IObservable;
import observer.IObserver;


public class blackboard implements IObservable{
   
   private static blackboard bb;
   public static Juego juego = Juego.getInstance();

    public blackboard() {
        this.addObserver(new controlBlackboard());
    }
   
   public void añadirJugador(Jugador jugador){
       
       System.out.println("Notificare que un jugador se quiere unir a partida");
       notifyObservers("unirJugador", jugador);
   }
   public void empezarPartida(){
       System.out.println("Notificare que un jugador ha iniciado la partida");
       notifyObservers("empezarJuego", null);
   }

   public void tirarCania(){
       System.out.println("Notificare que un jugador ha tirado las cañas");
       notifyObservers("tirarCania", null);
   }
   
   public void sacarFicha(){
       System.out.println("Notificare que un jugador sacado una ficha");
       notifyObservers("sacarFicha", null);
   }
   
   public void cambiarTurno(){
       System.out.println("Notificare que se ha cambiado el turno");
       notifyObservers("cambiarTurno", null);
   }
   
   public void moverFicha(){
       System.out.println("Notificare que un jugador a movido una ficha");
       notifyObservers("moverFicha", null);
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
   
    public static blackboard getInstance(){
        if (bb == null) {
            bb = new blackboard();
        }
        return bb;
    }
}
