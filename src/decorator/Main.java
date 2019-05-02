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
public class Main {
    public static void main (String []args){
        
        Decorator n = new Numero1();
        System.out.println(n.print());
        
        n = new Parenteses(n);
        System.out.println(n.print());

        n = new Chaves(n);
        n = new Colchetes(n);
        n = new Aspas(n);
        n = new Aspas(n);
        n = new Aspas(n);
        n = new Parenteses(n);
        System.out.println(n.print());
    }
}
