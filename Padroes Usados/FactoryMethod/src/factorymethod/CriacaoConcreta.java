/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.interfaces.INegocio;
import factorymethod.interfaces.ICriacao;

/**
 *
 * @author Michele
 */
public class CriacaoConcreta implements ICriacao{

    public INegocio factoryMethod(){
        return new NegocioConcreto();
    }
}
