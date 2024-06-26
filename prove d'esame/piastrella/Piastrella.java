/**                                                                                         
 * classe astratta per qualsiasi tipo di piastrella                                         
 */                                                                                         
public abstract class Piastrella implements Rivestimento {                                  
                                                                                            
    private final int costoUnitario;                                                        
                                                                                         
    /**                                                                                  
     * metodo per l'instanziazione di una piastrella qualsiasi dato il suo prezzo        
     *                                                                                   
     * @param costo costo unitario della piastrella                                      
     * @throws IllegalArgumentException se il costo e' negativo                          
     *                                                                                   
     */                                                                                  
    public Piastrella(final int costo) throws IllegalArgumentException {                                                     
        if(costo < 0)throw new IllegalArgumentException("il costo non puo essere negativo");
        this.costoUnitario = costo;                                                      
    }                                                                                    
                                                                                         
    @Override                                                                            
    public int costo() {                                                                 
        return costoUnitario;                                                            
    }                                                                                    
                                                                                         
}                                                                                        
                                                                                         