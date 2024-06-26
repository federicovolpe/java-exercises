// Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
public class test {                                                                                                                                
    public static void main(String[] args){                                    
        Coda<Integer> c = new Coda<>();                                        
        System.out.println("dimensione iniziale: "+ c.size());                 
        System.out.println("aggiungo 1: "+ c.enqueue(1));                      
        c.enqueue(2);                                                          
        c.enqueue(3);                                                          
        c.enqueue(4);                                                          
        c.enqueue(3024092);                                                    
        c.enqueue(5);                                                          
        System.out.println("dimensione dopo gli inserimenti: "+ c.size());     
        System.out.println("rimuovo: "+ c.dequeue());
        System.out.println("rimuovo: "+ c.dequeue());
        System.out.println("rimuovo: "+ c.dequeue());
        System.out.println("rimuovo: "+ c.dequeue());
        System.out.println("rimuovo: "+ c.dequeue());                                         
                                                                                                           
    }                                                                          
                                                                               
    public static <T extends Number> int[] sum(T[] ns){                        
        int[] s = {0, 0};                                                      
        for(int i = 0; i < ns.length; i++){                                    
            if((ns[i].intValue() % 2) == 1){                                   
                s[0] += ns[i].intValue();                                         
            }else{                                                             
                s[1] += ns[i].intValue();                                      
            }                                                 
        }                                                     
        return s;                                         
    }                                                
                                                                                                                                    
    public static <T> boolean equal(T[] a1, T[] a2){                                                                                
        for(int i = 0; i < a1.length; i++){                                                                                         
            if(!(a1[i] == a2[i])){                                     
                return false;                                            
            }                                                            
        }                                                                
        return true;                                                     
    }                                                                    
}                                                                                                                                                  
                                                                                                                                                   