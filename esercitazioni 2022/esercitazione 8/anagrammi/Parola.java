public class Parola {
    private String word = "federico";

    public Parola(String stringa){
        this.word = stringa;
    }

    public String leggi(){
        return this.word;
    }

    public String alfabetizza(){
        char [] lettere = this.word.toCharArray();
        String risultato = "";
        for(int x = 0; x < lettere.length; x++){
            for(int i = 0; i < lettere.length-1; i++){
                if(lettere[i] > lettere[i+1]){
                    char temp = lettere[i];
                    lettere[i] = lettere[i+1];
                    lettere[i+1] = temp; 
                }
            }
        }
        for(int i = 0; i < lettere.length; i++){
            risultato = risultato + lettere[i];
            
        }
        return risultato;
    }
}
