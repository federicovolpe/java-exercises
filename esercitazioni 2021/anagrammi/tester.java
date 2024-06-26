//package esercitazioni2021.anagrammi;
import java.util.ArrayList;
import java.util.Scanner;

public class tester {
    public static void main(String[]args){
        //creo una lista di nomi e la riempio
        parole p = new parole();
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci le parole da trovare");
        String line = null;
        for(int i = 0; i < 15; i++){
            p.add(s.nextLine());
        }
        System.out.println(p.nomi.toString());
        System.out.println(p.anagrammi.toString());
        p.stampaAnagrammi();

    }    
}
