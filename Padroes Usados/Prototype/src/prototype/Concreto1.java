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
public class Concreto1 implements IPrototype {

    public Concreto1() {
        System.out.println("Concreto1 construído.");
    }

    @Override
    public IPrototype getClone() {
        return new Concreto1();
    }

    @Override
    public void action() {
        System.out.println("Concreto1.action() chamado.");
    }
    
}
