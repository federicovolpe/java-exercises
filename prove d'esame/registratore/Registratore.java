import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * classe concreta e mutabile per un registratore di cassa 
 *                                                   
 * RI: il listino del registratore non può essere null
 *      nessun prodotto del listino deve essere null 
 *                                                   
 * AF: registratore di cassa con un listino          
 *      un solo scontrino in fase di elaborazione    
 *      un registro degli scontrini emessi           
 *                                                   
 */                                                  
public class Registratore implements Iterable<Emesso>{
                                                     
    private final Listino listino;                   
    private InElaborazione current;                  
    private final List<Emesso> registro = new ArrayList<>();
                                                     
                                                     
    /**                                              
     * metodo costruttore per un Registratore        
     *                                               
     * @param listino listino di prodotti noti al registratore
     * @throws NullPointerException se il listino è null
     * 
     */
    public Registratore(final Listino listino) throws NullPointerException{
        Objects.requireNonNull(listino);

        this.listino = listino;
    }

    /**
     * metodo per l'aggiunta di un prodotto dato il suo nome e quantità allo scontrino corrente
     * il prodotto viene ricercato nel listino del registratore quindi deve essere contenuto
     * 
     * il prodotto viene aggiunto con successo solo se la quantità è > 0
     * 
     * @param s stringa rappresentante il nome del prodotto da aggiungere
     * @param quantità numero di prodotti da aggiungere
     * 
     */
    public void aggiungi(final String s, final int quantità){
        if(quantità > 0){
            Prodotto p = listino.getProduct(s);
            if(p != null) current.aggiungi(p, quantità);
        }
    }

    public void rimuovi(final String s){
        current.storna(s);
    }

    /**
     * metodo che consente di emettere lo scontrino corrente e registrarlo nella lista degli scontrini
     * 
     * modifica lo sontrino correntemente in elaborazione sostituendone uno vuoto
     * aggunge lo scontrino corrente nel registro degli scontrini
     * 
     * @return lo scontrino di tipo Emesso corrente
     * 
     */
    public Emesso emetti(){
        InElaborazione ret = current;
        current = new InElaborazione();//reimpostazione dello Scontrino corrente con uno vuoto

        registro.add(ret.chiudi());
        return ret.chiudi();
    }

    @Override
    /**
     * iteratore sul registro degli scontrini
     * consentito solo se lo scontrino attualmente in elaborazione è vuoto
     */
    public Iterator<Emesso> iterator(){
        if(current.isEmpty()) { 
            System.out.println("uno scontrino non vuoto è in stato di modifica, non è possibile ottenere il registro");
            return null;
        }
        return Collections.unmodifiableList(registro).iterator();
    }
}
