
import java.util.Scanner;
public class PrimebetweenIntervals {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int low , high, i, flag,temp;
        System.out.println("Enter two numbers : ");
        low = sc.nextInt();
        high = sc.nextInt();
        if (low > high) {
            temp = low;
            low = high;
            high = temp;
        }
        System.out.println("The prime numbers between "+low+" and "+high+" are : ");
        while (low<=high){
            flag=0;
            for (i = 2;  i<= low/2; i++) {
                if(low%i==0){
                    flag=1;
                    break;
                }
            }
            //
            if(flag==0)
                System.out.print(low+" ");
            low++;
        }
    }
    
}
