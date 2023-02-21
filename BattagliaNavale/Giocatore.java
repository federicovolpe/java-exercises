import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

/**
 * classe giocatore che rappresenta lo stato corrente di un giocatore con i propri campi di battaglia
 */
public class Giocatore {
    public final GrigliaMia c_mio ;
    public final GrigliaAvversario c_avversario ;

    //RI: due array bidimensionali uno istanza di GrigliaMia l'altro istanza di GrigliaAvversario entrambi not null
    //AF: situazione attuale del giocatore descritto tramite la sua griglia di posizionamento delle navi
        // e la griglia rappresentante la situazione sul campo avversario

    /**
     * costruttore per la classe giocatore, inizializza i due campi c_mio tramite la lista di navi fornita
     * e c_avversario inizializzato vuoto
     *
     * @param navi -> lista di navi rappresentati da una stringa
     * @throws NullPointerException se la stringa passata in input è {@code null}
     * @throws IllegalArgumentException se la stringa non è nel formato giusto
     */
    public Giocatore(String navi){
        Objects.requireNonNull(navi);
        String[] singole = navi.split(",");
        ArrayList<Nave> navi_analizzate = new ArrayList<>();
        try {
            for (String n : singole) {
                String[] data = n.split(":");
                int[] coordinate = {data[1].charAt(0) - 65, data[1].charAt(1) - 48};
                navi_analizzate.add(new Nave(data[0], coordinate, data[2]));
            }
        }catch(RuntimeException e){
            System.out.println("l'input non è formattato nella maniera corretta");
        }
        c_mio = new GrigliaMia(navi_analizzate);
        c_avversario = new GrigliaAvversario();
    }

    /**
     * metodo che aggiorna la mappa riguardante l'avversario con il risultato di un tentativo
     *
     * @param colonna -> coordinata sulla quale viene effettuato il colpo
     * @param riga -> coordinata sulla quale viene effettuato il colpo
     *
     * @return String -> rappresenta "#" colpito e affondato, "*" colpito, "." non colpito
     */
    public void prova(int colonna, int riga, GrigliaMia griglia_avversario){
        this.c_avversario.aggiorna(colonna, riga, griglia_avversario.tentativo(colonna, riga));
    }

    @Override
    public String toString() {
        return c_mio.toString()+"\n"+c_avversario.toString();
    }
}
