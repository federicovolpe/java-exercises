import java.util.Objects;

/**                                                                                                       
 * classe concreta bancarella che è caratterizzata da un listino, un inventario e il nome del proprietario
 *                                    
 * IR                                                           
 * AF:                                                          
 */                                                             
public class Bancarella {                                                                                 
                                                                
    private final Inventario inv ;                              
    private final Listino lst ;                                                      
    private final String proprietario;                                               
                                                                                                       
    /**                                                                                                
     * constructor for the class Bacnarella                                                            
     *                                                                                                 
     * @param p owner of the Bancarella                                                                
     * @param i inventory of the Bancarella                                                            
     * @param l listino of the Bancarella                                                              
     * @throws NullPointerException if either one of the three parameters is null                                          
     */                                                                                                
    public Bancarella(final String p, final Inventario i, final Listino l) throws NullPointerException{      
        Objects.requireNonNull(i);                                                                     
        Objects.requireNonNull(p);                                                                     
        Objects.requireNonNull(l);                                                                     
        inv = i;                                                                                       
        lst = l;                                                                                       
        proprietario = p;                                         
        System.out.println("inventario di "+ p+ " "+i.toString());                                                                            
    }                                                                                                  
                                                                                                       
                                                                  
    /**                                                                                               
     * method to sell some quantity of Giocattolo                                                          
     *                                                                                                     
     * @param g Giocattolo to sell                                                                         
     * @param n number of giocattolo to sell                                                                
     * @throws IllegalArgumentException if n is <= 0                                                       
     * @throws NullPointerException if g is null                                                           
     *                                                                                                     
     */                                                                                                    
    public void vendi(final Giocattolo g, final int n) throws IllegalArgumentException, NullPointerException{
        Objects.requireNonNull(g);                                                                     
        if(n < 1) throw new IllegalArgumentException("non si possono acquistare quantità minore di 1");                                                                                     
        inv.remove(g, n);                                                                         
                                                                                                           
    }                                                                                                      
                                                                                                           
    /**                                                                                                    
     * method to know how many g has of a certain type                                                     
     *                                                                                                     
     * @param g giocattolo to look for                                                                     
     * @return the number of g which the Bancarella posseses                                               
     *                                                                                                    
     */                                                                                                   
    public int howMany(Giocattolo g){                                                                     
        return inv.howMany(g);                                                                            
    }                                                           
                                                                
    /**                                                     
     * method to know the price of a giocattolo          
     *                                                   
     * @param g giocattolo to look for                   
     * @param quantità quantity to buy                                
     * @return the price of the giocattolo               
     *                                                   
     */                                                  
    public int whatPrice(Giocattolo g, final int quantità){        
        return lst.prezzo(g, quantità);                                        
    }                                             
                                                  
    public String toString(){                     
        return proprietario + inv.toString() + "\n";              
    }                                             
                                                  
    @Override                                     
    public int hashCode(){                        
        return Objects.hash(proprietario);        
    }                                             
}                                                                                                         
                                                                                                          