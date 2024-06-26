import java.util.Scanner;                                      
                                                               
public class test {                                            
    public static void main(String [] args){                   
        Scanner sc = new Scanner(System.in);                   
                                                               
        String[] elems = sc.nextLine().split(" ");             
        MultiSet<String> m1 = new MultiSetMap<>();            
        for(int i = 0; i < elems.length; i++) m1.add(elems[i]);       
        System.out.println("multiset 1: "+ m1.toString());            
                                                                           
        elems = sc.nextLine().split(" ");                                          
        MultiSet<String> m2 = new MultiSetMap<>();                                 
        for(int i = 0; i < elems.length; i++) m2.add(elems[i]);                    
        System.out.println("multiset 2: "+ m2.toString());                         
                                                                                   
        System.out.println("unione: "+ m1.union(m2).toString());                   
        System.out.println("unione inversa: "+ m2.union(m1).toString());           
                                                                                   
        System.out.println("intersezione: "+ m1.intersection(m2).toString());        
        System.out.println("intersezione inversa: "+ m2.intersection(m1).toString()); 
                                                                                   
        sc.close();                                                                
    }                                                                              
}                                                                                  
                                                                                   