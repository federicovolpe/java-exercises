      
import java.util.Arrays;   
import java.util.List;        
import java.util.Objects;     
import java.util.stream.Collectors;                                                                  
                                                                                           
//IR: il vettore deve avere dimensione > 0 e non puo essere null(garantito dal costruttore)
//AF: vettore denso rappresentato dalla lista dei suoi valori
                              
public class VettoreDenso implements Vettore {
           
    private List<Integer> elems;
           
    /*     
     * constructor method for a VettoreDenso given an array of int
     * @param ns array of integers
     * @throws IllegalArgumentException if ns is null
     *     
     */    
    public VettoreDenso(int[] ns) {
        Objects.requireNonNull(ns);
        if (ns.length < 1) throw new IllegalArgumentException("la creazione di un vettore denso ha bisogno di un array non vuoto");
        elems = Arrays.stream(ns)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
    }

    @Override
    public int dim() {
        return elems.size();
    }                              
                                                    
    @Override                                        
    public int val(int i) {                               
        if (i >= elems.size() || i < 0) throw new IllegalArgumentException("l'indice cercato è al di fuori del range");
        return elems.get(i);                              
    }                                                     
                                                          
    @Override                                             
    public Vettore per(int alpha) {                                                
        VettoreDenso nuovo = new VettoreDenso(elems.stream().mapToInt(Integer::intValue).toArray());                         
        for (int i = 0; i < nuovo.elems.size(); i++) {                                                                       
            nuovo.elems.set(i, elems.get(i) * alpha);                                                                        
        }                                                                                                                    
        return nuovo;                                                                                                        
    }                                                                                                                        
                                                                                                                             
    @Override                                                                                                                
    public Vettore più(Vettore v) {                                                                                          
        if(v.dim() != this.dim()) throw new IllegalArgumentException("per sommare un vettore deve avere la stessa misura");  
        if(v instanceof VettoreNullo){                                                      
            System.out.println("somma per un vettore nullo, ritorno lo stesso");                                                               
            return new VettoreDenso(elems.stream().mapToInt(Integer::intValue).toArray());                                                                                
        }                                                                                   
                                                                                                             
        VettoreDenso nuovo = new VettoreDenso(elems.stream().mapToInt(Integer::intValue).toArray());                         
        for (int i = 0; i < nuovo.elems.size(); i++) {                                                                       
            nuovo.elems.set(i, nuovo.elems.get(i) + elems.get(i));                                                                        
        }                                                                                                                    
        return nuovo;                                                                                                        
    }                                                                                                                        
                                                                                                                             
    @Override                                                                                                                
    public String toString(){                                                                                                
        return elems.toString();                                                                                             
    }                                                                                               
                                                                                     
}                                                                                    
                                                                                     