public class IntSet{
  public static void main(String [] args){
    int cardinalità = 0;
    int [] insieme = new int[0];

  }
  //metodi della classe per inserire e rimuovere certi elementi

  public static void insert(int num, int cardinalità){
    int [] insiemenuovo = new int[cardinalità+1];
    for(int i = 0; i < cardinalità; i++){
      insiemenuovo[i+1] = num;
      insiemenuovo[cardinalità] = insiemenuovo[i];
    }
    cardinalità++;
  }

  /*public static int intChoose(){
    //dever restituire un intero scelto arbitrariamente tra gli elemetni di una
    //istanza e mettere una eccezione EmptyException se è vuoto
    try{

    }
    catch(EmptyException e){

    }
  }

  public static int size(){
    //restituisce la cardinalità di un insieme
  }

  public static boolean contains(int x){
    //true se l'elemento è nell'insieme
  }

  @override
  public static String toString(){
    //restituisce una stringa formata dagli elementi di un insieme
    //tra parentesi graffe e separati da una virgola+
    return "ciao";
  }*/
}
