import java.util.Objects;
import java.util.Set;                                                            
                                                                                     
/**                                                                                  
 * class for A compratore which decides where to buy based on the cheapest Bancarella
 */                                                                                  
public class CompratoreLineare implements Compratore {                               
                                                                                     
    Set<Bancarella> bancarelle;                                                   
                                                                                     
    /**                                                                              
     * constructor method for a Compratore which needs to know a list of bancarelle  
     *                                                                               
     * @param g                                                                               
     * @param quantità                                                                        
     * @return                                                                                
     */                                                                                       
    public CompratoreLineare(final Set<Bancarella> b){                                        
        Objects.requireNonNull(b);                                             
        System.out.println("creato il compratore con "+b.size()+" bancarelle");                                                          
        this.bancarelle = b;                                                                  
    }                                                                                         
                                                                                                                  
    @Override                                                                                                     
    public Acquisto compra(final Giocattolo g, int quantità) {                              
        Acquisto a = new Acquisto(g);                                                                                  
        while(quantità > 0){                                                                                                     
            //scelta di un candidato                                                                                             
            Bancarella candidate = null;                                                                                         
            int priceCandidate = Integer.MAX_VALUE;                                                                              
                                                                                                                                 
            for(Bancarella b : bancarelle){                                                                                                               
                if(b.howMany(g) > 0 && b.whatPrice(g,1) < priceCandidate) {                                                      
                    priceCandidate = b.whatPrice(g, 1);                                                                          
                    candidate = b;                                                                                               
                    System.out.println("scelto il candidato: "+ b +" con "+ b.howMany(g)+" al prezzo unitario di "+b.whatPrice(g, 1));               
                }                                                                                                                
            }                                                                                                                    
                                                                                                                                 
            if(candidate != null){                                                                                               
                int q = Math.min(candidate.howMany(g), quantità);                                                                
                quantità -= q;                                                                                                   
                System.out.println("compro da "+candidate+" "+ q+" ne avanzano "+ quantità);                                      
                a.add(candidate, q);                                                                                             
                candidate.vendi(g, priceCandidate);                                                                              
                candidate = null;                                                                                                
                priceCandidate = Integer.MAX_VALUE;                                       
            }                                                                             
                                                                                          
        }                                                                                 
        return a;                                                                                                        
    }                                                                                                             
}                                                                                                                 
                                                                                                                  