/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.interfaces.IAlvo;

/**
 *
 * @author Michele
 */
public class AdapterObjeto extends Adaptee implements IAlvo {
    
    private Adaptee adaptee;

    public AdapterObjeto() {
        System.out.println("AdapterObjeto() construido.");
    }

    @Override
    public String novoPedido() {
        if(adaptee == null){
            adaptee = new Adaptee();
        }
        return adaptee.velhoPedido();
    }
    
}
