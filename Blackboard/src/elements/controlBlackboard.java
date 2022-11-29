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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void loop(){
        for (IFuenteConocimiento fuente : fuentesC) {
            fuente.updateBlackboard();
        }
    }
    
}
