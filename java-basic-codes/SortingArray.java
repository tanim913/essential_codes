


import java.util.Scanner;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i ,n,m;
        System.out.println("Enter the index : ");
        n=in.nextInt();  
        int [] ar = new int[n];
        System.out.println("Enter the Array element: ");
        for (i = 0; i < n; i++) {
            
            System.out.printf("ar[%d] = ",i);
            ar[i]=in.nextInt();
            
        }
        Arrays.sort(ar);
        System.out.printf("Ascending order : \n");
        for (i = 0; i < n; i++) {
            
            System.out.print(ar[i]+" ");
            
        }
        System.out.printf("\nDescending order : \n");
        for (i = n-1; i >=0; i--) {
            
            System.out.print(ar[i]+" ");
            
        }
        System.out.print("\nHow many names?\nAns: ");
        m=in.nextInt();
        
        String[] name= new String [m];
        System.out.println("Enter names : ");
        in.nextLine();
        for (i=0;i<m;i++){
            name[i]= in.nextLine ();
        }
        Arrays.sort(name);
        System.out.println();
        System.out.println("Alphanumaric : ");
        for (i=0;i<m;i++){
            System.out.println(name[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Alphanumaric : ");
        for (i=m-1;i>=0;i--){
            System.out.println(name[i]+" ");
        }
    }
    
}
