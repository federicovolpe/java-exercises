import java.util.List;                                                   
                                                                         
/**                                                                      
 * classe concreta mutabile atta alla rappresentazione di un filesystem            
 * comprese tutte le sue funzionalita'                                             
 *                                                                                 
 */                                                                                        
public class FileSystem {                                                          
                                                                                   
    private final Directory root = new Directory("root", new String[0]);           
    private Directory current = root;                                                     
                                                                                           
    /**                                                                                    
     * metodo atto al recupero di una directory nel file system                            
     *                                                                                     
     * @param p path della Entry ricercata                                                 
     * @return la entry interessata                                                        
     * @throws IllegalArgumentException se il path non risulta un path valido per una entry
     *                                                                                     
     */                                                                                         
    Entry get(final Path p) throws IllegalArgumentException{
        Entry result = current;                  
        for(String e: p){                                   
            result = ((Directory) result).get(e);                                               
        }                                                        
        return result;                                                                                 
    }                                                                                           
                                                                                                
    /**                                                                                         
     * metodo per la creazione di una directory dato il suo path                                
     *                                                                                          
     * @param p path della directory da creare                                               
     * @throws IllegalargumentException se il path non e' valido per il corrente fileSystem                                                                          
     */                                                                                         
    public void mkdir(final Path p, final String nome) {                                                        
        Directory ultima = (Directory) get(p);
        ultima.add(new File(nome, p));                                                                                        
    }                                                                                                            
                                                                                                                 
    /**                                                                                                          
     * metodo per la creazione di una entry dato il suo path                                                     
     *                                                                                                           
     * @param p path del file da creare                                                      
     * @throws IllegalargumentException se il path non e' valido per il corrente fileSystem                     
     *                                                                                                           
     */                                                                                                          
    public void touch(final Path p, final String filename) throws IllegalArgumentException{            
                                                                                                                 
    }                                                                                                  
                                                                                                       
    /**                                                                                                
     * metodo getter per il contenuto di una directory del filesystem                                  
     *                                                                                                 
     * @param p path della entry interessata                                                                                  
     * @throws IllegalArgumentException se il path non risulta validao per il corrente filesystem     
     *                                                                             
     */                                                                                                
    public void ls(final Path p)throws IllegalArgumentException{                 
        //posizionamento nella directory corrispondente                          
        for(String e : p){                                                       
            if( ! (current.get(e) instanceof File)){                             
                current = (Directory) current.get(e);                                      
            }                                                                    
        }                                                                        
        for(Entry e : current) System.out.println(e);                                                                              
    }                                                                                                  
                                                                                                       
    /**                                                                                                
     * metodo per recuperare la dimensione di una entry nel filesystem                                 
     *                                                                                                 
     * @param p path della entry interessata                                     
     * @return la dimensione della entry                                                          
     * @throws IllegalArgumentException se il path non risulta validao per il corrente filesystem 
     *                                                                                    
     */                                                                                           
    public int dim(final Path p) throws IllegalArgumentException {                                    
           return 0;                                                                                       
    }                                                                                             
                                                                                                  
    /**                                                                                                 
     * metodo per verificare che il path(lista di stringhe) porti effettivamete ad una entry del file system         
     *                                                                                                  
     * @param p path da verificare                                                                          
     * @return boolean per la rappresentazione dell'esito                                                        
     *                                                                                                           
     */                                                                                                          
    private boolean valid(final String[] p){                                                            
                                                                                                         
        Entry check = current;//directory utilizzata per il controllo  
        if(p[1].equals("")) check = root;                                                                                       
                     
        for(int i = 1; i < p.length; i ++){                                                             
            if(p[])                                                                                                
        }                                                                                                    
    }                                                                                                            
                                                                                                                 
}                                                                                                                
                                                                                                                 