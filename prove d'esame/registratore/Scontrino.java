import java.util.ArrayList; 
import java.util.Iterator;  
import java.util.List;      
import java.util.NoSuchElementException;
                            
/**                         
 * classe astratta per scontrini che potranno essere Emessi o InElaborazione
 *                          
 */                         
public abstract class Scontrino implements Iterable<Riga> {
                            
    //unica lista per ogni scontrino a cui aggiungere o togliere prodotti( o Righe)
    public List<Riga> righe;
                            
    /**                     
     * metodo costruttore per uno scontrino vuoto semplice
     */                     
    public Scontrino (){
        this.righe = new ArrayList<>(null);
    }

    /**
     * metodo per l'elaborazione del totale dello scontrino
     * 
     * @return il totale del prezzo di tutti i prodotti dello scontrino
     * 
     */
    public int totale(){
        int tot = 0;
        for(Riga r : this){
            tot += r.prezzoTotale();
        }
        return tot;
    }

    @Override
    //ritorna un iteratore che itera sulle righe dello scontrino ma in modo tale da 
    //non ripetere un prodotto due volte vicino
    public Iterator<Riga> iterator(){
        return new Iterator<Riga>() {

            private final Iterator<Riga> it = righe.iterator();
            private Riga next = null;
            private Riga prec = null;

            @Override
            public boolean hasNext() {
                if (next != null) return true;
                
                final Iterator<Riga> anotherOne = it;//iteratore per il controllo di un elemento diverso dal precedente
                while (anotherOne.hasNext()) {
                    final Riga candidate = anotherOne.next();
                    if (! candidate.p.nome.equals(prec.p.nome)) {
                        next = candidate;
                        return true;
                    }
                }
                
                if(it.hasNext()){//se non è stato trovato un prossimo elemento diverso cerco il prossimo elemento
                    next = it.next();
                    return true;
                }
                return false;
            }

            @Override
            public Riga next() {
                if (!hasNext()) throw new NoSuchElementException();
                final Riga result = next;
                prec = next;
                next = null;
                return result;
            }
        };
    }

    @Override
    public String toString(){
        String s = "";
        for(Riga r : this){
            s += r.toString() + "\n";
        }
        return s + "\n----------------\ntotale:  "+ totale();
    }
    
}
