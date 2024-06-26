import java.util.ArrayList;

public class insiemeDiParole {
    private ArrayList<Parola> insieme = new ArrayList<Parola>();
    
    public void inserisci (String stringa){
        Parola nuova = new Parola(stringa);
        this.insieme.add(nuova);
    }

    //pre condizioni: l'insieme di parole non deve essere vuoto
    //post condizioni: vengono restituite a terminale le coppie di parole che sono anagrammi
    //effetti collaterali: la funzione assume un andamento imprevedibile quando l'insieme risulta vuoto
    public void anagrammi(){
        ArrayList<Coppia> coppie = new ArrayList<Coppia>();
        for(Parola p1: insieme){
            for(Parola p2: insieme){
                //System.out.println("analizzo se "+p1.alfabetizza()+" è uguale a "+p2.alfabetizza());
                if(p1.alfabetizza().equals(p2.alfabetizza()) && !(cercaCoppia(coppie, p1, p2))){
                   
                    if(p1.leggi().equals(p2.leggi())){
                        //System.out.println("non ammisssibili");
                    }else{
                        //Coppia nuova = new Coppia(p1.leggi(), p2.leggi());
                        //coppie.add(nuova);
                         System.out.println("anagramma: " + p1.leggi() + " e " + p2.leggi());
                        System.out.println("ammissibili ");
                    }
                }
            }
        }
    }

    public boolean cercaCoppia(ArrayList<Coppia> coppie, Parola p1, Parola p2){
        for(Coppia sottoAnalisi: coppie){
            if(sottoAnalisi.parola1 == p1.leggi() && sottoAnalisi.parola2 == p2.leggi()){
                return true;
            }if(sottoAnalisi.parola2 == p1.leggi() && sottoAnalisi.parola1 == p2.leggi()){
                return true;
            }
        }
        return false;
    }
}