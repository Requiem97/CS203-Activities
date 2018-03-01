/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
public class Stack<T> {
    private int maxStkSize = 100;
    private int top = -1;
    private Object [] stk;
    public Stack (){
        stk = new Object [maxStkSize];
    }
    public Stack (int n){
        if (n>0) maxStkSize = n;
        stk = new Object [maxStkSize];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxStkSize-1);
    }
    public int push (T el){
        if (isFull()) return -999;
        top+=1;
        stk[top] = el;
        return 1;
    }
    public T pop (){
        if (isEmpty()) return null;
        T el = (T) stk[top--];
        return el;
    }
    public T peek(){
        if (isEmpty()) return null;
        T el = (T) stk[top];
        return el;
    }
    void clear (){
        top = -1;
    }
}
