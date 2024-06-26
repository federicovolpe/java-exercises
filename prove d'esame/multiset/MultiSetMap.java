import java.util.Collections;    
import java.util.HashMap;        
import java.util.Iterator;                                          
import java.util.Map;                                
import java.util.Objects;                                                        
                                                                                  
public class MultiSetMap<E> implements MultiSet<E> {                
                                                                    
    private final Map<E, Integer> m = new HashMap<>();              
                                                                                  
    @Override                                                                     
    public Iterator<E> iterator() {                                                  
        return Collections.unmodifiableSet(m.keySet()).iterator();         
    }                                                                             
                                                                                  
    @Override                                                                     
    public int add(Object o) {                                                    
        Objects.requireNonNull(o);        
                                          
        @SuppressWarning(“unchecked”)                                              
        E e = (E) o;                                                            
        m.put(e, multiplicity(e) +1);                                           
        return multiplicity(o);                                                 
    }                                                                             
                                                                                  
    @Override                                                                     
    public int remove(Object o) {                                                     
        m.remove(o);                                                                  
        return multiplicity(o);                                                       
                                                                                      
    }                                                                                 
                                                                                      
    @Override                                                                         
    public int multiplicity(Object o) {                                               
        return m.getOrDefault(o, 0);                                          
    }                                                                                 
                                                                                      
    @Override                                                                         
    public int size() {                                                               
        return m.size();                                                       
    }                                                                                 
                                                                                      
    @Override                                                                         
    public MultiSet<E> union(MultiSet<? extends E> o) {                                               
        MultiSetMap<E> nuovo = new MultiSetMap<>();                   
        for(E e : o){                                                 
            nuovo.m.put(e, Math.max(multiplicity(e), o.multiplicity(e)));                                          
        }                                                                    
        for(E e : this){                                                              
            nuovo.m.put(e, Math.max(multiplicity(e), o.multiplicity(e)));                                          
        }                                                                             
        return nuovo;                                                                 
    }                                                                                 
                                                                                      
    @Override                                                                         
    public MultiSet<E> intersection(MultiSet<? extends E> o) {                                        
        MultiSetMap<E> nuovo = new MultiSetMap<>();                          
        for(E e : o){                                                        
            if(contains(e))                                                  
                nuovo.m.put(e, Math.min(multiplicity(e), o.multiplicity(e)));
        }                                                                   
        return nuovo;                              
    }                                                                                 
                                                                                      
    @Override                                                                         
    public String toString(){                                                         
        String s = size() + "{";                                                                
        for(E e: this) {                           
            s += e + " = " + multiplicity(e) + ", ";         
        }                                          
        return s + "}";                                  
    }                                                                                 
                                                                                      
}                                                                                     
                                                                                      