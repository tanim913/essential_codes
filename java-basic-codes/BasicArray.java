

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int i,sum=0,size,max, min ;
        System.out.println("Enter the array size : ");
        size=in.nextInt();
        int[] ar = new int [size];
        System.out.println("Enter "+size+" numbers :  ");
        for (i=0;i<size;i++){
            ar[i]=in.nextInt();
        }
        max=ar[0];
        min=ar[0];
        System.out.println("The "+size+" number are : ");
        for (i=0;i<size;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("\nThe sum of "+size+" numbers: ");
        for (i=0;i<size;i++){
            sum=sum+ar[i];
        }
        for (i=1;i<size;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        
        System.out.println(sum);
        System.out.println("The average is : "+ (float)sum/size+"\nThe maximum Element is "+max+"\nThe minimum Element is : "+min);
        
    }
    
}
