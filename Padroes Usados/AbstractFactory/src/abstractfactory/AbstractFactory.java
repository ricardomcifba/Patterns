
package abstractfactory;

import gm.GMFactory;
import ford.FordFactory;
import abstractfactory.interfaces.IAbstractCarroEconomico;
import abstractfactory.interfaces.IAbstractCarroSport;
import abstractfactory.interfaces.IAbstractFactory;

public class AbstractFactory {

    
    public static void main(String[] args) {
        System.out.println("Demonstração da AF");
        
        System.out.println("Contruindo a fábrica");
        
        IAbstractFactory fabrica1 = new FordFactory();
        IAbstractFactory fabrica2 = new GMFactory();
        
        System.out.println("Contruindo carros");
        
        IAbstractCarroSport carro1 = fabrica1.createCarroSport();
        IAbstractCarroEconomico carro2 = fabrica1.createCarroEconomico();
        IAbstractCarroSport carro3 = fabrica2.createCarroSport();
        IAbstractCarroEconomico carro4 = fabrica2.createCarroEconomico();
        
        System.out.println("Chamando motorista");
        
        carro1.driveFast();
        carro2.driveSlow();
        carro3.driveFast();
        carro4.driveSlow();
        
        System.out.println();
        
    }
    
}
