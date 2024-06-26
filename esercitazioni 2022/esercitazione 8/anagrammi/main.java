import java.util.Scanner;
public class main {
    //devo leggere da standard input tante parole
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        insiemeDiParole insieme = new insiemeDiParole();
        while(true){
            String input = sc.nextLine();
            //System.out.println("ho letto "+input);
            if(input.equals("fine")){
                break;
            }
            insieme.inserisci(input);
        }
        System.out.println("sono uscito dal ciclo");
        insieme.anagrammi();
        //
        sc.close();
    }
}
