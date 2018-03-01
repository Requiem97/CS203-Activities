/* Reyes, Marius Alberto P.
 * CS-203
 * 2CS-A
 * Lab Exercise 8 
 */

public class SLLNode<T>{
    
    public T info;
    public SLLNode<T> next;
    
    public SLLNode(){
        next=null;
    }
    public SLLNode(T el){
        info=el;
        next=null;
    }
    public SLLNode(T el, SLLNode<T> ptr){
        info = el;
        next = ptr;
    }
}

