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
public class NomeStore extends Store{
    
    
    public NomeStore(Factory fabrica){
        super(fabrica);
    }
    
    public Nome criarNome(String tipo, String nome, String sobreNome){
        return fabrica.createNome(tipo, nome, sobreNome);
    }
}
