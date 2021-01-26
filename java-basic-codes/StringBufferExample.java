
import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer ();
        
        System.out.println("Enter a string buffer :");
        sb.append(in.nextLine());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println("Delete from  index1 to index2");
        sb.delete((in.nextInt()), (in.nextInt()) );
        System.out.println(sb);
        sb.setLength(3);
        System.out.println(sb);
    }
}
