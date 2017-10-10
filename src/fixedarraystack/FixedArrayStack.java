/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixedarraystack;
import java.util.Arrays;

/**
 *
 * @author Lil' Memesto
 */
public class FixedArrayStack {
    private T[] stack;
    private int topIndex;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;
     public interface StackInterface<T>
{
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
       topIndex++;
		
  	if (topIndex >= stack.length) 
    		
	stack[topIndex] = newEntry;
   }
  
   public T pop(){
    T top = null;
		
	if (!isEmpty())
	    {
		top = stack[topIndex];
		stack[topIndex] = null;
		topIndex--; 
	    }      
   }

   public T peek(){
     T top = null;
		
	if (!isEmpty())
	    top = stack[topIndex];
		
	return top;  
       }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
    return topIndex < 0;
  
   }/** Removes all entries from this stack. */
   public void clear(){
       for (; topIndex > -1; topIndex--)
	    stack[topIndex] = null;
   }
}
    }
    

