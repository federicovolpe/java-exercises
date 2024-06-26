import java.util.ArrayList;
import java.util.Iterator;

public class IntSet{
  int cardinalità = 0;
  static ArrayList<Integer> insieme = new ArrayList<Integer>();
  
  //metodi della classe per inserire e rimuovere certi elementi
  //pre condizioni: il numero inserito deve essere un intero
  //post condizioni: aggiunge all'insieme corrente il numero inserito come input
  //effetti collaterali: la cardinalità viene cambiata e se prima l'insieme risultava ordinato ora può anche non esserlo più
  public void insert(int num  ){
    this.insieme.add(num);
    cardinalità++;
  }
  
  //pre condizioni:
  //post condizioni:
  //effetti collaterali:
  public void remove(int num){
    //ricordarsi di aggiungere una eccezione per quando il numero non risulta presente
    this.insieme.remove(num);
    cardinalità--;
  }

  //pre condizioni:
  //post condizioni: restituisce l'ultimo numero appartenente alla lista
  //effetti collaterali: fa spuntare una eccezione se l'insieme è vuoto
  public int intChoose() throws insiemeVuoto{
    if(this.cardinalità == 0){
      throw new insiemeVuoto();
    }else{
      return insieme.get(insieme.size()-1);
    }
  }

  //restituisce la cardinalità di un insieme
  public int size(){
    return this.cardinalità;
  }

  //metodo che ritorna un iteratore


  public boolean contains(int x){
    //true se l'elemento è nell'insieme
    for(Integer numero : insieme){
      if(numero == x){
        return true;
      }
    }
    return false;
  }

  //restituisce una stringa formata dagli elementi di un insieme
  //tra parentesi graffe e separati da una virgola+
  public String toString(){
    String finale = "{ ";
    for(Integer numero : insieme){
      finale = finale + numero + ", ";
    }  
    finale = finale + "}";
    return finale;
  }
}
