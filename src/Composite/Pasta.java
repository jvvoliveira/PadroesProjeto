/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Oliveira
 */
public class Pasta extends Item{
    private String nome;
    private List<Item> diretorios;
    
    public Pasta(String nome){
        this.nome = nome;
        diretorios = new ArrayList<>();
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void addItem(Item item){
        diretorios.add(item);
    }
    public void removeItem(int i){
        diretorios.remove(i);
    }
    public Item getItem(int i){
        return diretorios.get(i);
    }
    public void exibirItens(){
        System.out.println("---"+this.nome+"---");
        System.out.println();
        for(Item item : this.diretorios){
            item.print();
        }
    }
    private void exibirItens(String estilo){
        System.out.println(estilo+this.nome);
        for(Item item : this.diretorios){
            item.print();
        }
    }
    public void print(){
        this.exibirItens("-");
        System.out.println();
    }
}
