package numberconv;
import java.util.Scanner;
public class Number_Sytem_Calculator {
   
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many times?\nAns: ");
        int n = in.nextInt();
        in.nextLine();
        
        for(int i =1;i<=n;i++){
            
            System.out.println("Enter :\n\"BD\" for Bin-Dec\n\"BO\" for Bin-Oct\n\"BH\" for Bin-Hex\n\"DB\" for Dec-Bin\n\"DH\" for Dec-Hex\n\"DO\" for Dec-Oct\n\"OB\" for Oct-Bin\n\"OD\" for Oct-Dec\n\"OH\" for Oct-Hex\n\"HB\" for Hex-Bin\n\"HD\" for Hex-Dec\n\"HO\" for Hex-Oct..");
            
            String ch = in.nextLine();
            int dec;
            String c;
       
            switch(ch){

                case "BD":  System.out.println("Enter the binary number : ");
                            //in.nextLine();
                            c=in.nextLine();
                            System.out.println("The Decimal of "+c+" is " +Integer.parseInt(c,2));
                            break;

                case "BO":  System.out.println("Enter the binary number : ");
                            //in.nextLine();
                            c=in.nextLine();
                            System.out.println("The Octal of "+c+" is "+Integer.toOctalString(Integer.parseInt(c,2)));
                            break;


                case "BH":  System.out.println("Enter the binary number : ");
                            c=in.nextLine();
                            System.out.println("The Hexadecimal of "+c+" is "+Integer.toHexString(Integer.parseInt(c,2)));
                            break;

                case "DB":  System.out.println("Enter the Decimal number : ");
                            int cd =in.nextInt();
                            System.out.println("The Binary of "+cd+" is "+Integer.toBinaryString(cd));
                            in.nextLine();
                            break;
                            
                case "DO":  System.out.println("Enter the Decimal number : ");
                            cd =in.nextInt();
                            System.out.println("The Octal of "+cd+" is "+Integer.toOctalString(cd));
                            in.nextLine();
                            break;
                case "DH":  System.out.println("Enter the Decimal number : ");
                            cd=in.nextInt();
                            System.out.println("The Hexadecimal of "+cd+" is "+Integer.toHexString(cd));
                            in.nextLine();
                            break;

                case "OB":  System.out.println("Enter a Octal number : ");
                            c=in.nextLine();
                            System.out.println("The Binary of "+c+" is "+Integer.toBinaryString(Integer.parseInt(c,8)));
                            break;

                case "OD":  System.out.println("Enter the Octal number : ");
                            c=in.nextLine();
                            System.out.println("The Decimal of "+c+" is " +Integer.parseInt(c,8));
                            break;
                case "OH":  System.out.println("Enter the Octal number : ");
                            c=in.nextLine();
                            System.out.println("The Hexadecimal of "+c+" is "+Integer.toHexString(Integer.parseInt(c,8)));
                            break;

                case "HO":  System.out.println("Enter the Hexadecimal number : ");
                            c=in.nextLine();
                            System.out.println("The Octal of "+c+" is "+Integer.toOctalString(Integer.parseInt(c,16)));
                            break;

                case "HD":  System.out.println("Enter the HexaDecimal number : ");
                            c=in.nextLine();
                            System.out.println("The Decimal of "+c+" is " +Integer.parseInt(c,16));
                            break;
                case "HB":  System.out.println("Enter a Hexadecimal number : ");
                            c=in.nextLine();
                            System.out.println("The Binary of "+c+" is "+Integer.toBinaryString(Integer.parseInt(c,16)));
                            break;

            }
        }
    }
}
