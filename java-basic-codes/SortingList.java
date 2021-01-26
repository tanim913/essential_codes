

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SortingList {
    public static void main(String[] args) {
        int i, ad;
        ArrayList <Integer> n= new ArrayList <>();
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow many value do you want to input ?\nAns :  ");
        ad= in.nextInt();
        
        System.out.println("Enter value for array list : ");
        for (i=0;i<ad;i++){
            n.add(in.nextInt());  
        }
        Collections.sort(n);
        System.out.println("ascending oder : "+n);
        Collections.sort(n,Collections.reverseOrder());
        System.out.println("descending oder : "+n);
    }
}
