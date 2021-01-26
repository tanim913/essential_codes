


import java.util.Scanner;

public class ArrayPattern {
    public static void main(String[] args) {
        int n;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter N :");
        n=in.nextInt();
        int[][] ar = new int[n][];
        int i,j,k=0;
        
        for(i=0;i<n;i++){
            ar[i]=new int [i+1];
        }
        
        for ( i = 0; i < n; i++) {
            for (j = 0; j < i+1; j++) {
                ar[i][j]=k;
                k++;
                
            }
        }
         for ( i = 0; i < n; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print(" "+ar[i][j]);
            }
             System.out.println();
         }
    }
    
}
