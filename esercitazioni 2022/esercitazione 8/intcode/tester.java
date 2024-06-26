import java.util.ArrayList;

public class tester{
    public static void main(String [] args){
        int[] comandi = convertiStringa(args[0]);
        boolean uscita = false;
        for(int contatore = 0; contatore < comandi.length; contatore++){
            switch(comandi[contatore]){
                case 1:
                    //Somma i primi due argomenti e memorizza il risultato nella cella di memoria indicata dal terzo argometo.
                    comandi[comandi[contatore+3]] = comandi[comandi[contatore+1]] + comandi[comandi[contatore+2]];
                    contatore += 3;
                    break;
                case 2:
                    //Moltiplica i primi due argomenti e memorizza il risultato nella cella di memoria indicata dal terzo argometo.
                case 3:
                    //Legge in input (da standard input) un numero intero e lo memorizza nella cella di memoria indicata dall'argometo.
                case 4:
                    //Emette in output (su standard output) il primo argomento.
                case 5:
                    //Se il primo argomento è diverso da zero, imposta il valore dell'instruction pointer affinché sia uguale al secondo argomento.
                case 6:
                    //Se il primo argomento è uguale a zero, imposta il valore dell'instruction pointer affinché sia uguale al secondo argomento.
                case 7:
                    //Se il primo argomento è minore del secondo, scrive 1 nella cella di memoria indicata dal terzo argomento. Altrimenti scrive 0.
                case 8:
                    //Se i primi due argomenti sono uguali, scrive 1 nella cella di memoria indicata dal terzo argomento. Altrimenti scrive 0.
                case 9:
                    //Aggiunge il valore indicato dal primo argomento al relative base pointer.
                case 99:
                    //	Arresta l'esecuzione.
                    uscita = true;
                    break;
            }
            if (uscita == true){
                break;
            }
        }
        stampaArray(comandi);
    }

    public static void stampaArray(int [] array){
        System.out.print("Array: {");
        for(int numero : array){
            System.out.print(numero + ", ");
        }
        System.out.print("}");
    }
    private static int[] convertiStringa(String stringa){ 
        String[] stringhe = stringa.split(",");
        stringhe = stringa.split(",");
        int[] numeri = new int[stringhe.length];
        //System.out.print("ho generato l'array: ");
        for(int i = 0; i < stringhe.length; i++){
            numeri[i] = Integer.parseInt(stringhe[i]);
            //System.out.print(numeri[i]);
        }
        //System.out.print("\n ");*/
        return numeri;
    }
}