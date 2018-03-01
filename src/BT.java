/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
public class BT<T> {
    BTNode<T> root;
    int height = -1;
    
    public BT(){
        root = null;
    }
    
    public void setRoot(BTNode<T> el){
        root = el;
        height = 0;
    }
    
    public boolean isEmpty(BT<T> T){
        return (T.root == null);
    }
    
    public boolean isLeaf(BTNode<T> n){
        return n == null 
                ? false
                : (n.left == null && n.right == null);
    }    
    
    public void computeLevels(){
        Queue<BTNode> q = new Queue<>(10);
        BTNode p = root;
        if(p != null){
            q.enqueue(p);
            while(!q.isEmpty()){
                p = q.dequeue();
                System.out.println("K=" + p.key + " Level=" + height);
                if(p.left != null){
                    q.enqueue(p.left);
                    height++;
                }
                if(p.right != null){
                    q.enqueue(p.right);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        if(height == -1){
            return "ht=undefine";
        }
        
        String values = "[K=" + root.key;
        
        if(root.left != null){
            values = values + " L=[" + toString(root.left) + "]";
        }
        
        if(root.right != null){
            values =  values + " R=[" + toString(root.right) + "]";
        }
        
        return "ht=" + height + " " + values + "]";
    }

    private String toString(BTNode el){
        String values = "K=" + el.key;
        if(el.left != null){
            values =  values + " L=[" + toString(el.left) + "]";
        }
        if(el.right != null){
            values =  values + " R=[" + toString(el.right) + "]";
        }
        return values;
    }
}
