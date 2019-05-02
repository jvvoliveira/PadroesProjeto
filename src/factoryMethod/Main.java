/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main(String []args){
        //podemos criar as várias fábricas para serem usadas pelas várias stores
        NomeFactoryBR fabrica = new NomeFactoryBR();
        NomeStore cartorio = new NomeStore(fabrica);
        
        Nome n1 = cartorio.criarNome("normal","João","Victor");
        Nome n2 = cartorio.criarNome("invertido","Diogo","Oliveira");
        Nome n3 = cartorio.criarNome("invertido","Natacha","de Lima");
        Nome n4 = cartorio.criarNome("normal","Bruna","Calazans");
        
        System.out.println("Os nomes foram: ");
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4);
    }
}
