/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Victor Oliveira
 */
public class TesteIncremental {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //instanciando dessa maneira o count iria ser sempre incrementado a cada instância
//            Incremental inc = new Incremental(); 

            //dessa forma só é criada uma instância, todos os objetos compartilham a mesma
            Incremental inc = Incremental.getInstance(); 
            System.out.println(inc);
        }
    }
}
