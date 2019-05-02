/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Victor Oliveira
 */
public class Colchetes extends SinaisDePontuacao{
    private Decorator numero;
    
    public Colchetes(Decorator d){
        numero = d;
    }

    @Override
    public String print() {
        return "["+numero.print()+"]";
    }
    
}
