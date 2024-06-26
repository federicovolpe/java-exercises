public class prova {                                              
    public static void main(String [] args){                      
        Giocattolo g = new Giocattolo("cazzo", "di gomma");       
        Giocattolo g2 = new Giocattolo("cazzo", "di gomma");      
        Inventario i = new Inventario();                          
        i.aggiungi(3, g);                                         
        System.out.println("giocattoli "+ g2 +" "+ i.howMany(g2));             
    }                                                             
                                                                  
}                                                                 
                                                                  