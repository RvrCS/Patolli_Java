/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import entidades.Juego;
import entidades.Jugador;
import java.util.Random;

/**
 *
 * @author River
 */
public class controlPartida implements IFuenteConocimiento{

    @Override
    public void updateBlackboard(String command, Object obj) {
        if(command.equalsIgnoreCase("unirJugador")){
            this.unirsePartida(obj);
        }
        if (command.equalsIgnoreCase("empezarJuego")) {
            this.empezarPartida();
        }
        if (command.equalsIgnoreCase("cambiarTurno")) {
            this.cambiarTurno();
        }
    }
    
    public void unirsePartida(Object obj){
        Jugador jugador = (Jugador)obj;
        
        blackboard.juego.addJugador(jugador);
        
        System.out.println("NOTIFICAR: Jugador "+ jugador.getNombre() + " se unio a la partida!");
        
        blackboard.notifyObservers("unirse", blackboard.juego);
        
    }
    
    public void empezarPartida(){
        blackboard.juego.empezarPartida();
        System.out.println("NOTIFICAR: Se ha empezado la partida");
        
        blackboard.notifyObservers("iniciaPartida", blackboard.juego);
    }
    

    
    public void cambiarTurno(){
        blackboard.juego.setTurno();
        System.out.println("NOTIFICAR: Se ha cambiado el turno");
        
        blackboard.notifyObservers("turno", blackboard.juego);
    }
}
