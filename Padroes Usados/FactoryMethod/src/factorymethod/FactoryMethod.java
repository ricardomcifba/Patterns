

package factorymethod;

import factorymethod.interfaces.INegocio;
import factorymethod.interfaces.ICriacao;


public class FactoryMethod {

    
    public static void main(String[] args) {
        System.out.println("Demonstração da FM");
        
        ICriacao criacao = new CriacaoConcreta();
        
        INegocio negocio = criacao.factoryMethod();
        
        negocio.acao();
        
        System.out.println();
    }
    
}
