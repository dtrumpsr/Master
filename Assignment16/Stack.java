import java.util.NoSuchElementException;


public interface Stack<T>  {
   
   
     boolean isEmpty();

   
     int size();

   
     void push(T item);

  
     T pop();

   
     T peek();   
    
}