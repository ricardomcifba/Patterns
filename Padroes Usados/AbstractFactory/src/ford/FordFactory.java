/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ford;

import ford.Focus;
import ford.Mustang;
import abstractfactory.interfaces.IAbstractCarroEconomico;
import abstractfactory.interfaces.IAbstractCarroSport;
import abstractfactory.interfaces.IAbstractFactory;


public class FordFactory implements IAbstractFactory{

    @Override
    public IAbstractCarroSport createCarroSport() {
        return new Mustang();
    }

    @Override
    public IAbstractCarroEconomico createCarroEconomico() {
        return new Focus();
    }

    
}
