
public class main{
    //OBIETTIVO CREARE DELLE REFERENZE FRA DELLE CHIAVI E DEI VALORI
    public static void main(String[] args){
        Mappa insieme = new Mappa();
        insieme.put(2,"ciao baby");
        insieme.put(3,"signore");
        insieme.put(4,"hello");
        insieme.put(5,"non mi piaci");
        insieme.put(6,"sei formaggino?");
        insieme.remove(3,"signore");
        System.out.println("              ");
        insieme.vediLista();
    }
}