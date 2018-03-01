/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
public class BTNode<T> {

    T key;
    int level;
    BTNode<T> left, right;

    public BTNode() {
        this(null, null, null);
    }

    public BTNode(T el) {
        this(el, null, null);
    }

    public BTNode(T el, BTNode<T> l, BTNode<T> r) {
        key = el;
        left = l;
        right = r;
    }

    @Override
    public String toString() {
        if (this.key == null) {
            return "";
        }

        String values = "[K=" + this.key;

        if (this.left != null) {
            values = values + " L=[" + toString(this.left) + "]";
        }

        if (this.right != null) {
            values = values + " R=[" + toString(this.right) + "]";
        }

        return values + "]";
    }

    private String toString(BTNode el) {
        String values = "K=" + el.key;
        if (el.left != null) {
            values = values + " L=[" + toString(el.left) + "]";
        }
        if (el.right != null) {
            values = values + " R=[" + toString(el.right) + "]";
        }
        return values;
    }

}
