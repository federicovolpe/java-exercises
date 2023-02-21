import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nave {
    public final String tipo;
    public final String orientamento;
    public final int[] posizione;

    //RI: tipo not null e compreso fra {"F","P","S","C"}
    //      orientamento not null e compreso fra{"V","O"}
    //      posizione array di lunghezza 2, entrambe le cifre non devono essere > 9 o < 0
    //AF: rappresentazione di una nave nel campo di battaglia amico determinata da tipo orientamento e posizione

    /**
     * costruttore per una nave dato i suoi tre parametri
     *
     * @param t -> tipo di nave può essere F,P,S,C
     * @param o -> orientamento della nave V oppure O
     * @param p -> prima coordinata della nave
     * @throws IllegalArgumentException se il tipo di nave non è fra i 4 descritti
     *  opure se l'orientamento è diverso dai due tipi prescritti
     *  oppure se la coordinata della nave la posiziona fuori dalla mappa
     */
    public Nave (String t, int[] p, String o){
        Map<String, Integer> tipologie = new HashMap<>();
        tipologie.put("F",7);
        tipologie.put("P",8);
        tipologie.put("C",2);
        tipologie.put("S",5);

        if(!(tipologie.containsKey(t))){
            throw new IllegalArgumentException("la tipologia della nave inserita non è corretta");
        }
        if(!(o.equals("O")||o.equals("V"))){
            throw new IllegalArgumentException("l'orientamento della nave è incorretto");
        }
        if(p[0] > 10 || p[0] < 0 || p[1] > 10 || p[1] < 0 ){
            throw new IllegalArgumentException("le coordinate della nace non sono ammissibili"+p[0]+", "+p[1]);
        }
        if(o.equals("O")&& (p[0] + tipologie.get(t)) > 10 || o.equals("V")&& (p[1] + tipologie.get(t)) > 10){
            throw new IllegalArgumentException("la posizione della nave è inammissibile poichè esce dal campo");
        }

        this.orientamento = o;
        this.tipo = t;
        this.posizione = p;
    }
}
