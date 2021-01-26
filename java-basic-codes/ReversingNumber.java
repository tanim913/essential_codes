


import java.util.Scanner;

public class ReversingNumber {
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
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("\nThe reverse number of "+n+" is : "+sum);
    }
    
}
