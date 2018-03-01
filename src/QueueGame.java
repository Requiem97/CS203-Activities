/*Reyes, Marius Albero
*CS203
*2CSA
*Lab Exercises 7
*/

import java.util.Scanner;

public class QueueGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("t: ");
        int t=sc.nextInt();
        System.out.print("s: ");
         int s=sc.nextInt();
         System.out.print("n: ");
         int n=sc.nextInt();
      Queue<String> q =new Queue<>(n);
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(t==1){
            int count=0;
            System.out.print("Children:");
            for(int i=0;i<n;i++){
            System.out.print(alphabet.charAt(count)+" ");
            q.enqueue(""+alphabet.charAt(count++));
            }
            System.out.println();
            System.out.print("Elimination order:");

            for(int j=0;j<n;j++){
                for(int i=1;i<=s;i++){
                    if(i==s){
                        System.out.print(" "+q.dequeue());                
                        break;
                    }
                    q.enqueue(q.dequeue());
                }
            }
        }
    }
}
