import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;                                
                                                         
public class test {                                      
    public static void main(String [] args){                                                
        //lettura da ingresso                                                                        
        Scanner sc = new Scanner(System.in);                                                         
        List<Rivestimento> r = new ArrayList<>();                                                    
                                                                                                     
        while(sc.hasNextLine()){                                                                     
            String [] comando = sc.nextLine().split(" ");                                            
                                                                                                     
            switch (comando[0]){                                                                     
                case ("Q"):                                                                          
                    r.add(new PQuadrata(Integer.parseInt(comando[1]),         
                                        Integer.parseInt(comando[2])));       
                    System.out.println("creata la pistrela quadrata");        
                    break;                                                    
                case ("R"):                                                                                   
                    r.add(new PRomboidale(Integer.parseInt(comando[1]),       
                                          Integer.parseInt(comando[2]),                            
                                          Integer.parseInt(comando[3])));     
                    System.out.println("creata la pistrela romboidale");      
                    break;                                                   
                case ("T"):                                                                                   
                    r.add(new PTriangolare(Integer.parseInt(comando[1]),                           
                                           Integer.parseInt(comando[2]),                           
                                           Integer.parseInt(comando[3])));    
                    System.out.println("creata la pistrela triangolare");    
                    break;                     
                case ("P"):                                                                          
                    Map<Rivestimento, Integer> p = new HashMap<>();                                    
                    for(int i = 1; i < comando.length; i += 2){                                      
                        p.put(r.get(Integer.parseInt(comando[i+1])), Integer.parseInt(comando[i]));                     
                    }                                                                                
                    Pavimentazione pav = new Pavimentazione(p);                                                                             
                    r.add(pav);                                                                      
                    System.out.println("pavimentazione creata:\n"+ pav);                                                             
            }                                                                                        
        }                                                                                            
        sc.close();                                                                                            
    }                                                                                                
}                                                                                                    
                          