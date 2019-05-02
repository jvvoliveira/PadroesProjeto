/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Victor Oliveira
 */
public class Sabado implements CapacidadeExibirMensagem{
    @Override
    public void exibirMensagem() {
        System.out.println("Fim de semana: Sabado!!!");
    }
}
