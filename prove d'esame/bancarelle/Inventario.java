import java.util.HashMap;
import java.util.Map;
import java.util.Objects;                 
                                                               
/**                                                                
 * classe per la rappresentazione dell'inventario di una bancarella
 *                                                                    
 * IR:                                                                
 * AF:                                                                      
 */                                                                         
public class Inventario {                                                   
                                                                                                   
    private final Map<Giocattolo, Integer> g2q = new HashMap<>();                                  
                                                                                                          
    /**                                                                                                   
     * method for removing a giocattolo from the bancarella inventory       
     *                                                                      
     * the giocattolo is always guaranteed to be owned by the calling method                                    
     *                                                                                                    
     * @param g Giocattolo to remove                                                                      
     * @param q quantity to remove                                                                       
     *                                                                                                    
     */                                                                                                   
    public void remove(Giocattolo g, int q){                                                              
        if(contains(g)){                                                                                  
            if(g2q.get(g) == 1){                                                                          
                g2q.remove(g);                                                                            
                return;                                                                                   
            }                                                                                             
            g2q.put(g, g2q.get(g) -q);                                                                    
        }                                                                                               
    }                                                                                                     
                                                                                             
    /**                                                                                      
     * method to initialize the inventory of the bancarella by recieving a list of Giocattolo
     *                                                
     * @param g Giocattolo selected                   
     * @param n numbers of Giocattolo to add                                                                              
     * @throws NullPointerException if g is null                                                 
     */                                                         
    public void aggiungi(int n, Giocattolo g)throws NullPointerException{                     
        Objects.requireNonNull(g);                               
        g2q.put(g,n);                                            
    }                                                                                     
                                                                 
    /**                                                          
     * method to check if a bancarella has a giocattolo          
     *                                                           
     * @param g giocattolo to look for                                                 
     * @return if the giocattolo is present in the listino or not
     *                                                       
     */                                                          
    public boolean contains(Giocattolo g){                                                         
        return howMany(g) != 0;                                                        
    }                                                        
                                                             
    /**                                                      
     * method to know how many giocattolo the Bancarella owns
     *                                        
     * @param g giocattolo to look for                                              
     * @return  the number of giocattolo owned
     *                                                         
     */                                                        
    public int howMany(Giocattolo g){                          
        return g2q.getOrDefault(g, 0);                         
    }                                                          
                                                               
    @Override                                                  
    public String toString(){                                  
        String s = "{";                                        
        for(Map.Entry<Giocattolo, Integer> e : g2q.entrySet()){
            s += "\n" + e.getKey() + " -> " + e.getValue();
        }                                                  
        return s + "}";
    }                                                          
                                                               
}                                                                                                  
                                                                                                   