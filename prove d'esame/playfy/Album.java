import java.util.List;                 
import java.util.Objects;              
                                       
/**                                                                                  
 * classe immutabile atta a rappresentare ;                                                                                                              
 * un elenco (ordinato, non vuoto e senza ripetizioni) di brani con un titolo (non vuoto) e una durata complessiva.
 */                                                                                                                
public class Album extends Playable{                                                                  
                                                              
    private final List<Brano> brani;                 
                                                     
    /**                                                                              
     * inner class immutabile che rappresenta un brano musicale dello specifico album                           
     *                                                                                                          
     * RI: caratterizzato da un titolo (non vuoto) e da una durata (positiva)                                   
     * AF:                                                                                                      
     */                                                                                                         
    public class Brano extends Playable{                                                                                                
                                                                                       
        /**                                                                                     
         * metodo costruttore per un oggetto di tipo Brano dato il suo titolo e la sua durata                                                                          
         *                                                                                                           
         * @param titolo titolo del Brano                                                                            
         * @param durata durata in secondi e che sia > 0                                                              
         * @throws NullPointerException se il titolo risulta null                                                     
         * @throws IllegalArgumentException se la durata  e' < 0 o il titolo e' vuoto                                 
         *                                                                                                            
         */                                                                                                           
        public Brano (final String titolo, final String durata)throws NullPointerException, IllegalArgumentException{    
            super(titolo, durata);                                                                                                                                                 
        }                                                                                                                     
                                                                                                                      
    }                                                                                                                 
                                                                                                                      
    /**                                                                                                               
     * metodo costruttore per un album data la lista dei suoi brani e delle loro durate                               
     *                                                                                                                
     * @param titolo titolo dell'album                                                                                                                                        
     * @param listaBrani lista dei brani                                                                                                                     
     * @param listaDurate lista delle durate dei brani                                                                                                       
     * @throws IllegalArgumentException se le due liste hanno diverse dimensioni                                                                             
     *                                  se un brano e' sena nome                                                                                             
     *                                  se un brano ha una durata <= 0                                                     
     * @throws NullPointerException se una stringa dei brani e' null                                                                                      
     *                                                                                                                                                       
     */                                                                                                                                                      
    public Album(final String titolo, final String[] listaBrani, final String[] listaDurate) throws IllegalArgumentException{ 
        String d = calcolaDurata(listaDurate);  
        super(titolo, d);                                                                                             
        if(listaBrani.length != listaDurate.length) throw new IllegalArgumentException("le due liste della costruzione album non hanno la stessa lunghezza");
                                                
                                                                           
                                                                                                                                                             
    }                                           
    private String calcolaDurata(final String[] listaDurate){
        int d = 0;                              
        for(int i = 0; i < listaDurate.length; i ++){        
            d += durataSecondi(listaDurate[i]);                                            
        }                                       
        String s = "";                        
        while(d > 0){                         
            s = d % 60 + s;                   
            d = d / 60;                       
        }                           
        return s;                   
    }                                                                                                                                                       
                                                                                                                           
    /**                                                                                                                    
     * metodo parziale per il recupero di un brano dato il suo titolo                                                      
     *                                                                                                                     
     * @param b brano da ricercare nell'album                                                                              
     * @return il brano corrispondente a quel titolo                                                                                                         
     * @throws NullPointerException se il brano non risulta presente nell'album                                                                              
     *                                                                                                                                                       
     */                                                                                                                                                      
    public Brano getBrano(Brano b)throws NullPointerException{                                                                                               
                                                                                                                                                             
    }                                                                                                                                                        
                                                                                       
    /**                                                                                
     * metodo parziale per il recupero di n brano dato il suo titolo                   
     *                                                                                 
     * @param b titolo del brano da ricercare                                          
     * @return il brano cercato se presente nell'album                                 
     * @throws NullPointerException se il brano cercato non risulta presente nell'album
     *                                                                              
     */                                                                                
    public Brano getBrano(String b)throws NullPointerException{                        
                                                                                       
    }                                                                               
                                                                                    
    /**                                                                             
     * metodo totale per il recupero dell'indice di un brano all'ionterno dell'album
     *                                                                           
     * @param b brano ricercato                                                                     
     * @return l'indice del brano all'interno di quest'album o -1 se non presente
     *                                                      
     */                                                                             
    public int getIndexOf(Brano b){                                                 
                                                                                    
    }                         
                              
    @Override                 
    public int sottrai(Playable p) throws NullPointerException, ArithmeticException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sottrai'");
    }                         
                              
    @Override                 
    public int somma(Playable p) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'somma'");
    }

    @Override
    public String durataToString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'durataToString'");
    }                                                                               
}                                                                                                                                                            