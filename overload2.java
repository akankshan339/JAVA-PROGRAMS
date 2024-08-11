import java.util.*;
public class overload2
{
    static int series(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(int)Math.pow(i,i);
        }
        return sum;
    }
    static void series(int x,int n)
    {
        int sum=0;
       for(int i=1;i<=n;i=i+2)
       {
           sum=sum+(x-i);
           System.out.println("sum is :"+sum);
       }
    }
    static double series(double n)
    {
      for(int i=1;i<=n;i++)
      {
          System.out.print(i*i);
      }
      return 0;
    }
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int n,x,sum=0;
     double m;
     System.out.println("Enter value of x ,n and m");
     x=in.nextInt();
     n=in.nextInt();
     m=in.nextInt();
   // overload2 ob=new overload2();
    // sum=ob.series(n);
     //ob.series(x,n);
     //ob.series(m);
    sum=series(n);
     series(x,n);
     series(m);
     System.out.println("the sum is :"+sum);
      }
    }
