import java.util.Objects;

/**
 * classe immutabile atta alla rappresentazione di una riga dello scontrino
 * 
 * RI: la riga non può essere null
 *     il prodotto riguardante non può essere null
 *     la quantità del prodotto non può essere <= 0
 * 
 * AF: riga di uno scontrino determinata dal prodotto riguardante e la sua
 */
public class Riga {
   
    /**
     * prodotto reso public poichè immutabile e necessario alla classe degli scontrini
     * in elaborazione per gli storni
     */
    public final Prodotto p;
    //quantità per rapidità reso modificabile dall'esterno per gli storni
    //pericoloso perchè potrebbe compromettere l'IR 
    public int quantità;

    /**
     * metodo costruttore per una riga
     * 
     * @param prodotto prodotto riguardato
     * @param q quantità del prodotto
     * 
     * @throws NullPointerException se il prodotto è null
     * @throws IllegalArgumentException se la quantità del prodotto è <= 0
     * 
     */
    public Riga(final Prodotto prodotto, final int q) throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(prodotto);
        if(q <= 0) throw new IllegalArgumentException("la quantità del prodotto deve essere positiva");

        this.p = prodotto;
        this.quantità = q;
    }
    
    /**
     * metodo per il ricavo del prezzo totale della riga
     * 
     * @return il prezzo della riga
     */
    public int prezzoTotale(){
        return p.prezzo * quantità; 
    }

    @Override
    public String toString(){
        return p.nome +"€"+ p.prezzo +
            "\n    x "+ quantità + "   "+ prezzoTotale();
    }
}
