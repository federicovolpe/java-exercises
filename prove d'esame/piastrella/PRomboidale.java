/**                                                                                 
 * classe immutabile per un tipo di piastrella romboidale                         
 *                                                                                  
 * IR: la superficie deve essere positiva assieme al costo unitario                 
 * AF: piastrella romboidale rappresentata dalla sua superficie e il costo unitario
 *                                                                                  
 */                                                                
public class PRomboidale extends Piastrella {                      
                                                                                        
    private final int superficie;                                                       
                                                                                        
    /**                                                                                 
     * constructor per la classe piastrella romboidale                                   
     *                                                                                  
     * @param dmaggiore diagonale maggiore del rombo                                    
     * @param dminore diagonale minore del rombo                                               
     * @param prezzo prezzo della piastrella                                            
     * @throws IllegalArgumentException se una delle diagonali o il prezzo sono negativi
     *             
     */                                                                                 
    public PRomboidale (final int dmaggiore,final int dminore, final int prezzo) throws IllegalArgumentException {                     
        super(prezzo);                                                                  
                                                                                        
        if(dminore < 1 || dmaggiore < 1) throw new IllegalArgumentException("il lato non puo essere < 0");         
        this.superficie = (dmaggiore * dminore)/2;                                                                                              
    }                                                                                          
                                                                                               
    @Override                                                                                           
    public int superficie() {                                                                           
        return superficie;                                                    
    }                                                      
                                                           
}                                                          
                                                           