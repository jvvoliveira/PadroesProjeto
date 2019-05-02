/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----Maiúsculo-----");
        Basica string1 = new Maiusculo();
        string1.executarOperacao();
        
        System.out.println("-----Minúsculo-----");
        Basica string2 = new Minusculo();
        string2.executarOperacao();
        
        System.out.println("-----Duplica-----");
        Basica string3 = new Duplica();
        string3.executarOperacao();
        
        System.out.println("-----Inverte-----");
        Basica string4 = new Inverte();
        string4.executarOperacao();
    }
}
