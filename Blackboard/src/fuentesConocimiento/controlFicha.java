/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import elements.blackboard;
import java.util.Random;

/**
 *
 * @author River
 */
public class controlFicha implements IFuenteConocimiento {

    @Override
    public void updateBlackboard(String command, Object obj) {
        if (command.equalsIgnoreCase("tirarCania")) {
            this.tirarCania();
        }
        if (command.equalsIgnoreCase("sacarFicha")) {
            this.sacarFicha();
            blackboard.getInstance().notifyObservers("cambiarTurno", null);
        }
        if (command.equalsIgnoreCase("moverFicha")) {
            this.moverFicha();
            blackboard.getInstance().notifyObservers("cambiarTurno", null);
        }
    }

    public void tirarCania() {
        Random rad = new Random();
        int valor = rad.nextInt(6);
        blackboard.juego.setValorUltTiro(valor);
        String nombre = blackboard.juego.getListaJugador().get(blackboard.juego.getTurno()).getNombre();
        System.out.println("NOTIFICADO: " + "Jugador: " + nombre + " Se ha tirad las cañas: " + valor);
    }

    public void sacarFicha() {
        String nombre = blackboard.juego.getListaJugador().get(blackboard.juego.getTurno()).getNombre();
        System.out.println("NOTIFICADO: " + "Jugador: " + nombre + " Ha sacado una ficha");
    }
    
    public void moverFicha(){
        String nombre = blackboard.juego.getListaJugador().get(blackboard.juego.getTurno()).getNombre();
        System.out.println("NOTIFICADO: " + "Jugador: " + nombre + " Ha movido una ficha "+ blackboard.juego.getValorUltTiro()+" casillas");
    }

}
