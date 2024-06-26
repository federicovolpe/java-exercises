import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Registratore r;
        Listino l = new Listino();

        String next;
        while((next = sc.nextLine()) != ""){//lettura di un prodotto
            String[] p = next.split("|");
            Prodotto nuovProdotto = new Prodotto(p[0], Integer.parseInt(p[1]));
            l.aggiungi(nuovProdotto);
        }
        r = new Registratore(l);
        System.out.println("registrazione dei prodotti avvenuta");

        while(sc.hasNextLine()){
            String linea = sc.nextLine();
            String[] parti = linea.split(" ");
            switch(parti[0]){
                case "A":
                    Scanner it = sc;
                    int counter = 1; //conta di quante righe di aggiunta uguali ci sono
                    while(it.nextLine().equals(linea)) counter++;
                         
                    r.aggiungi(parti[1], counter);
                    break;
                         
                case "S":
                    r.rimuovi(parti[1]);
                    break;
                         
                case "E":
                    r.emetti();
                    break;
                         
                case "R":
                    for(Emesso e : r){
                        System.out.println(e);
                    }    
                    break;
                         
                default: 
                    System.out.println("comando non riconosciuto: \"" + linea + "\" ");
            }
        }
        sc.close();
    }
}
