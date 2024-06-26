import java.util.Objects;

/**
 * classe concreta e immutabile per un oggetto di tipo prodotto
 * potrebbe alternativamente essere implmentata come un record ma la macchina non lo supporta
 * 
 * RI: il nome deve avere un range da 1 a 10 caratteri
 *      il prezzo può variare da 1 a 999
 * AF: un prodotto del listino caratterizzato dal suo prezzo e il suo nome
 * 
 */
public class Prodotto {

    /*variabili non private per garantire un facile accesso garantendo
     * l'immutabilità con final
    */
    public final String nome;
    public final int prezzo;

    /**
     * metodo costruttore per un prodotto dato il suo nome e il prezzo
     * 
     * @param nome nome del prodotto
     * @param prezzo prezzo del prodotto
     * @throws NullPointerException se il nome è null
     * @throws IllegalArgumentException se il prezzo del prodotto o il nome sono al di fori del range
     * 
     */
    public Prodotto(final String nome, final int prezzo)throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(nome);
        if(nome.length() < 1 || nome.length() > 10) 
            throw new IllegalArgumentException("il nome deve variare fra 1 e 10 caratteri");
        if(prezzo > 999 || prezzo < 1) 
            throw new IllegalArgumentException("il prezzo deve variare fra 1 e 999");
        this.nome = nome;
        this.prezzo = prezzo;
    }

}
