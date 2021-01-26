
package ccalculator;

import java.util.Scanner;

public class CalculationSwitchCase {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a= in.nextInt ();
        int b= in.nextInt ();
        System.out.println("Enter choice \n1 to add\n2 to substract\n3 to multipie\n4 to devide\n");
        int choice = in.nextInt ();
        switch (choice)
        {
            case 1 : System.out.println("The sum of "+a+" and "+b+" is : "+ (a+b));
                    break;
            case 2 : System.out.println("The subtraction of "+a+" and "+b+" is : "+ (a-b));
                    break;
            case 3 : System.out.println("The multipication of "+a+" and "+b+" is : "+ (a*b));
                    break;
            case 4 :
            {
                if(b==0)
                    {
                    System.out.println("not devisible by 0");
                    } else {
                    System.out.println("The division of "+a+" and "+b+" is : "+ (a/b));
                }
            }
        }
               
    }
}
