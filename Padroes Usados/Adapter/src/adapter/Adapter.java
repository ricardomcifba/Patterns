/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.interfaces.IAlvo;


public class Adapter {

    
    public static void main(String[] args) {
        System.out.println("Exemplo Adapter");
        
        IAlvo alvo1 = new AdapterClasse();
        IAlvo alvo2 = new AdapterObjeto();
        
        System.out.println("Alvo1.novoPedido()"+ alvo1.novoPedido());
        System.out.println("Alvo2.novoPedido()"+ alvo2.novoPedido());
    }
    
}
