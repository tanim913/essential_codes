
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> name = new ArrayList <>();
        //ArrayList <Integer> n = new ArrayList <> (); 
        System.out.print("\nHow many value do you want to input ?\nAns :  ");
        int ad= in.nextInt();
        
        System.out.println("Enter value for array list : ");
        for (int i=0;i<ad;i++){
            name.add(i,in.nextInt());
        }
        System.out.println("The arraylist before clearing : \n"+name);
        System.out.print("Index of : ");
        int idx= in.nextInt();
        System.out.print(" is "+name.indexOf(idx));
        
        boolean a = name.contains(idx);
        System.out.println();
        System.out.println(idx+" contains in "+name+" and it's "+a);
        
        System.out.println("You want set at position no  and number : ");
        name.set(in.nextInt()-1,in.nextInt());
        System.out.println("After setting : "+name);
        System.out.println("Whcih index's element you want to know : ");
        int id = name.get(in.nextInt());
        System.out.println(id);
        name.clear();
        boolean b = name.isEmpty();
        System.out.println("list is empty : "+b);
        
        
    }
    
}
