/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Victor Oliveira
 */
public class Sensor extends Observable{
    
    public Sensor(){
        super();
    }
    
    public void acionarSistema(){
        this.setChanged();
        this.notifyObservers();
    }
    
}
