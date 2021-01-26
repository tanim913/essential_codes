


import java.util.Random;

public class RandomLuck {
    public static void main(String[] args) {
        int from = 1;
        int to = 3;
        Random r = new Random ();
        int luck = r.nextInt((to-from)+1)+from;
        
        switch (luck)
        {
            case 1 : System.out.println("Brazil wins!");break;
            case 2 : System.out.println("match will draw!");break;
            case 3 : System.out.println("Brazil will eliminate!");break;
        }
 
    }
    
}
