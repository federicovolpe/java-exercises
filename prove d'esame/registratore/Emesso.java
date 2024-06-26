import java.util.Collections;
import java.util.Objects;

/**
 * gli scontrini emessi possono essere costruiti solo a partire da scontrini in elaborazione
 * 
 * AF: classe rappresentante uno scontriono immodificabile poichè emesso
 *      rappresentato dalla lista delle righe di acquisto
 * 
 * RI: uno scontrino emesso deve avere almeno una riga
 *      uno scontrino emesso non può essere null
 * 
 */
public class Emesso extends Scontrino {
    
    /**
     * metodo costruttore per uno scontrino emesso note le righe dello scontrino
     * 
     * @param s scontrino in elaborazione da trasformare
     * @throws NullPointerException se lo scontrino in ingresso è null
     * @throws IllegalArgumentException se lo scontrino passato non contiene alcuna riga
     * 
     */
    public Emesso(final InElaborazione s)throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(s);
        if(s.righe.size() < 1) throw new IllegalArgumentException("lo scontrino da emettere non contiene alcuna riga");

        this.righe = Collections.unmodifiableList(s.righe);
    }
}
