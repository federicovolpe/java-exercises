package intQueue;
import java.util.Scanner;

public class runner{
  public static void main(String []args){
    int input;
    int lunghezza;//lunghezza della coda da istanziare
    Scanner sc = new Scanner(System.in);
    // devo leggere quanti input vuole inserire l'operatore
    System.out.println("inserisci la lunghezza della coda");
    lunghezza = sc.nextInt();
    
    IntQueue ciccio = new IntQueue(lunghezza);

    while (true){
      //leggo la sequenza di valori che devono essere inseriti nell'arraylist
      input = sc.nextInt();
      if(input == +1){
        try{
          ciccio.enqueue(input);
        }catch(nonCeSpazio e){
          System.out.println("non c'è più spazio bro");
          break;
        }
      }else if(input == -1){
        System.out.println("faccio la dequeue");
        try{
          ciccio.dequeue();
        }catch (nonCePiuNiente e){
          System.out.println("non c'è più niente da togliere bro");
          break;
        }
      }
      else if(input == 0){
        ciccio.display();
      }
    }
  }
}

    /*while(testo != ""){
      System.out.println("che operazione vuoi fare?");
      testo = sc.nextLine();
      System.out.println("stringa ricevuta ="+testo+"---");
      //if(testo == "dequeue"){
        System.out.println("tolgo dalla coda");
        input = sc.nextInt();
        ciccio.dequeue();
      //}else if(testo == "enqueue"){
        System.out.println("accodo");
        input = sc.nextInt();
        ciccio.enqueue(input);
      //}else if(testo == "display"){
        ciccio.display();
      //}*/
  
//}
