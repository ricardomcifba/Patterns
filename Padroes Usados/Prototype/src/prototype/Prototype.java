
package prototype;

import prototype.interfaces.IPrototype;


public class Prototype {

    
    public static void main(String[] args) {
        System.out.println("Exemplo Prototype");
        
        System.out.println("Criação de Prototype");
        
        IPrototype prototype1 = new Concreto1();
        IPrototype prototype2 = new Concreto2();
        
        IPrototype clone1 = prototype1.getClone();
        IPrototype clone2 = prototype2.getClone();
        
        clone1.action();
        clone2.action();
        
        System.out.println();
    }
    
}
