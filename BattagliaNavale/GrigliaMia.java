import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * classe che rappresenta la griglia mia nello stato attuale
 */
public class GrigliaMia {
    public final String[][] griglia = new String[10][10];

    //RI: array bidimensionale di dimensioni  10x10 non vuoto composta da caratteri quali {"~","*","#","F","S","C","P"}
    //AF: la griglia del giocatore vista dalla prospettiva del giocatore medesimo

    /**
     * metodo costruttore per la griglia di navi amiche
     *
     * @param navi -> lista di navi che devono essere inserite nella griglia
     * @throws NullPointerException -> se la lista di navi è {@code null}
     */
    public GrigliaMia(ArrayList<Nave> navi){
        Objects.requireNonNull(navi);

        Map<String, Integer> tipologie = new HashMap<>();
        tipologie.put("F",7);
        tipologie.put("P",8);
        tipologie.put("C",2);
        tipologie.put("S",5);

        for(int i = 0 ; i < 10; i ++){
            for(int j = 0; j < 10 ; j ++){
                griglia[i][j] = "~";
            }
        }
        //inserisco ogni nave nella griglia
        for(Nave n : navi){
            if(n.orientamento.equals("O")){
                for(int i = 0; i < tipologie.get(n.tipo); i++){
                    griglia[n.posizione[1]][n.posizione[0]+i] = new String(n.tipo);
                }
            }
            if(n.orientamento.equals("V")){
                for(int i = 0; i < tipologie.get(n.tipo); i++){
                    griglia[n.posizione[1]+i][n.posizione[0]] = new String(n.tipo);
                }
            }
        }
    }

    /**
     * metodo che verifica se o meno un colpo avversario è andato a segno o meno
     *
     * @param colonna -> coordinata sulla quale viene effettuato il colpo
     * @param riga -> coordinata sulla quale viene effettuato il colpo
     * @return String -> rappresenta "#" colpito e affondato, "*" colpito, "." non colpito
     * @throws java.lang.IllegalArgumentException se il punto è già stato colpito
     */
    public String tentativo(int colonna, int riga){
        if(this.griglia[colonna][riga].equals("*") || this.griglia[colonna][riga].equals("#")){
            throw new IllegalArgumentException("questo punto è già stato colpito in precendenza");
        }
        if(!(griglia[colonna][riga].equals("~"))){

            return "*";
        }else return ".";
    }

    @Override
    public String toString() {
        String risultato = "";
        for(int i = 0 ; i < 10; i ++){
            for(int j = 0; j < 10 ; j ++){
                risultato = risultato + griglia[i][j] + " " ;
            }
            risultato = risultato +"\n";
        }
        return risultato;
    }
}
