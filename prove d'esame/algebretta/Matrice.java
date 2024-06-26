public interface Matrice {                                                 
                                                                           
    /*                                                                     
     * method to get an element of the matrix knowing its inexes           
     *                                                                     
     * @param x row of the element searched                                
     * @param y column of the element searched                             
     * @return the number in the matrix [x][y]                             
     * @throw IllegalArgumentException if the coordinates are out of bounda
     *                   
     */                  
    int get(int x, int y);                                                                    
                                                                           
    /*                                                                     
     * method that returns the dimension of the current matrix             
     * @return the size of the matrix                                      
     *                                                                     
     */                                                                    
    int dim();                                                             
                                                                           
    /*                                                                                     
     * method that multiplies two matrices                    
     *                                                        
     * @params m the other matrix to multiply                                              
     * @returns a third matrix result of the multiplication                                
     * @throws IllegalArgumentException if m hasnt the same dimension of the current matrix
     *                                                                                     
     */                                                                                    
    Matrice per(Matrice m);                                                                
                                                                                           
    /*                                                                                     
     * method that multiplies the current matrix with a vector                             
     *                                                                                     
     * @params v the vector to multiply                                                    
     * @returns a third matrix result of the multiplication                                
     * @throws IllegalArgumentException if v hasnt the same dimension of the current matrix
     *                                                                                     
     */                                                                                    
    Matrice per(Vettore v);                                                                
                                                                                           
                                                                                           
    /*                                                                                     
     * method that adds the current matrix to another one                                  
     *                                                                                     
     * @param m the matrix to add                                                          
     * @return a third matrix with the result                                              
     * @throws IllegalArgumentException if m hasnt the same dimension of the current matrix
     *                     
     */                    
    Matrice piu(Matrice m);                                                                                 
}                                                                                                                                                                                  