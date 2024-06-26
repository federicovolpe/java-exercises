public interface MultiSet<E> extends Iterable<E> {         
                                       
    int add(E e);                                
                                       
    int remove(Object o);                             
                                       
    default boolean contains(Object o){
        return multiplicity(o) > 0;
    }                              
                                       
    int multiplicity(Object o);                       
                                       
    int size();                                       
                                       
    MultiSet<E> union(MultiSet<? extends E> o);       
                                       
    MultiSet<E> intersection(MultiSet<? extends E> o);
}                                                   