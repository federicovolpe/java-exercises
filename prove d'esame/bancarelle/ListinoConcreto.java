import java.util.HashMap;                                                          
import java.util.Map;
import java.util.Objects;                                                              
                                                                                   
public class ListinoConcreto implements Listino {                                  
                                                                                   
    Map<Giocattolo, Integer> g2p = new HashMap<>();                                
                                                                                   
    /**                                                                            
     * constructor mehtod for th Listino concreto                                  
     *                                                                             
     * @param m map of Giocattolo integer representing the listino                 
     *                                                                             
     */                                                                            
    public ListinoConcreto(Map<Giocattolo, Integer> m) throws NullPointerException{
        Objects.requireNonNull(m);                                                 
        g2p = m;                                                                   
    }                                                                              
                                                                                   
    @Override                                                                      
    public int prezzo(Giocattolo g, int quantità){                                 
        return g2p.get(g) * quantità;                                              
    }                                                                                                                                                     
                                                  
                                                                                  
                                                                                   
}                                                                                  
                                                                                   