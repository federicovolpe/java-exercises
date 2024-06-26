import java.util.ArrayList;                                                      
import java.util.List;                                                           
import java.util.Objects;                                                        
                                                                                 
public class BoolVectDenso extends AbstractVect {                                 
                                                                                 
    private final List<Boolean> booleans;                                                    
                                                                                             
    public BoolVectDenso(final ArrayList<Boolean> v) throws NullPointerException {                   
        Objects.requireNonNull(v, "the starting vector cannot be null");                     
        booleans = new ArrayList<>(v);                                                       
    }                                                                                        
                                                                                             
    @Override                                                                                
    public void set(int i, boolean v) throws IllegalArgumentException {                      
        if(i < 0) throw new IllegalArgumentException("l'indice del set negativo ");
        for(int j = booleans.size(); j < i; j++){
            
        }                    
    }                                                                                        
                                                                                             
    @Override                                                                                
    public boolean get(int i) throws IllegalArgumentException {                              
        // TODO Auto-generated method stub                                                   
        throw new UnsupportedOperationException("Unimplemented method 'get'");               
    }                                                                                        
                                                                                             
    @Override                                                                                
    public BoolVect and(BoolVect v) {                                                        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'and'");
    }                  

    @Override
    public BoolVect or(BoolVect v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'or'");
    }                                         
                                              
    @Override                                 
    public BoolVect xor(BoolVect v) {         
        // TODO Auto-generated method stub    
        throw new UnsupportedOperationException("Unimplemented method 'xor'");
    }                                         
                                              
}                                             