//Español, Julius Vincent Angelo 
//CS203
//2CSA
//Lab Exercises 7
//
public class Queue <T> {
    int maxQSize;
    int front;
    int rear;
    Object[] que;
    
    public Queue(int n){
        maxQSize = n;
        front = -1;
        rear = front;
        que = new Object[maxQSize];
    }
    
    public void clear(){
        front = -1;
        rear = front;
    }
    
    public boolean isEmpty(){
        return (front == -1);
    }
    
    public boolean isFull(){
        return ((rear + 1) % maxQSize == front);
    }
    
    public int enqueue(T el){
        if(isFull())
            return -999;
        rear = (rear + 1) % maxQSize;
        que[rear] = el;
        if(front == -1){
            front = 0;
        }
        return 1;
    }
    
    public T dequeue(){
        if(isEmpty())
            return null;
        T el =(T) que[front];
        if(front == rear){
            clear();
        }
        else{
            front = (front + 1) % maxQSize;
        }
        return el;
    }
    
    public T peek(){
        if(isEmpty())
            return null;
        else
            return (T) que[front];
    }
}