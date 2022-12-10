/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import fuentesConocimiento.*;
import java.util.ArrayList;
import java.util.List;
import observer.IObserver;

/**
 *
 * @author River
 */
public class controlBlackboard implements IObserver{

    private List<IFuenteConocimiento> fuentesC = new ArrayList<>();
    private static controlBlackboard singletonControlBlackboard;
    
    public controlBlackboard(){
        this.inicializar();
    }
    
    private void inicializar(){
        
        fuentesC.add(new controlPartida());
        fuentesC.add(new controlFicha());
        fuentesC.add(new controlApuesta());
        
    }
    
    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equalsIgnoreCase("unirse")){
            System.out.println("Un jugador se ha unido a la partida");
        }
        if(command.equalsIgnoreCase("iniciaPartida")){
            System.out.println("Se ha iniciado la partida.");
            
        }
        if(command.equalsIgnoreCase("turno")){
            System.out.println("Se ha cambiado el turno");
        }
        if(command.equalsIgnoreCase("tirar")){
            System.out.println("Se han tirado cañas");
        }
        if(command.equalsIgnoreCase("sacar")){
            System.out.println("Se ha sacado una ficha");
        }
        if(command.equalsIgnoreCase("mover")){
            System.out.println("Se ha movido una ficha");
        }
        
        System.out.println("El juego se ha actualizado: "+ source.toString());
    }
    
    public void getFuente(String command, Object source){
        for (IFuenteConocimiento fuente : fuentesC) {
            fuente.updateBlackboard(command, source);
        }
    }
    
    public static controlBlackboard getInstance(){
        if(singletonControlBlackboard == null){
            singletonControlBlackboard = new controlBlackboard();
        }
        
        return singletonControlBlackboard;
        
    }
    
    
    
}
