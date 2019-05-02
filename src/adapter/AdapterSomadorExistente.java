/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Oliveira
 */
public class AdapterSomadorExistente implements SomadorEsperado{
    SomadorExistente somador;
    
    public AdapterSomadorExistente(SomadorExistente s){
        this.somador = s;
    }
    
    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for(int i : vetor){
            lista.add(i);
        }
        return somador.somaLista(lista);
    }
    
}
