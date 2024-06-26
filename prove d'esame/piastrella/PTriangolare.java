/**                                                                                 
 * classe immutabile per un tipo di piastrella triangolare                          
 *                                                                                  
 * IR: la superficie deve essere positiva assieme al costo unitario                 
 * AF: piastrella triangolare rappresentata dalla sua superficie e il costo unitario
 *                                                                                  
 */                                                                                 
public class PTriangolare extends Piastrella {                                      
                                                                                    
    private final int superficie;                                                       
                                                                                        
    /**                                                                                 
     * constructor per la classe piastrella triangolare                                                   
     *                                                                                                  
     * @param base base del triangolo                    
     * @param altezza altezza del triangolo                                                                
     * @param prezzo prezzo della piastrella                                                            
     * @throws IllegalArgumentException se il lato o il prezzo sono negativi
     *                                                   
     */                                                                                                 
    public PTriangolare (final int base, final int altezza, final int prezzo) throws IllegalArgumentException {                     
        super(prezzo);                                                                                  
                                                                                                        
        if(base < 1 || altezza < 1) throw new IllegalArgumentException("le dimensioni non possono essere < 0");         
        this.superficie = (base * altezza)/2 ;                                                                                              
    }                                                                                                   
                                                                                                        
    @Override                                                                                           
    public int superficie() {                                                                           
        return superficie;                                                     
    }                                                                                                   
                                                                                                        
}                                                                                                       
                                                                                    