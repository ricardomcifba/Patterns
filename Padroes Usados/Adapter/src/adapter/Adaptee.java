package adapter;


public class Adaptee {
    
    public Adaptee(){
            System.out.println("Adaptee constriuido.");
    }
    
    public String velhoPedido(){
        return "Adaptee.velhoPedido() chamado.";
    }
    
}
