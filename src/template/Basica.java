/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.Scanner;

/**
 *
 * @author Victor Oliveira
 */
public abstract class Basica {
    private Scanner in = new Scanner(System.in);
    
    public final void executarOperacao(){ //template (esqueleto da operação padrão)
        String mensagem = ler();
        mensagem = transformar(mensagem);
        imprimir(mensagem);
    }
    
    public String ler(){
        System.out.println("Insira mensagem: ");
        return in.nextLine();
    }
    public abstract String transformar(String s);
    
    public void imprimir(String m){
        System.out.println(m);
    }
}
