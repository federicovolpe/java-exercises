public interface Vettore {                                             
                                                                       
    /*                                                                 
     * method that returns the dimension of the current vector         
     * @return the size of the vector                                  
     *                                     
     */                                                                
    int dim();                                                         
                                                                       
    /*                                                                 
     * method that returns the value contained in the vector at index i
     * @param i index of the element to obtain                      
     * @return the element of the vector at index i if it is present
     * @throws IndexOutOfBounds if i is out of range               
     *                                                             
     */                                                                
    int val(final int i) throws IndexOutOfBoundsException;                                              
                                                                   
    /*                                                                  
     * method that multiplies the current vector to a scalar            
     * @param alpha the scalar to which multiply the current vector     
     * @return a second vector result of the multiplication                                
     *                                                                                     
     */                                                                                    
    Vettore per(final int alpha);                                                          
                                                                                           
    /*                                                                                     
     * method that creates anothe vector representing the sum of the two                   
     * @param v the other vector to sum                                                    
     * @return a third vector result of the sum                                            
     * @throws IllegalArgumentException if v hasnt the same dimension of the current vector
     *                                                                                     
     */                                                                                    
    Vettore più(final Vettore v) throws IllegalArgumentException;                                                          
}                                                                                          