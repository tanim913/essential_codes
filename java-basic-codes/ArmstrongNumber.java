
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
         Scanner i= new Scanner (System.in);
        int n, temp,temp1, sum=0, r,r1;
        System.out.println("Enter a number : ");
        n=i.nextInt();
        temp1=temp=n;
        System.out.print("The digits are : ");
        while(temp!=0){
            r=temp%10;
            System.out.print(r+" ");
            temp=temp/10;
        }
        System.out.print("\nThe cubic numbers of the digits : ");  
        while(temp1!=0){
            r1=temp1%10;
            System.out.print(java.lang.Math.pow(r1,3)+" ");
            sum+=java.lang.Math.pow(r1,3);
            temp1=temp1/10;
        }
        System.out.println("\nThe sum is "+sum);
            if(n==sum){
                System.out.println("The number is a armstrong number! ");
            }
            else System.out.println("The number is not the Armstrong number!");
    }
}
