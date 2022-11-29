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
    public void updateBlackboard(String command) {
        if(command.equalsIgnoreCase("partidaCreada")){
            this.unirsePartida();
        }
    }
    
    public void unirsePartida(){
        //Actualizacion del blackboard (Juego)
        System.out.println("Jugador se unio");
    }
}
