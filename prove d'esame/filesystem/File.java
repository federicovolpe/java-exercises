/**                                                                
 * classe concreta per la costruzione di file sottoinsieme di entry
 * alla fine della prova di esame la classe e' immutabile                                                          
 *                                                                                                                 
 */                                                                                                                
public class File extends Entry {                                                                                  
                                                                                                                   
    private final int dimensione;                                                                                  
                                                                                                                   
    public File(final String nome, final Path path, final int dimensione){                                                          
        super(nome, path);                                                                                               
        if(dimensione < 0 ) throw new IllegalArgumentException("la dimensione del file non puo' essere negativa");
                                                                                                                   
        this.dimensione = dimensione;                                                                              
    }                                                         
                                                              
    @Override                                                 
    int dimensione(){                                  
        return dimensione;                             
    }                                                  
                                                                                                                   
}                                                                                                                  
                                                                                                                   