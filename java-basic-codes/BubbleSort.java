import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Array size : ");
        
        int size = in.nextInt();
        
        int des=1,asc=1,i;
        
        int[] ar = new int [size];
        
        System.out.println("Enter array element : ");
        for ( i = 0; i < size; i++) {
            ar[i]= in.nextInt();
        }
        System.out.println("The list : ");
        for (i = 0; i < size; i++) {
            System.out.print(ar[i]+" ");
        }
        for (i = 0; i < size-1; i++) {
            if (ar[i]<ar[i+1]){
                des=0;
                break;
            }
        }
        for (i = 0; i < size-1; i++) {
            if (ar[i]>ar[i+1]){
                asc=0;
                break;
            }
        }
        if(des==1)System.out.println("\nGiven List Sorted in Descending order !");
        
        else if (asc==1)System.out.println("\nGiven list Sorted in Ascending order !");
        
        else{
            System.out.println("\nSorted in Asceiding order : ");
            while (true){
                int swap = 0;
                for ( i=0;i<size-1;i++){
                    if (ar[i]>ar[i+1]){
                        int temp = ar[i+1];
                        ar[i+1]=ar[i];
                        ar[i]=temp;
                        swap =1;
                    }
                }
                if (swap==0) {
                    break;
                }
            }

            for ( i = 0; i < size; i++) {
                System.out.print(ar[i]+" ");
            }
            System.out.println("\nSorted in Desceiding order : ");
            while (true){
                int swap = 0;
                for ( i=0;i<size-1;i++){
                    if (ar[i]<ar[i+1]){
                        int temp = ar[i+1];
                        ar[i+1]=ar[i];
                        ar[i]=temp;
                        swap =1;
                    }
                }
                if (swap==0) {
                    break;
                }
            }

            for ( i = 0; i < size; i++) {
                System.out.print(ar[i]+" ");
            }
            System.out.println("");

        }
    }
}
