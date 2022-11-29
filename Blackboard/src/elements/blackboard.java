/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import entidades.Juego;
import observer.AbstractObservable;

/**
 *
 * @author River
 */
public class blackboard extends AbstractObservable{
    
    public static Juego juego = Juego.getInstance();
    
}
