import java.util.ArrayList;

public class GrigliaAvversario {
    String[][] griglia = new String[10][10];

    //RI: array bidimensionale di dimensioni  10x10 non vuoto composta da caratteri quali {"~","*","#"}
    //AF: la griglia dell'avversario vista dalla prospettiva del giocatore

    /**
     * metodo costruttore per la griglia rappresentante le navi colpite avversarie
     * inizialmente vuoto(composto da "~")
     */
    public GrigliaAvversario(){
        for(int i = 0 ; i < 10; i ++){
            for(int j = 0; j < 10 ; j ++){
                griglia[i][j] = "~";
            }
        }
    }

    /**
     * metodo che aggiorna la mia griglia avversaria dopo che viene fato un tentativo
     *
     * @param c -> coordinata da modificare
     * @param r -> coordinata da modificare
     * @param res -> risultato del tentativo
     */
    public void aggiorna(int c, int r, String res){
        griglia[c][r] = res;
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
