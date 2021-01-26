


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner i= new Scanner (System.in);
        int n, temp, sum=0, r;
        System.out.println("Enter a number : ");
        n=i.nextInt();
        temp=n;
        System.out.print("The digits are : ");
        while(temp!=0){
            r=temp%10;
            System.out.print(r+" ");
            sum+=r;
            temp=temp/10;
            
        }
        System.out.println("\nThe sum of the digits of "+n+" is: "+sum);
        
    }
}
