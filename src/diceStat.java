/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
public class diceStat {

    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        double rnd = 0;
        for (int i = 0; i < 300; i++) {
            rnd = Math.floor(Math.random() * 6 + 1);
            if (rnd == 1) a++;
            else if (rnd == 2) b++;
            else if (rnd == 3) c++;
            else if (rnd == 4) d++;
            else if (rnd == 5) e++;
            else if (rnd == 6) f++;
        }
        System.out.println("1: " + a);
        System.out.println("2: " + b);
        System.out.println("3: " + c);
        System.out.println("4: " + d);
        System.out.println("5: " + e);
        System.out.println("6: " + f);
    }
}
