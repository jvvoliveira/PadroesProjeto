/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Victor Oliveira
 */
public class Arquivo extends Item{
    private String nome;
    private String tamanho;
    
    public Arquivo(String nome, String tamanho){
        this.nome = nome+".arq";
        this.tamanho = tamanho;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public void print(){
        System.out.println("-"+this.nome+" "+this.tamanho);
    }
    
}
