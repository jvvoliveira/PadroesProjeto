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
public class Dia extends DiaDaSemana{
    //mensagem do tipo CapacidadeExibirMensagem já tem
    Dia(){//começando na segunda
        mensagem = new Segunda();
    }
    
    //mostrar dia já tem
    
    public void setNomeDia(CapacidadeExibirMensagem m){
        mensagem = m;
    }
    
}
