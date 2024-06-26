import java.util.Objects;                                                                   
                                                                                            
public abstract class Playable {                                   
                                                                                            
    private final String titolo;                                                                            
    private final int durata;                                                               
                                                                                            
    /**                                                                                     
     * metodo costruttore per un oggetto di tipo playable dato il suo titolo e la sua durata                                                                          
     *                                                                                                           
     * @param titolo titolo del Playable                                                                            
     * @param durata durata in secondi e che sia > 0                                                   
     * @throws NullPointerException se il titolo risulta null                                                    
     * @throws IllegalArgumentException se la durata  e' < 0 o il titolo e' vuoto
     *                                                                                     
     */                                                                                                          
    public Playable (final String titolo, final String durata)throws NullPointerException, IllegalArgumentException{    
        Objects.requireNonNull(titolo);                                                                          
        if(titolo.length() == 0) throw new IllegalArgumentException("il titolo del brano non puo' essere vuoto");
        if(durataSecondi(durata) <= 0) throw new IllegalArgumentException("la durata del brando deve essere positiva");          
                                                                                                                    
        this.titolo = titolo;                                                                                     
        this.durata = durataSecondi(durata);                                                                                                                                                 
    }                                                                                      
                                                                                            
    /**                                                                                     
     * metodo per la sottrazione delle durate fra due oggetti di tipo playable              
     *                                                                                      
     * @param p playable da cui sottrarre la durata                                                                
     * @return il rislultato della sottrazione fra le durate                          
     * @throws NullPointerException se p e' null                                
     * @throws ArithmeticException se il risultato della sottrazione e' negativo
     *                                                                       
     */                                                                         
    int sottrai (Playable p)throws NullPointerException, ArithmeticException{
        Objects.requireNonNull(p);                                                                                
        if(durata() - p.durata() < 0) throw new ArithmeticException("il risultato della sottrazione e' negativo");
                                                                                
        return durata() - p.durata();                      
    }                                                      
                                                           
    /**                                                                      
     * metodo per la somma delle durate di due oggetti di tipo playable      
     *                                                                       
     * @param p oggetto da cui sommare la durata                                                        
     * @return il risultato della somma delle durate                         
     * @throws NullPointerException se p e' null                             
     *                                                                       
     */                                                                      
    int somma (Playable p)throws NullPointerException{
        Objects.requireNonNull(p);   
        return durata() + p.durata();
    }
    
    /**                                                                               
     * metodo prevalentemente utilizzato per i costruttori che consente la conversione
     * da stringa a integer della durata da HH : MM : SS a secondi           
     *                                                                       
     * la durata deve essere necessariamente espressa nel formato sovrastante
     *                                                                   
     * @param durata durata del playable                                 
     * @return la durata in secondi                                      
     *                                                                             
     */                                                                            
    public static int durataSecondi(final String durata){                    
        String[] componenti = durata.split(":");                         
        int res = 0;                                                     
        for(int i = componenti.length -1; i > 0; i++){                   
            res += Integer.parseInt(componenti[i]) * Math.pow(60, componenti.length -1 -i);                                  
        }                                          
        return res;                                                          
    }                                    
                                         
    /**                                                                               
     * metodo per la conversione della durata nel formato HH : MM : SS                
     *                                                                                
     * @return durata del playable nel formato HH : MM : SS                           
     *                                                                                
     */                                                                               
    String durataToString (){    
        String s = "";    
        int d = durata;   
        while(d > 0){     
            s = d % 60 + s;
            d = d / 60;   
        }                 
        return s;                  
    }                            
                                 
    /**                                            
     * metodo getter per la durata                                           
     *                                                                       
     * @return un integer rappresentante la durata                           
     *                                                                       
     */                                                                      
    int durata(){                                                            
        return this.durata;                                                  
    }                                                                        
                                                                             
    /**                                                                      
     * metodo getter per il titolo del playable                              
     *                                                                       
     * @return la stringa rappresentante il titolo                           
     *                                                                       
     */                                                                      
    String titolo(){                                                         
        return this.titolo;                                                  
    }                                                                        
                                                                             
}                                                                            
                                                                             