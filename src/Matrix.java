/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
import java.util.Scanner;
public class Matrix {
    public static void multiPrint(int[][] P)
    {
      
      
      
   }
        public static void main (String args[]){
        
        int [][] M={ {2,1,1,1,1,1,1,1,1,2},
                     {1,0,0,0,0,0,0,0,0,1},
                     {1,0,-1,-1,-1,-1,-1,-1,0,1},
                     {1,0,2,2,0,0,1,1,0,1},
                     {1,0,2,2,0,0,1,1,0,1},
                     {1,0,3,3,4,5,-2,-2,0,1},
                     {1,0,3,3,6,7,-2,-2,0,1},
                     {1,0,-1,-1,-1,-1,-1,-1,-0,1},
                     {1,0,0,0,0,0,0,0,0,1},
                     {2,1,1,1,1,1,1,1,1,2}};
      
        int t;
        Scanner input = new Scanner(System.in);
        
        
        int m,n,r,s,p,u,v;
            for(int i=0; i<=9; i++){
                for(int j=0; j<=9; j++){
                 System.out.format("%3d",M[i][j]);
                 if(j==9){
                     System.out.format("%n");
                 }
                
                }
            }
        System.out.print("Input T:");
      
        t=input.nextInt();
             
             if(t==1){
              
                
             
                           System.out.print("Input m: ");
                            m=input.nextInt(); 

                            System.out.print("Input n: ");
                            n=input.nextInt();
                           
                             System.out.print("Input P: ");
                            p=input.nextInt();
                            
                            System.out.print("Input R: ");
                            r=input.nextInt();
                            
                            System.out.print("Input S: ");
                            s=input.nextInt();

                           
                            
                            System.out.print("Input U: ");
                            u=input.nextInt();
                            
                            System.out.print("Input V: ");
                            v=input.nextInt();
                          
                            System.out.print("Submatrix A= ");
                             int sHolder = s;
                             int[ ][ ] A = new int[m][n]; 
                             for(int row=0; row<m; row++){
                                for(int column=0; column<n; column++){
                                    System.out.print(M[r][s]+"   ");
                                    A[row][column] = M[r][s];
                                    s++;
                                }
                             System.out.println();
                             s=sHolder;
                             r++;
                             } 
                          
                         System.out.println("\n");
                         System.out.println("Submatrix B=");
                         
                         int vHolder = v;
                             int[ ][ ] B = new int[n][p]; 
                             for(int row=0; row<n; row++){
                                 for(int column=0; column<p; column++){

                                 System.out.print(M[u][v]+"   ");
                                  B[row][column] = M[u][v];
                                  v++;
                                  }

                                System.out.println();
                                v=vHolder;
                                u++;
                             }
                          System.out.println("\n");
                          System.out.println("P=");
                        int[][] P = new int[m][p];

                        for(int i=0;i<m;i++){
                            for(int j=0;j<p;j++){
                                P[i][j]=0;
                                for(int a=0;a<n;a++){
                                P[i][j]+=A[i][a]*B[a][j];}
                                System.out.printf("%4d  ",P[i][j]); 
                            }System.out.println();
                        }
                       
        }
             
        if(t==2){
                
                
                
        }
        if(t==3){
                
                
                
        }
        
        
    }
}
