/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author River
 */
public interface IObservable {
   
    final List<IObserver> observers = new ArrayList<>();
    
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers(String command, Object source);
    
}
