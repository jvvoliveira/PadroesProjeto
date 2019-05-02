/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Oliveira
 */
public class SistemaDeAlarme extends Observable implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        alarmar();
    }
    public void alarmar(){
        System.out.println("Alarme tocando...");
        acionarProtocoloDeSeguranca();
    }
    
    public void acionarProtocoloDeSeguranca(){
        this.setChanged();
        this.notifyObservers();
    }
}
