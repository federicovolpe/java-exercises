import java.util.Scanner;                   
                                            
/**                                                      
 * interprete per i comandi data da una classe immutabile
 */                                                      
public class Shell {                                     
    public static void main(String[] args){                  
        String[] input = new String[1] ;                        
        Scanner sc = new Scanner(System.in);          
        FileSystem f = new FileSystem();              
                                                      
        while( ! (input.length != 0)){                     
            System.out.print("inserisci un comando : ");
            input = sc.nextLine().split(" ");         
            if (input.length == 0) break;             
                                                      
            switch (input[0]){                        
                case "ls":                                         
                    f.ls(new Path(input[1]));                                  
                    break;                            
                case "size": 
                                             
                    break;                            
                case "mkdir":                                           
                    break;                                              
                case "mkfile":                                          
                    break;                                              
                case "cd":                                              
                    break;                                              
                case "pwd":                                             
                    break;                                              
                                               
                default:                                           
                    System.out.println("comando non riconosciuto");
                    break;                                                  
            }                                                           
                                                                        
        }                                                               
                                                                        
        sc.close();                                                     
    }                                                                   
}                                                                       
                                                                        