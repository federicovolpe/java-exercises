/**                                                                               
 * interfaccia per l'istanziazione di classi che siano pavimentazioni o piastrelle
 * queste devono avere metodi getter per la superficie e il costo
 *  
 */                                                                               
public interface Rivestimento {                                                   
    
    /**                                                                           
     * metodo getter per la superficie della piastrella                           
     *                                                                            
     * @return il costo unitario della piastrella                                 
     *                                                                            
     */                                                                           
    public int superficie();                                                      
                                                                                  
    /**                                                                                     
     * metodo getter per il costo unitario                                                  
     *                                                                                      
     * @return il costo unitario della piastrella                                           
     *                                                                                      
     */              
    public int costo();
                     
}                              
                               