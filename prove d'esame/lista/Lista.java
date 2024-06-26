import java.util.List;              
import java.util.ArrayList;         
                                           
public class Lista <T extends Object> {                         
    List<T> l;                                      
                                                 
    /*                                           
     * metodo costruttore per una lista vuota    
     */                                          
    public Lista(){                              
        this.l = new ArrayList<T>();              
    }                                            
                                                 
    public void add(T o){                        
        l.add(o);                          
    }                                         
}                                            
                                             