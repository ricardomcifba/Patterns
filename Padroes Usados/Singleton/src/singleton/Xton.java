/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Michele
 */
public class Xton {
    
    private static final List <Xton> instancias = new ArrayList<Xton>();
    private static int count = 0;
    private static int total=5;
    
    protected Xton(){ 
        
    }
    
   /*  como pedir para usuario determinar quantidade de instancias
    public void initialize(int valor){
        if(total == valor){
            return;            
        }
        else {
            total = valor;
            count = 0;
        }
        
    }*/
    
    public static synchronized Xton getInstance(){
        
        Xton instancia = null;
        
        if(instancias.size()== total){
            instancia = instancias.get(count%total);
        }
        else{
            instancia = new Xton();
            instancias.add(instancia);
        }
        count++;
        return instancia;            
    }

}
