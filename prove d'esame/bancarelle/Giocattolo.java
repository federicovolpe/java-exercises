import java.util.Objects;

public class Giocattolo{                                              
    private final String nome;                                        
    private final String materiale;                                   
                                                                      
    /**                                                               
     * constructor method for a giocattolo                            
     *                                                                
     * @param n name of the giocattolo                                
     * @param m material of the giocattolo                            
     * @throws NullPointerException if one of the two argument is null
     *                                                               
     */                                                              
    public Giocattolo(String n, String m) throws NullPointerException{
        Objects.requireNonNull(n);                                   
        Objects.requireNonNull(m);                                   
        this.nome = n;                                               
        this.materiale = m;                                          
    }                                                                
                                                                      
    public String toString(){                                         
        return nome + " di " + materiale;                             
    }                                                                 
                                                                      
    /**                                                               
     * method getter for the final field materiale                    
     *                                                                
     * @return a String                                               
     *                                                               
     */                                                              
    public String materiale(){                                       
        return materiale;                                            
    }                                                                
                                                                     
    /**                                                              
     * method getter for the final field nome                        
     *                                                               
     * @return a String                                              
     *                                                               
     */                                                                  
    public String nome(){                                                
        return nome;                                                     
    }                                                                    
                                                                         
    @Override                                                            
    public boolean equals(Object o){                                      
        if(o instanceof Giocattolo){                                     
            Giocattolo g = (Giocattolo) o;                                                 
            return g.nome.equals(nome) && g.materiale.equals(materiale);                                                            
        }                                                                
        return false;                                                          
    }                                                           
                                                                
    @Override                                                   
    public int hashCode(){                                      
        return Objects.hash(nome, materiale);                   
    }                                                           
}                                                                        