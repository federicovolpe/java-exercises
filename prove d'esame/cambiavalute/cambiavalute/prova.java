public class prova {                       
    public static void main(String [] args){
        Libreria l = new Libreria(); 
        System.out.println(l);       
        l.add("libro aggiunto");
        l.save();
        System.out.println(l);     
        Libreria l2 = new Libreria();
        System.out.println(l2);      
    }                                      
}                                    
                                     
                                     
                                     