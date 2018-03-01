/*Reyes, Marius Alberto
 * CS 203
 * 2CSA
 * Lab Exercise 2
 */
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t=0;
        int i=0;
        System.out.print ("Input t: ");
        t = s.nextInt();
        s.nextLine();
        System.out.print ("Input string: ");
        String st = s.nextLine();
        String [] str = st.split(" ");
        for (i=0; i<str.length; i++){
            System.out.println (str [i]);
        }
        switch (t){
            case 1: System.out.println ("The reversal is");
                    reverse (str, 0, str.length-1);
                    for (i=0; i<str.length; i++){
                        System.out.println (str [i]);
                    }
                    break;
        }
        
        s.close();
    }
    static String[] reverse (String [] str, int start, int len){
        if (len == start || len<start){
            return str;
        }
        else {
            String holder = str[len];
            str[len] = str[start];
            str[start] = holder;
            reverse (str, start+1, len-1);
            return str;
        }
    }
}
