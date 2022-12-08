/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import elements.blackboard;
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
//        if (command.equalsIgnoreCase("tirarCania")) {
//            this.tirarCania();
//        }
//        if (command.equalsIgnoreCase("sacarFicha")) {
//            this.sacarFicha();
//            this.cambiarTurno();
//        }
        if (command.equalsIgnoreCase("cambiarTurno")) {
            this.cambiarTurno();
        }
    }
    
    public void unirsePartida(Object obj){
        Jugador jugador = (Jugador)obj;
        blackboard.juego.addJugador(jugador);
        
        System.out.println("NOTIFICADO: Jugador "+ jugador.getNombre() + " se unio a la partida!");
    }
    
    public void empezarPartida(){
        blackboard.juego.emepzarPartida();
        System.out.println("NOTIFICADO: Se ha empezado la partida");
    }
    
//    public void tirarCania(){
//        Random rad = new Random();
//        int valor = rad.nextInt(6);
//        blackboard.juego.setValorUltTiro(valor);
//        String nombre = blackboard.juego.getListaJugador().get(blackboard.juego.getTurnp()).getNombre();
//        System.out.println("NOTIFICADO: "+"Jugador: " + nombre +" Se ha tirad las cañas: " +valor );
//    }
//    
//    public void sacarFicha(){
//        String nombre = blackboard.juego.getListaJugador().get(blackboard.juego.getTurnp()).getNombre();
//        System.out.println("NOTIFICADO: "+"Jugador: " + nombre +" Ha sacado una ficha");
//    }
    
    public void cambiarTurno(){
        blackboard.juego.setTurno();
        System.out.println("NOTIFICADO: Se ha cambiado el turno");
    }
}
