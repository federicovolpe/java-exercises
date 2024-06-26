                                                                             
/**                                                                                
 * interface che serve a rappresentare un compratore che può avere diversi         
 * metodi per la scelta di acquisto di un giocattolo                               
 *                                                                                 
 */                                                                                
public interface Compratore {                                                      
                                                                                                                                                     
    /**                                                                            
     * method for the creation of an Acquisto made by the compratore               
     *                                                                             
     * @param g Giocattolo to buy                                                  
     * @param n number of Giocattolo to buy                                        
     * @return the recipt represented by the Acquisto                              
     *                                                                             
     */                                                                            
    Acquisto compra (Giocattolo g, int quantità);                                                          
}                                                                          