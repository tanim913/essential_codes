

import java.util.Scanner;

public class String_methods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two String : ");
        
        String a = in.nextLine();
        String b = in.nextLine ();
        String c;
        c=a;
        System.out.println("Length of a "+a.length());
        System.out.println("Length of b "+b.length());
        System.out.println("a==b : "+a.equals(b));
        System.out.println("a==b :(Ignoring Case) : "+a.equalsIgnoreCase(b));
        System.out.println("a==b :(Ignoring Case) : "+a.equalsIgnoreCase(b));
        //System.out.println("Group of words of b contains in a : "+ a.contains.equalsIgnoreCase(b));
        System.out.println("a is empty : "+a.isEmpty());
        System.out.println("b is Empty : "+b.isEmpty());
        System.out.println("Full Name : "+ a+b);
        System.out.println("Full Name : (Using Concat : )"+ a.concat(b));
        System.out.println("Full Name : (Full Upper Case) : "+ (a.concat(b)).toUpperCase());
        System.out.println("Full Name : (Full Lower Case) : "+ (a.concat(b)).toLowerCase());
        System.out.println("a starts with b : "+a.startsWith(b));
        System.out.println("a ends with b : "+a.endsWith(b));
        System.out.println("c copied from a : " +c );
        System.out.println("character at 0th index a : "+a.charAt(0)+"\nand the Ascii code of the character is : "+a.codePointAt(0));
        System.out.println("Enter a belonging character of a string to check it's index : ");
        char d= in.next().charAt(0);
        System.out.println("Index of "+d+" is (Very Fast frequency)"+a.indexOf(d));
        System.out.println("Index of "+d+" is (Very last frequency)"+a.lastIndexOf(d));
        System.out.println("A with out 1st and last space :"+ (a.concat(b)).trim());
        //System.out.println(a.reverse());

        
    }
    
}
