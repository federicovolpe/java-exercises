//package esercitazioni2021.anagrammi;

public class Anagramma{
    String firma = "";
    String originale = "";

    public Anagramma (String s){
        this.originale = s;
        this.firma = fromCharToString(ordinaCaratteri(fromStringToChar(s)));
    }

    /* pre condizioni: l'imput deve essere una stringa composta da soli caratteri utf8
     * post condizioni: il metodo restituisce un array di caratteri contenenti i caratteri della stringa in argomento
     * modifies:------------------------
     */
    private char[] fromStringToChar(String s){
        char[] caratteri = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            caratteri[i] = s.charAt(i);
        }
        return caratteri;
    }

    /* pre condizioni: l'argomento oltre a rispettare il tipo non deve mantenere altri criteri
     * post condizioni: il metodo restituisce lo stesso array di caratteri riordinato
     * modifies: è impossibile, una volta che si è invocati il metodo risalire all'array precedente
     */
    private char[] ordinaCaratteri(char[] caratteri){
        for(int i = 0; i < caratteri.length; i++){
            for(int j = 0; j < caratteri.length-1; j++){
                for(int k = j+1; k < caratteri.length; k++){
                    if(caratteri[k] < caratteri[j]){
                        char tmp = caratteri[k];
                        caratteri[k] = caratteri[j];
                        caratteri[j] = tmp;
                    }
                }
            }
        }
        return caratteri;
    }

    /* pre condizioni: l'array passato come argomento deve essere ordinato se no non si può ricomporre in modo giusto la firma
     * post condizioni: il metodo restituisce una stringa con i caratteri in sequenza ordinata
     * modifies: 
     */
    private String fromCharToString(char[] caratteri){
        String risultato = "";
        for(char c : caratteri){
            risultato += c;
        }
        return risultato;
    }
}