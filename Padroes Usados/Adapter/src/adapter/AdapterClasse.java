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
public class AdapterClasse extends Adaptee implements IAlvo {

    public AdapterClasse() {
        System.out.println("AdapterClasse() construido.");
    }

    @Override
    public String novoPedido() {
        return velhoPedido();
    }
    
}
