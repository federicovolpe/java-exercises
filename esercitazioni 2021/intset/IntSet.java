import java.util.ArrayList;

public class IntSet {
    ArrayList<Integer> Set = new ArrayList<Integer>();

    /* pre condizioni:
     * post condizioni:aggiunge un elemento ad un insieme a patto che questo elem
     * non sia già presente
     * modifies:
     */

    public void add(int i){
        this.Set.add(i);
    }

    /* pre condizioni:
     * post condizioni: restituisce un intero scelto fra gli elementi di una istanza solleva
     * una eccezione se l'insieme è vuoto
     * modifies:
     */
    public int choose(){
        try{
            return this.Set.get(this.Set.size()-1);
        }catch(IndexOutOfBoundsException i){
            System.out.println("l'insieme è vuoto e quindi non posso prelevare alcun numero");
            return 0;
        }
    }
    /* pre condizioni: representation invariant rispettata
     * post condizioni: restituisce la cardinalità di un isieme
     * modifies:--------------------
     */ 
    public int size(){
        return this.Set.size();
    }

    /* pre condizioni: l'oggetto passato come argomento deve essere un intero
     * post condizioni: restituisce tue se l'elemento è nell'insieme false altrimenti
     * modifies:----------------------------
     */
    public boolean contains(int x){
        return this.Set.contains(x);
    }

    /* pre condizioni: representation invariant rispettata
     * post condizioni: restituisce una stringa formattata con gli elementi dell'insieme
     * modifies:
     */
    public String toString(){
        String finale = "{";
        for(Integer i : this.Set){
            finale += " "+ i;
        }
        finale += "}";
        return finale;
    }

    /* invariante di rappresentazione
     * l'insieme deve contenere interi positivi
     * l'insieme non deve contenere doppioni
     */
    public boolean repOk(){
        for(int i = 0; i < Set.size()-1; i++){
            for(int j = i+1; j < Set.size(); j++){
                if(Set.get(i).equals(Set.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
