

import java.util.Random;
import java.util.Scanner;

public class Random_Number {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many times you want to try ?\nAns: ");
        int n = in.nextInt();
        System.out.println("Random number (from-to) : ");
        System.out.print("From : ");
        int from = in.nextInt ();
        System.out.print("To: ");
        int to = in.nextInt();
        
        for (int i = 1; i <=n; i++) {
            
            
            System.out.println("Enter your guess : ");
            int guess = in.nextInt();
            
            Random r = new Random ();
            int rand = r.nextInt((to-from)+1)+from;
            //System.out.println(rand+"  "); 
            System.out.println("Your Guess is : "+guess+"\nThe random Number is : "+rand);
            if(guess==rand){
                System.out.println("Congratulation your guess is correct!!! ");
            }else{
                System.out.println("Sorry! Did not match\nTry again!");
            }
            
        }
        
    }
    
}
