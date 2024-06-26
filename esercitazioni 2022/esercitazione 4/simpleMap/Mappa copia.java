import java.util.ArrayList;

class Mappa{
    //per ogni volta che si vuole devono essere memorizzate una chiave e una stringa
    //verranno memorizzate per comodità in liste di oggetti

    static ArrayList<relazione> map = new ArrayList<relazione>();


    public void put(int x, String y){
        System.out.println("sono dentro la classe mappa e sto inizializzando una mappa");
        relazione nuova = new relazione(x,y); 
		if(this.controlla(nuova.chiave) < 0){
			map.add(nuova);
		}else{
			System.out.println("ciccio un valore con questa chiave lo hai già inserito");
		}
    }

	//aggiunta del metodo remove per rimuovere un elemento
	public void remove(int x, String k){
		//siccome non ho l'indice dell'elemento che sto cercando me lo cerco
		for(int i = 0; i < map.size(); i++){
			System.out.println(map.get(i).valore()+" "+map.get(i).chiave);
			if(map.get(i).valore() == x && map.get(i).chiave == k){
				map.remove(i);
				break;
			}
		}
	}

	//funzione che ritorna l'indice dell'elemento nellinsieme nel caso sia presente
	public int controlla(String k){
		for(int i = 0; i < map.size(); i++){
			if(map.get(i).chiave == k){
				return i;
			}
		}
		return -1;
	}

	public void vediLista(){
		for(int i = 0; i < map.size(); i++){
			System.out.println(map.get(i).valore()+" "+map.get(i).chiave);
		}
	}
	//funzione che controlla che due chiavi siano uguali
	public boolean equals(relazione R1, relazione R2){
		if(R1.chiave == R2.chiave){
			return true;
		}
		return false;
	}
}
