import java.util.ArrayList;                           
import java.util.Iterator;                            
import java.util.List;                                
import java.util.Objects;                                                       
                                                                             
public class MultiSetList<E>implements MultiSet<E> {                         
                                                                             
    private final List<E> elems = new ArrayList<>(); 
                                                                             
    @Override                                                                
    public int add(Object o) {                                               
        Objects.requireNonNull(o);                                              
        E e = (E) o;                                                            
        elems.add(e);                                                           
        return multiplicity(e);                                                 
    }                                                                           
                                                                                
    @Override                                                                   
    public int remove(Object o) {                                               
        elems.remove(o);                                                      
        return multiplicity(o);                                               
    }                                                                           
                                                                                
    @Override                                                                   
    public int size() {                                                         
        return elems.size();                                                   
    }                                                                           
                                                                                      
    @Override                                                                         
    public MultiSet<E> union(MultiSet<? extends E> o) {                                               
        MultiSetList<E> nuovo = new MultiSetList<>();               
                                                                    
        for(E e : o){                                               
            int max = Math.max(o.multiplicity(e), multiplicity(e));                                
            for(int i = max; i > 0; i --){           
                nuovo.add(e);                                                         
            }                                                                         
        }                                                                             
        return nuovo;                                                                 
    }                                                                                 
                                                                                      
    @Override                                                                         
    public MultiSet<E> intersection(MultiSet<? extends E> o) {                                        
        // TODO Auto-generated method stub                                            
        throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    }                                                                                    
                                                                                         
    @Override                                                                            
    public Iterator<E> iterator() {                                                      
        return new Iterator<E> () {                        
                                                           
            int index = -1;                                   
            E next = null;                                    
                                                                                         
            @Override                                                                    
            public boolean hasNext() {                                                   
                if(next == null){                             
                    while(index < elems.size()-1){              
                        index ++;                             
                        E candidate = elems.get(index);       
                        if(elems.indexOf(candidate) == index){
                            next = candidate;              
                            return true;                      
                        }                                               
                    }                                                   
                    return false;                                                
                }                                                                     
                return true;                                                          
            }                                                                            
                                                                                         
            @Override                                                                    
            public E next() {                                           
                if(! hasNext()) throw new IndexOutOfBoundsException();
                                       
                if(next != null){                                       
                    E tmp = next;                                       
                    next = null;                                        
                    return tmp;                                                      
                }                                                                     
                return null;                                                          
            }                                                                            
                                                                                         
        };                                                                               
    }                                                                                    
                                                    
    public String toString(){                       
        String s = "{";                                       
        for(E e : this){                                             
            s += e + " - " + multiplicity(e) + "\n";                 
        }                                                            
        return s + "}";                                              
    }                                                                
                                                                     
    @Override                                                        
    public int multiplicity(Object o) {
        int counter = 0;                              
        for(E e : elems){              
            if(e == o) counter++;      
        }                        
        return counter;                
    }                                                                
}                                                                                     
                                                                                      