/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author Victor Oliveira
 */
public class Inverte extends Basica{

    @Override
    public String transformar(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString(); 
    }
    
}
