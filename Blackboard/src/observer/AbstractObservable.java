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
public abstract class AbstractObservable implements IObservable{
    
    private final List<IObserver> observers = new ArrayList<>();
    
    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String command, Object source) {
        for (IObserver observer : observers) {
            System.out.println("NOTIFIQUE!");
            observer.notifyObserver(command, source);
        }
    }
    
    
}
