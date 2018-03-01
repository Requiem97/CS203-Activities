/*Reyes, Marius Alberto P.
*CS203
*2CSA
*Lab Exercise3
*/

import java.io.*;  
import java.util.Scanner;
public class BigOh {
    
    int n2=1;
    public static void printOrderedPair(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("("+i+","+j+")");
            }
        }
    }
    static double powerHalving(int n){
        double a = 0.00;
        double c = 0.00;
        double b = 1.0001;
       if(n==0){ 
           return 1; 
       }
       else if( n%2 != 0){ 
           c=Math.pow(b,powerHalving(n-1)/2);
           a=(c*c)*b;
           return a;
       }
       else {c=Math.pow(b, powerHalving(n/2));
             a=c*c;
             return a;
       }
       
        
    }
    public static void main(String[] args) {
        int maxTime;
        Scanner input= new Scanner(System.in);
        
        System.out.println("Input Max Time:");
        maxTime=input.nextInt();
        
        double startTime=System.nanoTime();
        double elapsedTime=0;
        
      while(elapsedTime <= maxTime){
         
         System.out.println("n:" + n);
         printOrderedPair(n);
         double current = System.nanoTime();
         elapsedTime = (current - startTime)  / 1000000000.0;
         System.out.println("\n"+ "Elapsed Time: "+ elapsedTime);
         n++;
     }
    double startTime2 = System.nanoTime();  
    double elapsedTime2= 0.00;
    while(elapsedTime2 <= maxTime){
        
        System.out.println("n:" + n1);
        System.out.println("Power: " +powerHalving(n1) +" ");
        double current2 = System.nanoTime();
        elapsedTime2 = (current2 - startTime2)/ 1000000000.0;
        n1++;
        
        
    }
    
     
     }
    
     static int n=1;
     static int n1=1;
     
     
        
        
    }
