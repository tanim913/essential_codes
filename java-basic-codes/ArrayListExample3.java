
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListExample3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List <Integer> n = new ArrayList <> ();
        List <Integer> m = new ArrayList <> ();
        List <Integer> o = new ArrayList <> ();
        
        System.out.print("\nHow many value do you want to input ?\nAns :  ");
        int ad= in.nextInt();
        
        System.out.println("Enter value for array list for n  : ");
        for (int i=0;i<ad;i++){
            n.add(i,in.nextInt());
        }
        System.out.println("Enter value for array list for m  : ");
        for (int i=0;i<ad;i++){
            m.add(in.nextInt());
        }
        System.out.println("n : "+n);
        System.out.println("m : "+m);
        o.addAll(n);
        System.out.println("o : "+o);
        
        System.out.println("n==m : "+n.equals(m));
        System.out.println("n==o : "+n.equals(o));
        
        
    }
}
