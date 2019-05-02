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
public class Incremental {

    private static Incremental incremental;
    private static int count = 0;
    private int numero;

    //construtor é privado para usar padrão Singleton
    private Incremental() {
        numero = ++count;
    }

    public static synchronized Incremental getInstance() {
        if (incremental == null) {
            incremental = new Incremental();
        }
        return incremental;
    }

    public String toString() {
        return " Incremental " + numero;
    }
}
//mesma classe acima, sem usar padrão singleton

//public class Incremental {
//
//    private static int count = 0;
//    private int numero;
//
//    public Incremental() {
//        numero = ++count;
//    }
//
//    public String toString() {
//        return " Incremental " + numero;
//    }
//}
