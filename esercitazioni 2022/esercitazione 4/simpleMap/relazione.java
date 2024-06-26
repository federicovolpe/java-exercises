class relazione {

    private int valore;
    String chiave;

    public relazione(int x, String y){
        System.out.println("sono dentro la classe relazione e la sto inizializzando");
        valore = x;
        chiave = y;
    }
	public relazione(){
	
	}
	//metodo che ritorna il valore
	public String chiave(){
		return chiave;
	}
	//metodo che ritorna la chiave
	public int valore(){
		return valore;
	}
}
