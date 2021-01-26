

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner i= new Scanner (System.in);
        int low, high, a=0,b=1,c,temp;
        System.out.println("Enter two numbers : ");
        low = i.nextInt();
        high = i.nextInt();
        
        if (low>high){
            temp=low;
            low=high;
            high=temp;
        }
        System.out.println("The Fibonacci between "+low+" and "+high+" are : ");
        while (a<=high){
            c=a+b;
            a=b;
            b=c;
            if(c>=low&&c<=high){
                System.out.print(c+" ");
            }
        }
        
    }
    
}
