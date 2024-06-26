package intQueue;
import java.util.ArrayList;

public class IntQueue{
  //costruttore con parametro n che segna il numero
  //massimo di elementi che ci possono stare allinterno dell'array
  int lunghezza;
  int occupati;
  ArrayList<Integer> lista = new ArrayList<Integer>();
  public IntQueue(int x){
    lunghezza = x;
    occupati = 0;
  }

  public void enqueue(int x) throws nonCeSpazio{
    //se è finito lo spazio da occupare allora lancio una eccezione creada ad hoc
    if (occupati >= lunghezza){
      throw new nonCeSpazio();
    }else{
      lista.add (x);
      occupati++;
    }
  }

  public void display(){
    for(int i = 0; i < this.lista.size(); i++){
      System.out.println(" "+ lista.get(i));
    }
    System.out.println("finito");
  }
  //rimuovere elementi dequeue
  public void dequeue()throws nonCePiuNiente{
    System.out.println("posti occupati:" + occupati);
    if(occupati == 0){
      throw new nonCePiuNiente();
    }else{ 
      lista.remove(0);
      occupati--;
      System.out.println("posti occupati sono diventati:" + occupati);
    }
  } 
}

