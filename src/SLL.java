/* Reyes, Marius Alberto P.
 * CS-203
 * 2CS-A
 * Lab Exercise 8 
 */

public class SLL<T>{
    
    private SLLNode<T> head, tail;
    
    public SLL(){
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToHead(T el){
        head= new SLLNode<T>(el, head);
        if (tail == null){
            tail = head;
        }
    }
    
    public void addToTail(T el){
        if(isEmpty()){
            head = tail = new SLLNode<T>(el);
        }
        else{
            tail.next = new SLLNode<T>(el);
            tail = tail.next;
        }
    }
        
    public T deleteFromHead(){
        if(isEmpty()){
            return null;
        }
        T el = head.info;
        
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
        return el;
    }
    
    public T deleteFromTail(){
        if(isEmpty()){
            return null;
        }
        T el = tail.info;
         if(head == tail){
            head = tail = null;
        }
         else{
             SLLNode<T> p;
             for(p = head; p.next != tail; p = p.next);
             tail = p;
             tail.next = null;
         }
         return el;  
    }
    
    public T delete(T el){
        if(isEmpty()) return null;
        if(((Comparable)el).compareTo(head.info)==0)
            return deleteFromHead();
        if(((Comparable)el).compareTo(tail.info)==0)
            return deleteFromTail();
        SLLNode<T> pred, t;
        for(pred=head, t=head.next;
            t!=null&&((Comparable)t.info).compareTo(el)!=0;
            pred=pred.next,t=t.next);
        if(t==null)return null;
        else{
            pred.next=t.next;
     
            return el;
        }
    }
    
    public String toString(){
        SLLNode<T> p;
        String s = "";
        for(p = head; p != null; p = p.next){
            s = s + p.info.toString() + " ";            
        }
        return s;
    }
    
    public void insertAfterNode(T el, SLLNode<T> ptr){
        if(ptr!=null){
            if(tail==ptr) addToTail(el);
            else ptr.next = new SLLNode<T>(el,ptr.next);
        }
    }
    

        public void insertAsc(T el){
       
       if(isEmpty()){
            head = tail = new SLLNode<T>(el);
        }
       
       else{
           if(((Comparable)head.info).compareTo(el) >= 0){
               addToHead(el);
           }
           else if(((Comparable)tail.info).compareTo(el) <= 0){
               addToTail(el);
           }
           else{
               SLLNode<T> p = head;
               while(((Comparable)p.next.info).compareTo(el) < 0){
                   p = p.next; 
               }
                insertAfterNode(el, p);
           } 
       }
    }
    
}
