/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import entidades.Juego;

/**
 *
 * @author River
 */
public class controlPartida implements IFuenteConocimiento{

    @Override
    public void updateBlackboard() {
        if(Juego.getInstance() != null){
           this.agregarJugador();
        }
        
    }
    
    public void agregarJugador(){
        System.out.println("Jugador agregado a partida");
    }
    
    public void pasarTurno(){
        System.out.println("Siguiente jugador");
    }
    
    public void terminarPartida(){
        
    }
    
}
