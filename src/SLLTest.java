/* Reyes, Marius Alberto P.
 * CS-203
 * 2CS-A
 * Lab Exercise 8 
 */

import java.util.Scanner;

public class SLLTest {

    public static String str[];
    public static String str2[];
    public static String data;

    public static void main(String args[]) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("t=");
        int t = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("s:");
        String s = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("s2:");
        String s2 = sc3.nextLine();

        str = s.split(" ");
        int strLength = str.length;
        str2 = s2.split(" ");
        int strLength2 = str2.length;

        if (t == 1) {

            System.out.println("First Linked List Contents:");
            int i = 0;
            SLLNode<Integer> j = new SLLNode<Integer>();
            SLL<Integer> h = new SLL<Integer>();
            SLL<Integer> m = new SLL<Integer>();

            while (i < strLength) {
                int x = Integer.valueOf(str[i]);
                h.insertAsc(x);
                System.out.println(h.toString());
                i++;
            }
            System.out.println("Second Linked List Contents:");
            int k = 0;

            while (k < strLength2) {
                int x1 = Integer.valueOf(str2[k]);
                m.insertAsc(x1);
                System.out.println(m.toString());
                k++;
            }

        }
    }

}
