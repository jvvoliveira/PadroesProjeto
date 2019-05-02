/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main(String[] args) {
        //o cliente só sabe somar com somador esperado, porém só temos o somador
        //existente. A classe Adapter vai fazer possível essa comunicação.        
        SomadorExistente somadorExist = new SomadorExistente();
        AdapterSomadorExistente somador = new AdapterSomadorExistente(somadorExist);
        Cliente cliente = new Cliente(somador);
        cliente.executar();
    }
}
