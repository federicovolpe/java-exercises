public class Poly{
  int gradoDelPolinomio;
  public Poly(){
    gradoDelPolinomio = 0;
  }
  public Poly(int c, int n){
    try{//se il polinomio è di grado negativo solleva leccezione
      int [] polinomio = new int[n];
      polinomio[n] = c;
      gradoDelPolinomio =
    }
    catch(NegativeArraySizeException e){
      System.out.println("ciccio non puoi inserire un esponente negativo");
    }
  }
  public static Poly PolyAdd(Poly x){
    //sommma del polinomio in input al polinomio corrente
    for(int i = max(x.gradoDelPolinomio))
  }
}
