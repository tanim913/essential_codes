
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {
        int i ,ad;
        
        ArrayList <Integer> n = new ArrayList <> (); 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Size: "+n.size());
        
        System.out.print("\nHow many value do you want to input ?\nAns :  ");
        ad= in.nextInt();
        
        System.out.println("Enter value for array list : ");
        for (i=0;i<ad;i++){
            n.add(i,in.nextInt());
        }
        
        Iterator itr= n.iterator();
        
        System.out.println("Using Simple rule: ");
        System.out.println(n);
        
        System.out.println("Using for-each loop : ");
        n.forEach((x)->{
            System.out.print(x+" ");
        });
        
        System.out.println("\nusing Iterator :");
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        
        System.out.println("\nNow Size: "+n.size());
        
        System.out.println("Enter the position to remove the number : ");
        int rv = in.nextInt();
        n.remove(rv-1);
        System.out.println("Now the list is : \n"+n);
        System.out.println("\nNow Size: "+n.size());
        
        System.out.println("Enter the postion and and enter the number to add :");
        System.out.print("Enter position : ");
        int pos= in.nextInt ();
        System.out.print("Enter Number : ");
        int num= in.nextInt();
        n.add(pos-1,num);
        System.out.println("Now the list is : \n"+n);
        
        System.out.println("\nNow Size: "+n.size());
        
        
        
    }
    
}
