

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int a,b,c,d,i,j,k;
        System.out.println("Enter Dimention of matrix A = ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Enter Dimention of matrix B = ");
        c=in.nextInt();
        d=in.nextInt();
        int[][] A = new int [a][b];
        int[][] B = new int [c][d];
        int[][] C = new int [a][d];
        
        if (b==c){
            System.out.println("Enter element of A :  ");
            for (i=0;i<a;i++){
                for (j=0;j<b;j++){
                    System.out.printf("A[%d][%d] = ", i ,j);
                    A[i][j]=in.nextInt();
                }
            }
            System.out.println("Enter element of B :  ");
            for (i=0;i<c;i++){
                for (j=0;j<d;j++){
                    System.out.printf("B[%d][%d] = ", i ,j);
                    B[i][j]=in.nextInt();
                }
            }
            System.out.println();
            
            System.out.print("A = ");
            for (i=0;i<a;i++){
                for (j=0;j<b;j++){
                    System.out.print("\t "+A[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.print("B = ");
            for (i=0;i<c;i++){
                for (j=0;j<d;j++){
                    System.out.print("\t "+B[i][j]);
                }
                System.out.println();
            }
            for (i=0;i<a;i++){
                for(j=0;j<d;j++){
                    C[i][j]=0;
                    for(k=0;k<b;k++){
                        C[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("\n");
            System.out.print("A*B = ");
            for (i=0;i<c;i++){
                for (j=0;j<d;j++){
                    System.out.print("\t "+C[i][j]);
                }
                System.out.println();
            }
            
        }
        else System.out.println("Invalid Dimention : ");
        
        
    }
}
