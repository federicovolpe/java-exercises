import java.util.Objects;     
                              
/**                                                                             
 * classe astratta per la rappresentazione di una entry che sia directory o file
 * determinata dal suo nome                                                                            
 */                                                                                                    
public abstract class Entry{  
                                                                                                       
    private final String nome;
    private final Path path;                                                                         
                                                                                                       
    /**                                                                                                
     * metodo costruttore per una entry                                                                    
     *                                                                                                     
     * @param nome il nome della entry                                                                     
     * @throws NullPointerException se il nome e' null                                                     
     * @throws IllegalArgumentException se il nome e' una stringa vuota                                    
     *                                                                                                     
     */                                                                                                    
    public Entry(final String nome, final Path path){                                                                        
        Objects.requireNonNull(nome);                                                                      
        if(nome.length() == 0) throw new IllegalArgumentException("la entry deve avere un nome non vuoto");
                                                                                                       
        this.nome = nome;                          
        this.path = path;                                                                              
    }                                                
                                                     
    public String getNome() {                        
        return nome;                                                                                       
    }                                                
                                                     
    @Override                                      
    public boolean equals(Object o){               
        if(o instanceof Entry){                    
            Entry e = (Entry) o;                   
            return this.nome.equals(e.nome);                         
        }                                          
        return false;                              
    }                                              
                                                                                                           
    /**                                                                                                    
     * metodo per il calcolo della dimensione delle entry                                                  
     *                                                                                                     
     * @return la dimensione della entry specificata                                                       
     */                                                                                                    
    int dimensione(){return 0;}         
                                        
    @Override                           
    public int hashCode(){              
        return Objects.hash(nome, path);
    }                                   
}                                                                                                          