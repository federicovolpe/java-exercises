import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;                   
import java.util.Objects;                        
                                                       
/**                                                                    
 * classe atta a rappresentare il path della directory o file          
 *                                                                                        
 * RI: il path non puo' contenere file al suo interno ma solo alla fine                   
 * AF: path di una entry dato dalla lista di directory                                    
 */                                                                                            
public class Path implements Iterable<String> {                                                                                          
                                                                                                             
    private final String[] path;                                                                          
                                                                                                             
    /**                                                                                                      
     * metodo costruttore per un path                                                                        
     *                                                                                                       
     * @lista lista delle entry rappresentante il path                                                      
     * @throws IllegalArgumentException se il path non e' valido perche' ha un a entry non directory in mezzo                  
     *                                                                                                       
     */                                                                                                      
    public Path(final String lista) throws NullPointerException, IllegalArgumentException{  
        String[] entries = lista.split(":");                                                                             
        for(String e : entries){                                                                                
            Objects.requireNonNull(e);                                                                       
        }                                                                                                      
                                                                                                             
        path = entries;                                                                                        
    }                                                                                                        
                                                                                                             
    public String[] getPath() {                                                                              
        return path;                                                                                         
    }                                                                                       
                                                                                  
    @Override                                                                     
    public Iterator<String> iterator() {                                                  
        return Collections.unmodifiableList(Arrays.asList(path)).iterator();
    }                                                                                                        
}                                                                                                            
                                                                                                             