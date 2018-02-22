/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gm;

import abstractfactory.interfaces.IAbstractCarroEconomico;
import abstractfactory.interfaces.IAbstractCarroSport;
import abstractfactory.interfaces.IAbstractFactory;

/**
 *
 * @author Michele
 */
public class GMFactory implements IAbstractFactory {

    @Override
    public IAbstractCarroSport createCarroSport() {
        return new Cruize();
    }

    @Override
    public IAbstractCarroEconomico createCarroEconomico() {
        return new Prisma();
    }

    
}
