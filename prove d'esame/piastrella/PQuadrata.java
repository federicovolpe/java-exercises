/**                                                                                 
 * classe immutabile per un tipo di piastrella quadrata                          
 *                                                                                  
 * IR: la superficie deve essere positiva assieme al costo unitario                 
 * AF: piastrella quadrata rappresentata dalla sua superficie e il costo unitario
 *                                                                                  
 */                                                       
public class PQuadrata extends Piastrella {                                  
                                                                             
    private final int superficie;                                                       
                                                                                        
    /**                                                                                 
     * constructor per la classe piastrella quadrata                                    
     *                                                                                  
     * @param lato lato della piastrella                                                
     * @param prezzo prezzo della piastrella                                            
     * @throws IllegalArgumentException se il lato o il prezzo sono negativi
     *            
     */                                                                                 
    public PQuadrata(final int lato, final int prezzo) throws IllegalArgumentException {                     
        super(prezzo);                                                                  
                                                                                        
        if(lato < 1) throw new IllegalArgumentException("il lato non puo essere < 0");         
        this.superficie = lato * lato;                                                                                              
    }                                                                                          
                                                                                               
    @Override                                                                                           
    public int superficie() {                                                                           
        return superficie;                                                                     
    }                                                                                          
                                                                                               
}                                                                                              
                                                                                               