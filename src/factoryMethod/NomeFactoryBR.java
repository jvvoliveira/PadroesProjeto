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
public class NomeFactoryBR extends Factory{
    @Override
    public Nome createNome(String tipo, String nome, String sobreNome){
        Nome n = null;
        if(tipo.equals("normal")){
            n = new NomeNormal(nome, sobreNome);
        }
        else if(tipo.equals("invertido")){
            n = new NomeInvertido(nome, sobreNome);
        }
        return n;
    }
}
