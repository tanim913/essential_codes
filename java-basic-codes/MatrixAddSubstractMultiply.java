

import java.util.Scanner;

public class MatrixAddSubstractMultiply {

    public static int[][] doSubtract(int[][] a, int[][] b)
    {

        int[][] c = new int[b.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            {
            for (int j = 0; j < a[0].length; j++)
            {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }
    public static int[][] doAdd(int[][] a, int[][] b)
    {

        int[][] c = new int[b.length][b[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static int[][] doMultipie(int[][] a, int[][] b)
    {

        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            {
            for (int j = 0; j < b[0].length; j++)
             {
                c[i][j]=0;
                for (int k = 0; k < a[0].length; k++)
                {

                    c[i][j]+=a[i][k]*b[k][j];
                }

            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row and colomn number : ");

        int r = in.nextInt();
        int c = in.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];

        System.out.println("Enter the Element of First Array: ");

        for (int i = 0; i < r; i++)
            {
            for (int j = 0; j < c; j++)
            {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the Element of Second Array: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = in.nextInt();
            }
        }
        System.out.println("Element of First Array: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Element of Second Array: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter S to Subtract the matrix");
        System.out.println("Enter A to Add the matrix");
        System.out.println("Enter M to Multiply the matrix");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("How many times you want to do the operation!!");
        int times= in.nextInt();
        

        

        for(int k = 1; k<= times; k++){
            
        System.out.println("Enter S to Subtract the matrix");
        System.out.println("Enter A to Add the matrix");
        System.out.println("Enter M to Multiply the matrix");
        char ch= in.next().charAt(0);

                switch(ch)
                {
                    case 'a':
                    case 'A':
                    {
                        int result[][];
                        result = doAdd(A, B);
                        System.out.println("Element of result Array: ");

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    
                    case 's':
                    case 'S':
                    {

                        int result[][];
                        result = doSubtract(A, B);
                        System.out.println("Element of result Array: ");

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    
                    case 'M':
                    case 'm':
                    {
                     if(A[0].length!=B.length)
                     {
                         System.out.println("Invalid Dimnetion to multipie!!");
                     }

                     else{
                        int result[][];
                        result = doMultipie(A, B);
                        System.out.println("Element of result Array: ");

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                     }
                      break;
                    }
                   
                }
        }
    }
}


