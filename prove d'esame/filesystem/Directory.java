import java.util.Collections;
import java.util.HashSet;                                     
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;                                         
                                                              
/**                                                                                
 * classe concreta e mutable per la creazione di entry di tipo directory                    
 *                                                                                          
 */                                                                                         
public class Directory extends Entry implements Iterable<Entry>{                                                       
                                                                                            
    private final Set<Entry> contenuti = new HashSet<>();                                   
                                                                                            
    /**                                                                                     
     * metodo costruttore per una Directory data da un nome e il suo path assoluto          
     * entrambi i parametri sono controllati dal metodo super riguardo alla loro correttezza
     *                                                                                      
     * @param nome nome della directory                                                                 
     * @param path path della directory                                                     
     *                                                                                      
     */                                                                                     
    public Directory(final String nome, final String[] path) {                              
        super(nome, path);                                                                  
    }                                                                           
                                                                                   
    /**                                                                            
     * metodo per l'aggiunta di una nuova entry non gia presente nella Directory   
     *                                                                             
     * @param e                                                                    
     * @throws NullPointerException                                                
     */                                                                            
    public void add(Entry e)throws NullPointerException {                          
        Objects.requireNonNull(e);                                                 
        if( ! contains(e.getNome())) contenuti.add(e);                                                       
    }                                                                              
                                                                                            
    /**                                                                                     
     * metodo per verificare la presenza di una entry all'interno della directory           
     *                                                                                      
     * @param nome entry ricercata                                                                  
     * @return se la entry e' presente o meno nella directory                               
     *                                                                                      
     */                                                                                     
    public boolean contains(String nome){                                                       
        for(Entry e : contenuti) if(e.getNome().equals(nome)) return true;      
        return false;                                                           
    }                                                                           
                                                                                
    public Entry get(final String nome){                                        
        for(Entry e : contenuti) if(e.getNome().equals(nome)) return e;         
        return null;                                                     
    }                                                                    
                                                                                            
    @Override                                                                     
    public int dimensione(){                                                      
        int dimensione = 0;                                                       
        for(Entry e: contenuti){                                                  
            dimensione += e.dimensione();                                         
        }                                                                         
        return dimensione;                                                        
    }                                                                             
                                                                                  
    @Override                                                                     
    public Iterator<Entry> iterator() {                                           
        return Collections.unmodifiableSet(contenuti).iterator();
    }                                                                             
                                                                                  
}                                                                                 
                                                                                  