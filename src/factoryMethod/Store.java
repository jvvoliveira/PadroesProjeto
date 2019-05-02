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
public abstract class Store {
   protected Factory fabrica; 
   
   public Store(Factory fabrica){
        this.fabrica = fabrica;
    }
    
    public abstract Nome criarNome(String tipo, String nome, String sobreNome);
}
