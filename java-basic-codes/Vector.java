
public class Vector {

    double x,y;
    Vector ()
    {
        
    }
    Vector (double x, double y)
    {
        this.x= x;
        this.y=y;
    }
    public void printPoints()
    {
        System.out.println("X is : "+this.x+"\nY  is : "+this.y);
    }
    
}




public class Pentagon {
    
public double findDistance(double x1,double y1, double x2, double y2)

{
	double a ;

	a = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);

	a = Math.sqrt(a);

	return a;

}

public double findAreaTriangle(double x1, double y1, double x2,double y2, double x3, double y3)
{
	double a;

	a= x1*y2 + x2*y3+ x3*y1 - x2*y1 - x3*y2 - x1*y3;
	a= .5*a;

	return a;
}
    
    
    Vector [] ar = new Vector [5];
    
    Pentagon (Vector A , Vector B , Vector C , Vector D , Vector E)
	{

		ar[0]= A;
		ar[1]= B;
		ar[2]= C;
		ar[3]= D;
		ar[4]= E;

	}
    	double findPerimeter()
	{
            double [] a= new double [5];

	a[0]=findDistance( ar[0].x , ar[0].y , ar[1].x , ar[1].y );
       	a[1]=findDistance( ar[1].x , ar[1].y , ar[2].x , ar[2].y );
       	a[2]=findDistance( ar[2].x , ar[2].y , ar[3].x , ar[3].y );
       	a[3]=findDistance( ar[3].x , ar[3].y , ar[4].x , ar[4].y );
       	a[4]=findDistance( ar[4].x , ar[4].y , ar[0].x , ar[0].y );

       	a[0] = a[0]+a[1]+a[2]+a[3]+a[4];

       	return a[0];

	}
        double findArea()
	{
	    double a;
	    a= ar[0].x*ar[1].y + ar[1].x*ar[2].y + ar[2].x*ar[3].y + ar[3].x*ar[4].y + ar[4].x*ar[0].y - ar[1].x*ar[0].y - ar[2].x*ar[1].y - ar[3].x*ar[2].y - ar[4].x*ar[3].y - ar[0].x*ar[4].y;
	    a=a*.5;
	    if(a<0)
        {
            a=a* (-1);
	    }
	    return a;
	}
        double findArea2()
	{
	    double [] a= new double [3];
        a[0] = findAreaTriangle(ar[0].x,ar[0].y,ar[2].x,ar[2].y,ar[3].x,ar[3].y);
        a[1] = findAreaTriangle(ar[0].x,ar[0].y,ar[3].x,ar[3].y,ar[4].x,ar[4].y);
        a[2] = findAreaTriangle(ar[0].x,ar[0].y,ar[1].x,ar[1].y,ar[2].x,ar[2].y);

        a[0] = a[0]+a[1]+a[2];

        if(a[0]<0)
        {
            a[0]=a[0]*(-1);
        }

        return a[0];

	}
        void printInfo()
	{
	    for (int i = 0 ; i < 5 ; i++ )
        {
            System.out.printf("(%.1f , %.1f)\t",ar[i].x,ar[i].y);
        }
	}

    
}



import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] ar = new double [10];
        System.out.printf("Enter Co- ordinates for A point \nAx: ");
        ar[0]= in.nextInt();
        System.out.printf("Ay: ");
        ar[1]= in.nextInt();
        System.out.printf("Enter Co- ordinates for A point \nBx: ");
        ar[2]= in.nextInt();
        System.out.printf("By: ");
        ar[3]= in.nextInt();
        System.out.printf("Enter Co- ordinates for A point \nCx: ");
        ar[4]= in.nextInt();
        System.out.printf("Cy: ");
        ar[5]= in.nextInt();
        System.out.printf("Enter Co- ordinates for A point \nDx: ");
        ar[6]= in.nextInt();
        System.out.printf("Dy: ");
        ar[7]= in.nextInt();
        System.out.printf("Enter Co- ordinates for A point \nEx: ");
        ar[9]= in.nextInt();
        System.out.printf("Ey: ");
        ar[9]= in.nextInt();
        
        
        
        Vector A= new Vector (ar[0],ar[1]);
        Vector B= new Vector (ar[2],ar[3]);
        Vector C= new Vector (ar[4],ar[5]);
        Vector D= new Vector (ar[6],ar[7]);
        Vector E= new Vector (ar[8],ar[9]);
        
        Pentagon p = new Pentagon( A, B, C, D, E);
        System.out.println("Five points of pentagon : \n");
        p.printInfo();
        System.out.printf("\n\n\n1st point ");
        A.printPoints();
        System.out.printf("\n\n2nd point ");
        B.printPoints();

        System.out.printf("\n\n3rd point ");
        C.printPoints();

        System.out.printf("\n\n4th point ");
        D.printPoints();

        System.out.printf("\n\n5th point ");
        E.printPoints();
        double a=p.findPerimeter();
        System.out.printf("\n\n\nThe perimeter of pentagon object : %.3f\n",a);

        double area1=p.findArea();
        System.out.printf("\nThe area of pentagon : %.3f\n\n",area1);

        double area2=p.findArea2();
        System.out.printf("The sum of area of Three triangles : %.3f\n\n",area2);
    }
}
