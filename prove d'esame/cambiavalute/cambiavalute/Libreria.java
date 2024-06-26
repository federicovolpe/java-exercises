import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;                 
import java.util.List;                      
                                            
public class Libreria{                      
                                            
    static private List<String> libri;                    
                                            
    {                                 
        libri = new ArrayList<>();          
        libri.add("il libro della giungla");
        libri.add("libro b");               
        libri.add("libro c");               
        libri.add("libro d");               
    }                                       
                                            
    public void add(String libro){          
        libri.add(libro);                   
    }                                       
                                            
    @Override                               
    public String toString(){               
        return libri.toString();            
    }                                       
                                            
    public void save(String fileName){
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String libro : libri) {
                writer.println(libro);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }                                       
}                                           
                                            