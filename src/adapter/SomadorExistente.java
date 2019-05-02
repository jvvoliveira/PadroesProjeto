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
import java.util.List;

public class SomadorExistente {

    public int somaLista(List< Integer> lista) {
        int resultado = 0;
        for (int i : lista) {
            resultado += i;
        }
        return resultado;
    }

}
