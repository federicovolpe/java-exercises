import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * classe concreta mutabile per un oggetto di tipo listino con lo scopo di contenere una serie di prodotti
 * 
 * RI: i prodotti nel listino non possono essere null
 * 
 * AF: listino del registratore che contiene tuttti i prodotti disponibili
 * 
 */
public class Listino implements Iterable<Prodotto>{
    
    private final List<Prodotto> prodotti = new ArrayList<>();

    /**
     * metodo per l'aggiunta di un nuovo prodotto nel listino
     *  
     * @param p prodotto da aggiungere nel listino
     * @throws NullPointerException se p è null
     *       
     */
    public void aggiungi(Prodotto p) throws NullPointerException{
        Objects.requireNonNull(p);

        prodotti.add(p);
    }
    
    /**
     * metodo per il recupero di un prodotto presente nel listino dato il suo nome
     * 
     * @param s stringa rappresentante il nome del prodotto
     * @return il prodotto ricercato
     * 
     */
    public Prodotto getProduct(final String s){
        Objects.requireNonNull(s);
        for(Prodotto p : prodotti){
            if(p.nome.equals(s)) return p;
        }
        return null;
    }

    @Override
    public Iterator<Prodotto> iterator() {
        return Collections.unmodifiableList(prodotti).iterator();
    }

}