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
public class Cliente {

    private SomadorEsperado somador;

    public Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }

    public void executar() {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = somador.somaVetor(vetor);
        System.out.println(" Resultado : " + soma);
    }
}
