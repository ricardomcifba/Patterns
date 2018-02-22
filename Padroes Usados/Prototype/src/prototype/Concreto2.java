/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import prototype.interfaces.IPrototype;

/**
 *
 * @author Michele
 */
public class Concreto2 implements IPrototype {
    
    public Concreto2(){
        System.out.println("Concreto2 construído.");
    }

    @Override
    public IPrototype getClone() {
        return new Concreto2();
    }

    @Override
    public void action() {
        System.out.println("Concreto2.action() chamado.");
    }
    
}
