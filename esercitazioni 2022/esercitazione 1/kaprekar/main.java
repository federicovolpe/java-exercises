/******************************************************************************

CAZZO DI CAPRA
*******************************************************************************/

import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		System.out.println("INSERISCI IL NUMERO DI PARTENZA");
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    System.out.println("il risultato "+ riordina(input));
	    while(e8capra(input) == false){
	        System.out.println(input);
	        input = prossimaCapra(input);
	    }
	    
	}
	//precondizioni: il numero inserito "e8 un numero di 4 cifre
	//postcondizioni: viene controllato se il numero "e8 effettivamente la costante di capra
	public static boolean e8capra(int input){
	    final int capra = 6174;
	    if(input == capra ){
	        return true;
	    }
	    return false;
	}
	
	//precondizioni: la funzione ottiene un numero di 4 cifre
	//postcondizioni: la funzione ritorna il prossimo numero di capra calcolandolo mediante le altre funzioni
	public static int prossimaCapra(int prec){
	    return (prec - riordina(prec));
	}
	
	//precondizioni: la funzione ottiene in input un numero che non pu"f2 superare le 4 cifre
	//postcondizioni: funzione che ricompone il numero al contrario
	public static int riordina(int numero){
	    int [] array = new int[4];
	    int temp = numero;
	    int moltiplicatore = 1000;
	    int risultato = 0;
	    for(int i = 0; i < 4; i++){
	        array[i] = temp % 10;
	        temp /= 10;
	    }
	    //riordino l"array dal piu alto al piu basso
	    for(int i = 0; i < 3; i++){
	        for(int j = i+1; j < 4; j++){
	            if(array[i] < array[j]){
	                int tmp = i ;
	                array[i] = array[j];
	                array[j] = tmp;
	            }
	        }
	    }
	    System.out.println(array[0]+array[1]+array[2]+array[3]);
	    for(int i = 0; i < 4 ; i++){
	        risultato += array[i]* moltiplicatore;
	        moltiplicatore /= 10;
	    }
	    return risultato;
	}
}