import java.util.List;                             
import java.util.ArrayList;                                
import java.util.Objects;                                  
                                                           
public class Coda <T> {                                    
    private List<T> items ;                                
                                                           
    /*                                                     
     * metodo costruttore per la coda vuota                
     */                                                    
    public Coda(){                                         
        items = new ArrayList();                                                 
    }                                                                            
                                                                                 
    /*                                                                           
     * method that enqueues the item o to the queue                              
     * @param o the item to enqueue to the queue                                 
     * @return the size of the queue                                             
     * @throws NullPointerException if o is null                                 
     */                                                                          
    public int enqueue(T o) throws NullPointerException {                         
        Objects.requireNonNull(o, "item cannot be null");                        
        items.add(o);                              
        return size();                                                          
    }                                                                            
                                                                                 
    /*                                                                           
     * method for dequeuing an item from the queue                               
     * @return the item dequeued                                                 
     * @throws NullPointerException if the queue is empty                        
     *                                                                           
     */                                                                          
    public T dequeue() throws NullPointerException {                                   
       if(isEmpty()){                                       
            throw new NullPointerException("la coda [ vuota");
       }                                                      
       return items.remove(0);                 
    }                                          
                                               
    /*                                         
     * methods that checks if the queue is empty
     * @returns if the queue is empty       
     *                                      
    */                                                        
    public boolean isEmpty(){                                         
        return items.isEmpty();                                           
    }                                          
                                            
    /*                                      
     * methods to know the size of the queue
     * @return the size of the queue int
     * 
     */                                     
    public int size(){                                            
        return items.size();                                                          
    }                                                         
}                                                             
                                                              