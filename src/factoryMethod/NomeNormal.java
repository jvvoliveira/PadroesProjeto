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
public class NomeNormal extends Nome {

    public NomeNormal(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    @Override
    public String toString() {
        return this.getNome()+" "+this.getSobreNome();
    }
    
}
