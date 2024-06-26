import java.util.HashMap;
import java.util.Map;       
import java.util.Objects;                                                                                       
                                                                                                                
/**                                                                                                             
 * classe acquisto per ricapitolare le varie bancarelle da cui si è fatto acquisti per un determinato giocattolo
 *                                                                                                              
 */                                                                                                             
public class Acquisto {                                                                                         
    private final Giocattolo g;                                                                                         
    private int quantità = 0;                                                                                         
    private int prezzo = 0;                                                                                           
    private final Map<Bancarella, Integer> elenco = new HashMap<>();                                                                                           
                                         
    public Acquisto(Giocattolo g){       
        Objects.requireNonNull(g);       
        this.g = g;                      
    }                                    
                                                                                                                
    /**                                                                                                         
     * method to add a purchase from a specific bancarella                                                      
     *                                                                                                          
     *  updates the prezzo and the quantità                                                                     
     *                                                                                                          
     * @param b bancarella da cui si è comprato                                                                 
     * @param n numero di acquisto                                                                              
     *                                                                                                          
     */                                                                                                         
    public void add(Bancarella b, int n){                      
        Objects.requireNonNull(b);                               
        elenco.put(b, n);                                             
        //update prezzo                                               
        prezzo += b.whatPrice(g, n);                                  
        quantità += n;                                                   
    }                                                                 
                                                                      
    public String toString(){                                         
        String s = "Acquisto di : " +g.toString();                    
        for(Map.Entry<Bancarella, Integer> entry : elenco.entrySet()){
            s += "\n" + entry.getKey().toString() + " " + entry.getValue();
        }                                     
        return s;                                            
    }                                         
                                              
    public int size(){                        
        return elenco.size();                 
    }                                         
                                                                      
}                                                                                      
                                                                                       