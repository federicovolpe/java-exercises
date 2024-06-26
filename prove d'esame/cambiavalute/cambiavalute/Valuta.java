import java.util.Collections;                                  
import java.util.Map;                                          
import java.util.Objects;                                      
import java.util.HashMap;                                      
                                                               
/**                                                            
 * Enumerazione che rappresenta le valute con relativo nome e simbolo.
 */                                                            
public enum Valuta {                                           
                                                                 
  USD("Dollaro", '$'),                                           
  EUR("Euro", '€'),                                              
  CHF("Franco", '₣'),                                                                        
  TRY("Lira", '₺'),                                                                          
  INR("Rupia", '₹'),                                                                         
  GBP("Sterlina", '£'),                                                                               
  JPY("Yen", '¥');                                                                                    
                                                                                                      
  /* Mappa che consente di rintracciare una valuta dato il suo simbolo. */                            
  static final Map<Character, Valuta> ENUM_MAP;                                                       
                                                                                                      
  static { //inizializza la mappa delle valute controllando che i simboli non siano duplicati                                                                                   
    Map<Character, Valuta> map = new HashMap<>();                                                     
    for (Valuta instance : Valuta.values()) {                                                         
      if (map.containsKey(instance.simbolo)) throw new IllegalArgumentException("Simbolo duplicato.");
      map.put(instance.simbolo, instance);                                                            
    }                                                                                                 
    ENUM_MAP = Collections.unmodifiableMap(map);                                                      
  }                                                                                                                                              
                                                                                                                                                 
  /** Il nome della valuta (non può essere <code>null</code>, o vuoto). */                                                                       
  public final String nome;                                                                                                                      
                                                                                                                                                 
  /** Il simbolo della valuta. */                                                                                                                
  public final char simbolo;                                                                                                                     
                                                                                                                                                 
  private Valuta(String nome, char simbolo) {                                                                                                    
    if (Objects.requireNonNull(nome, "Il nome non può essere null.").isEmpty()) throw new IllegalArgumentException("Il nome non può essere vuoto.");
    this.nome = nome;                                                                                                                            
    this.simbolo = simbolo;                                                                                                                      
  }                                                                                                                                              
                                                                                                                                                 
  /** Consente di ottenere una valuta dato il suo simbolo.                                                                                       
   *                                                                                                                                             
   * @param simbolo il simbolo della valuta da cercare.                                                                                          
   * @return la valuta.                                                                                                                          
   * @throws IllegalArgumentException se il simbolo non corrisponde ad alcuna valuta nota.                                                       
   */                                                                                                                                            
  public static Valuta valueOf(char simbolo) {                                                                                                   
    Valuta valuta = ENUM_MAP.get(simbolo);                                                                  
    if (valuta == null) throw new IllegalArgumentException("Il simbolo non corrisponde ad una valuta nota.");
    return valuta;                                                                                          
  }                                                                                                         
                                                                                                            
  @Override                                                                                                 
  public String toString() {                                                                                
    return "" + simbolo;                                                                                    
  }                                                                                                          
}                                                                                                           