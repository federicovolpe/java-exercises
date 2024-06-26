/**
 * classe concreta mutabile rappresentante uno scontrino in elaborazione perciò modificabile
 * 
 * IR: uno scontrino inElaborazione non può essere null tanto meno le sue righe
 * 
 * AF: scontrino modificabile di acquisti
 *
 */
public class InElaborazione extends Scontrino{

    /**
     * metodo costruttore per uno scontrino in elaborazione
     * inizializza solo la sua lista di righe
     * 
     */
    public InElaborazione(){
        super();
    }
    
    /**
     * metodo per l'aggiunta di un prodotto allo scontrino
     * 
     * aggiunge una nuova riga indipendentemente se il prodotto è già contenuto
     * 
     * @param p prodotto da aggiungere
     * @param quantità quantità di prodotto da aggiungere
     * @throws NullPointerException se il prodotto risulta null
     * 
     */
    public void aggiungi(final Prodotto p, final int quantità)throws NullPointerException{
        righe.add(new Riga(p, quantità));
    }

    /**
     * metodo che consente lo storno di un prodotto
     * la quantità di prodotti stornati è sempre pari a 1 per ogni invocazione del metodo
     * 
     * il metodo per rapidità accede al field quantità della riga, ma si assicura che
     * l'IR non venga a meno garantendo la quantità sempre > 0
     * 
     * @param s nome del prodotto da stornare (se presente)
     * 
     */
    public void storna(final String s){
        //ciclo for senza iteratore per non creare modifiche concorrenti
        for(int i = 0; i < righe.size(); i++){
            if(righe.get(i).p.nome.equals(s)){
                if(righe.get(i).quantità == 1){
                    righe.remove(i);
                }else{
                    righe.get(i).quantità --;
                }
            }
        }
    }

    /**
     * metodo per la chiusura dello scontrino ovvero la mutazione dello scontrino da
     * InElaborazione (mutabile) a Emesso (immutabile)
     * 
     * @return una copia dello scontrino corrente ma in versione Emesso (immutabile)
     * 
     */
    public Emesso chiudi(){
        Emesso finale = new Emesso(this);
        return finale;
    }

    /**
     * metodo che consente di conoscere se lo scontrino è vuoto o ha qualche prodotto
     * 
     * @return true se lo scontrino è vuoto, false altrimenti
     */
    public boolean isEmpty(){
        return righe.size() < 1;
    }
}
