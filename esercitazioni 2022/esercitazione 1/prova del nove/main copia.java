//o obiettivo trovare le combinazioni di quei cazzo di numeri
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("metti il tuo numero:\n");
		//leggo il numero dall'input
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		for(int a = 1; a < numero; a++){
		    for(int b = 1; b < numero; b++){
		        for(int c = 1; c < numero; c++){
		            if(controlloTripletta(a,b,c) == true){
		                System.out.println(a+" "+b+" "+c+"\n");
		            }
		        }
		    }
		}
	}
	
	
	//pre condizioni: i tre numeri sono tutti minori del numero fornito in input
	//post condizioni: restituisce un valore che verifica la consistenza della tripletta data in esame
	public static boolean controlloTripletta(int a, int b, int c){
	    if(a*b != c){
	        if(sommaCifre(sommaCifre(a)*sommaCifre(b)) == sommaCifre(c)){
	            return true;
	        }
	    }
	    return false;
	}
	public static int sommaCifre (int num){
	    //inserire la clausola di continuo finche il numero non divenda ad una cifra
	    int finale = num;
	    while(finale / 10 != 0){
    	    int temp = finale;
    	    int risultato = 0;
    	    while(temp != 0){
    	        risultato += (temp % 10);
    	      //  System.out.println("aggiungo "+ temp % 10 );
    	        temp /= 10;
    	    }
    	    finale = risultato;
    	    //System.out.println("il primo ciclo ha prodotto: "+finale);
	    }
	    return finale;
	}
}