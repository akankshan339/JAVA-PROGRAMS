import java.util.*;
public class area
{
    static double area(int b,int h)
    {
        int ar=b*h;
        return ar;
    }
   static double area(double d1,double d2)
    {
        double ar2=d1*d2;
        return ar2;
    }
    static double area(int a,int b,double h)
    {
       double ar3=1/2*(a+b)*h;
        return ar3;
    }
   public static void main(String args[])
    {
        //Scanner in=new Scanner(System.in);
       // int b,a;
        //double h1,d1,d2;
       // System.out.println("Enter base,height,diagonal 1,diagonal 2,a,b");
        //a=in.nextInt();
        //b=in.nextInt();
        //d1=in.nextDouble();
        //d2=in.nextDouble();
        //h1=in.nextInt();
        //double h=h1;
        System.out.println(area(5,9));
        System.out.println(area(4.0,7.5));
        System.out.println(area(4,6,5.5));
    }
    
}