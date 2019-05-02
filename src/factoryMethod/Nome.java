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
public abstract class Nome {
    private String nome;
    private String sobreNome;
    
    public Nome(String nome, String sobrenome){
        this.nome = nome;
        sobreNome = sobrenome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }
    public abstract String toString();
}
