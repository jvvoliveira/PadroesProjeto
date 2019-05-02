/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main(String []args){
        
        DelegaciaPolicia delegacia = new DelegaciaPolicia();//observador
        EmpresaSeguro empresa = new EmpresaSeguro();//observador
        
        SistemaDeAlarme sistema = new SistemaDeAlarme();//observador e observável
        sistema.addObserver(delegacia);
        sistema.addObserver(empresa);
        
        Sensor s1 = new Sensor();//observável
        s1.addObserver(sistema);
        
        Sensor s2 = new Sensor();//observável
        s2.addObserver(sistema);
        
        Sensor s3 = new Sensor();//observável
        s3.addObserver(sistema);
        
//        s1.acionarSistema();
//        s2.acionarSistema();
        s3.acionarSistema();
    }
}
