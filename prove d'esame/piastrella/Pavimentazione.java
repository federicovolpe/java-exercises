import java.util.Map;                                                                                                         
import java.util.Objects;                                                                                                     
                                                                                                                              
/**                                                                                                                           
 * classe per linstanziazione di una pavimentaazione immutabile                                                               
 * caratterizzata da una serie di piastrelle o pavimentazioni e la loro quantita'                                             
 *                                                                                                                            
 * RI: superficie e costo non possono essere negative poiche' la pavimentazione deve essere composta da almeno un rivestimento
 * AF: pavimentazione formata da una serie di rivestimenti                                                                                                                         
 *                                                                                                                            
 */                                                                                                                           
public class Pavimentazione implements Rivestimento {                                                                         
                                                                                                                              
    private final int superficie;                                                                                             
    private final int costo;                                                                                                  
                                                                                                                              
    /**                                                                                                                       
     * constructor per la classe pavimentazione                                                                               
     *                                                                                                                        
     * @param lista lista di rivestimenti                                                                               
     * @throws NullPointerException se la lista e' null                                                                 
     * @trows IllegalArgumentException la pavimentazione deve avere almeno un rivestimento                              
     *                                                                                                                  
     */                                                                                                                 
    public Pavimentazione (Map<Rivestimento, Integer> lista) throws NullPointerException, IllegalArgumentException {                     
        Objects.requireNonNull(lista);                                                                                  
        if(lista.size() == 0) throw new IllegalArgumentException("la pavimentazione deve avere almeno un rivestimento");
                                
        int s = 0, p = 0;                                                                                               
        for(Map.Entry<Rivestimento, Integer> entry : lista.entrySet()){                                                 
            s += entry.getKey().superficie() * entry.getValue();                                                        
            p += entry.getKey().costo() * entry.getValue();                                                             
        }                                                                                                               
        this.superficie = s;                                                                                            
        this.costo = p;                                                                                                 
    }                                                                                                                   
                                                                                                                        
    @Override                                                                                                           
    public int superficie() {                                                                                           
        return superficie;                                                                                              
    }                                                                                                                   
                                                                               
    @Override                                                                  
    public int costo() {                                                       
        return costo;                                      
    }                                                                          
                                                           
    @Override                                              
    public String toString(){                              
        return superficie() +"  "+ costo();                
    }                                                      
}                                                                              
                                                                               