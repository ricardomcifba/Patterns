/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.interfaces;

/**
 *
 * @author Michele
 */
public interface IAbstractFactory {
    
    public IAbstractCarroEconomico createCarroEconomico();
    public IAbstractCarroSport createCarroSport();
    
    
}
