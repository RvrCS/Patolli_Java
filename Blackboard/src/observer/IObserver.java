/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author River
 */
public interface IObserver {
    
    public void notifyObserver(String command, Object source);
    
}
