/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main (String []args){
        Dia d = new Dia();
        d.mostrarDia();
        d.setNomeDia(new Terca());
        d.mostrarDia();
        d.setNomeDia(new Sabado());
        d.mostrarDia();
        d.mostrarDia();
        d.setNomeDia(new Quarta());
        d.mostrarDia();
    }
}
