/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ford;

import abstractfactory.interfaces.IAbstractCarroSport;

/**
 *
 * @author Michele
 */
public class Mustang implements IAbstractCarroSport {


    @Override
    public void driveFast() {
        System.out.println("Mustang.driveFast() chamado.");
    }
    
}
