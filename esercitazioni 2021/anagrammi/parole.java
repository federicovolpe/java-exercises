
//package esercitazioni2021.anagrammi;

import java.util.ArrayList;

public class parole {
    ArrayList<String> nomi = new ArrayList<String>();
    ArrayList<Anagramma> anagrammi = new ArrayList<Anagramma>();
    
    public void add(String nome){
        nomi.add(nome);
        System.out.println("fino a qua ci sono arrivato");
        Anagramma a = new Anagramma(nome);
        anagrammi.add(a);
    }

    public void stampaAnagrammi(){
        for(int i = 0; i < anagrammi.size(); i++){
            System.out.print(anagrammi.get(i).originale);
            for(int j = i+1; j < anagrammi.size(); j++){  
                if(anagrammi.get(j).firma == anagrammi.get(i).firma){  
                    System.out.print(" "+anagrammi.get(j).originale);
                    anagrammi.remove(j);
                }
            }
            System.out.print("\n");
            anagrammi.remove(i);
        }
    }
}
