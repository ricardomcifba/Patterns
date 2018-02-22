/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ford;

import abstractfactory.interfaces.IAbstractCarroEconomico;

/**
 *
 * @author Michele
 */
public class Focus implements IAbstractCarroEconomico {

    @Override
    public void driveSlow() {
        System.out.println("Focus.driveSlow() chamado.");
    }


    
}
