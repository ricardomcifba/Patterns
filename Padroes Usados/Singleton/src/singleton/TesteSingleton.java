
package singleton;

public class TesteSingleton {
    
    public static void main(String[] args){
        
        System.out.println("Exemplo Singleton");
        
        System.out.println("1ª instancia");
        
        Singleton s1 = Singleton.getInstance();
        System.out.println("S1.getInfo()= "+ s1.getInfo());
        
        Singleton s2 = Singleton.getInstance();
        
        System.out.println("S2.getInfo()= "+ s2.getInfo());
        
        System.out.println("S1.getValue(42)= "+ s1.getValue());
        
        s1.setValue(42);
        
        System.out.println("S1.getValue()= "+ s1.getValue());
        System.out.println("S2.getValue()= "+ s2.getValue());
       
             
    }
    
}
