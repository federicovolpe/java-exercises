import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws FileNotFoundException {
            File file = new File("/Users/luigivolpe/Desktop/Federico Volpe/linguaggi di programmazione/JAVA/prova/BattagliaNavale/inputs.txt");
            Scanner sc = new Scanner(file);

            //leggo le navi del primo giocatore
            Giocatore giocatore1 = new Giocatore(sc.nextLine());
            ArrayList<Integer[]> tentativi1 = scomponi_tentativi(sc.nextLine());
            //leggo le navi del secondo giocatore
            Giocatore giocatore2 = new Giocatore(sc.nextLine());
            ArrayList<Integer[]> tentativi2 = scomponi_tentativi(sc.nextLine());

            for(Integer[] tentativo: tentativi1){
                giocatore1.prova(tentativo[0], tentativo[1],giocatore2.c_mio);
            }
            for(Integer[] tentativo: tentativi2){
                giocatore2.prova(tentativo[0], tentativo[1],giocatore1.c_mio);
            }

            Osservatore o = new Osservatore(giocatore1, giocatore2);
            System.out.println("situa:\n"+ o.toString());
    }

    /**
     * metodo che scompone la stringa rappresentante i tentativi il un array di array di integer
     * rappresentanti ciascuno un singolo tentativo
     *
     * @param s -> stringa letta come input
     * @return un ArrayList di Integer[] costituente la lista dei tentativi
     * @throws NullPointerException se la stringa input è vuota
     * @throws IllegalArgumentException se la stringa non è del formato corretto "col,riga,"
     *          oppure se le coordinate sono al di fuori del campo di battaglia
     */
    public static ArrayList<Integer[]> scomponi_tentativi(String s){
        Objects.requireNonNull(s);
        ArrayList<Integer[]> tentativi = new ArrayList<>();
        try {
            String[] singoli = s.split(",");
            for (String singolo : singoli) {
                if (singolo.charAt(0) - 65 > 9 || singolo.charAt(0) - 65 < 0 || singolo.charAt(1) - 48 > 9 || singolo.charAt(1) - 48 < 0)
                    throw new IllegalArgumentException("le coordinate risultano al di fuori del campo di battaglia: " + singolo);
                Integer[] tentativo = {singolo.charAt(0) - 65, singolo.charAt(1) - 48};
                tentativi.add(tentativo);
            }
        }catch(RuntimeException e){
            System.out.println("qualcosa nell'input è andato storto");
        }
        return tentativi;
    }
}