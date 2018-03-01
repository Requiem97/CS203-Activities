/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
public class BTBottomUp {
    public static void main(String[] args){
        BTNode<Integer> BN2 = new BTNode<>(2);
        BTNode<Integer> BN4 = new BTNode<>(4);
        BTNode<Integer> BN1 = new BTNode<>(1, null, BN2);
        BTNode<Integer> BN5 = new BTNode<>(5, BN4, null);
        BTNode<Integer> BN3 = new BTNode<>(3, BN1, BN5);
        BT<Integer> tree = new BT<>();
        BT<Integer> tree2 = new BT<>();
        tree.setRoot(BN3);
        tree.computeLevels();
        System.out.println(tree);
        System.out.println(tree2);
    }
    
    public static void breadthFirst(BT T) {
        Queue<BTNode> q = new Queue<>(10);
        BTNode p = T.root;
        if(p != null){
            q.enqueue(p);
            while(!q.isEmpty()){
                p = q.dequeue();
                System.out.println(p.key);
                if(p.left != null){
                    q.enqueue(p.left);
                }
                if(p.right != null){
                    q.enqueue(p.right);
                }
            }
        }
    }
    
    //Depth-first Traversal
    public static void Preorder(BTNode e){
        if(e != null){
            System.out.println(e.key);
            Preorder(e.left);
            Preorder(e.right);
        }
    }
    
    public static void Inorder(BTNode e){
        if(e != null){
            Inorder(e.left);
            System.out.println(e.key);
            Inorder(e.right);
        }
    }
    
    public static void Postorder(BTNode e){
        if(e != null){
            Postorder(e.left);
            Postorder(e.right);
            System.out.println(e.key);
        }
    }
}
