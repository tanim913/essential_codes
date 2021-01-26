import java.util.Scanner;

public class SomeMoreStringMethods{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        String ch ;
        System.out.println("Enter the string : ");
        ch = in.nextLine ();
        //use of a.replace (char a(which needed to be changed), char b(which is use repalced with b))
        System.out.println("Enter a character to replace with another given character : ");
        System.out.println((ch.replace((in.next().charAt(0)),(in.next().charAt(0)))));
        
        System.out.println("split when it gets a space");
        
        for(String x : ch.split(" ")){
            System.out.println(x);
        }
        
        
    }
    
}
