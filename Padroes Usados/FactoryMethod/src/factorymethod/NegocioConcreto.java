/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.interfaces.INegocio;

/**
 *
 * @author Michele
 */
public class NegocioConcreto implements INegocio {

    public NegocioConcreto() {
    }

    @Override
    public void acao() {
        System.out.println("NegocioConctreto.acao() chamado.");
    }
    
}
