/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import elements.blackboard;
import entidades.Jugador;

/**
 *
 * @author River
 */
public class controlPartida implements IFuenteConocimiento{

    @Override
    public void updateBlackboard(String command, Object obj) {
        if(command.equalsIgnoreCase("partidaCreada")){
            this.unirsePartida(obj);
        }
    }
    
    public void unirsePartida(Object obj){
        Jugador jugador = (Jugador)obj;
        blackboard.juego.addJugador(jugador);
        
        
        
        System.out.println("NOTIFICADO!: \nJugador: "+ jugador.getNombre() + "se unio a la partida!");
    }
}
