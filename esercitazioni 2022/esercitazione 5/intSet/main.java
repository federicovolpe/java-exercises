//import stocaz.java;

public class main{
  public static void main(String [] args){
    System.out.println("hello world");
    IntSet set1 = new IntSet();
    set1.insert(1);
    set1.insert(4);

    set1.insert(6);
    set1.insert(7);
    set1.insert(2);
    set1.insert(5);
    try{
    System.out.println("ho schelto il numero: " + set1.intChoose());
    }catch (insiemeVuoto e){
    
    }
    System.out.println("l'insieme ha "+set1.size()+" elementi");
    System.out.println(set1.toString());
  }
}
