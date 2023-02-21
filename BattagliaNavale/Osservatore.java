import java.util.Objects;

public class Osservatore {
    String[][] g1m;
    String[][] g2m;
    String[][] g1a;
    String[][] g2a;
    String[][][] griglie;
    //RI: 4 array bidimensionali di dimensioni 10x10 non vuoti
    //  due rispettanti la RI di GrigliaMia
    //  altri due rispettanti la RI di GrigliaAvversario
    //AF: rappresentazione del punto di vista di un osservatore esterno alla partita
    //  questo è in grado di osservare entrambi i campi di entrambi i giocatori

    /**
     * metodo costruttore per un osservatore presi due giocatori
     * inizializza le 4 tabelle rendendole uguali alle tabelle dei giocatori
     *
     * @param g1 -> primo giocatore non null
     * @param g2 -> secondo giocatore non null
     * @throws NullPointerException se uno dei giocatori è {@code null}
     */
    public Osservatore(Giocatore g1, Giocatore g2){
        Objects.requireNonNull(g1);
        Objects.requireNonNull(g2);
        
        g1m = g1.c_mio.griglia;
        g2m = g2.c_mio.griglia;
        g1a = g1.c_avversario.griglia;
        g2a = g2.c_avversario.griglia;
        griglie = new String[][][]{g1m, g1a, g2m, g2a};

    }

    @Override
    public String toString() {
        String finale = "";
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 4; k++){
                for(int j = 0; j < 10; j++){
                    finale = finale + griglie[k][i][j]+" ";
                }
                finale = finale + " | ";
            }
            finale = finale +"\n";
        }
        return finale;
    }
}
