public interface BoolVect {                                                            
                                                                                       
    /*                                                                                 
     * method which sets the n-th value of the boolVect to v and modifies the dimension
     *                                                        
     * @param i the index to which modify the value                             
     * @param v the boolean value to assign                   
     * @throws IllegalArgumentException if i is out of bounds        
     *                                                               
     */                                                                                
    void set(int i, boolean v) throws IllegalArgumentException;                                                        
                                                                     
    /*                                                               
     * method used to get the n-th element of the BoolVect               
     *                                                                   
     * @params i the index to which get the value                        
     * @throws IllegalArgumentException if i is out of bounds (i < 0)    
     *                                                                   
     */                                                                  
    boolean get(int i) throws IllegalArgumentException;                                                                
                                                                                       
    /*                                                                   
     * method for the and operation between this BoolVect and another One
     *                                                
     * @param v the other boolvect                    
     * @returns a third BoolVect containing the answer              
     * @throws NullPointerException if v is null      
     *                                                
     */                                               
    BoolVect and (BoolVect v);                         
                                                      
    /*                                                                   
     * method for the or operation between this BoolVect and another One
     *                                                
     * @param v the other BoolVect                    
     * @returns a third BoolVect containing the answer              
     * @throws NullPointerException if v is null      
     *                                                
     */                                               
    BoolVect or (BoolVect v);  
                                                      
    /*                                                                   
     * method for the xor operation between this BoolVect and another One
     *                                                
     * @param v the other boolvect                    
     * @returns a third BoolVect containing the answer              
     * @throws NullPointerException if v is null      
     *                                                
     */                                               
    BoolVect xor (BoolVect v);                         
}                                                     
                                                      