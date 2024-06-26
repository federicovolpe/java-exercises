                           
public class VettoreNullo implements Vettore {                                                           
                                                                                                         
    private int size;                                                                                    
                                                                                                         
    public VettoreNullo (int n){                                                                         
        if(size < 1) throw new IllegalArgumentException("il vettore nullo non può avere dimensione < 1");
        size = n;                                                                                        
    }                                                                                                    
                                                                                                         
    @Override                                                                                            
    public int dim() {                                                                                   
        return size;                                                                                     
    }                                                                                                    
                                                                                                         
    @Override                                                                                            
    public int val(int i) {                                                                              
        if(i < size && i > -1) return 0;                                                       
        throw new IllegalArgumentException("il vettore nullo deve essere acceduto nel suo range");
    }                                                                                          
                                                                                               
    @Override                                                                                  
    public Vettore per(int alpha) {                                                            
        return new VettoreNullo(size);                                                    
    }                                                                                          
                                                                                               
    @Override                                                                                  
    public Vettore più(Vettore v) {                                                            
        if(v.dim() != this.dim()) throw new IllegalArgumentException("per sommare un vettore deve avere la stessa misura");  
        if(v instanceof VettoreNullo){                                                      
            System.out.println("somma per un vettore nullo, ritorno lo stesso");                                                               
            return new VettoreNullo(size);                                                                                
        }else{                                                                              
            return v;                     
        }                                                                                   
    }                                                                                       
                                                                                            
    @Override                                                                               
    public String toString(){    
        String s = "";                                                           
        for(int i =0 ; i < size; i++){
            s += ", 0";          
        }                        
        return s + "]";                                                                
    }                                                                                       
                                                                                            
}                                                                                           
                                                                             