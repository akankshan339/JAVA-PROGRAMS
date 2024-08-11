import java.util.*;
public class atmo
{
   static void automorphic(int n)
    {
        int num=n,sq,c=0;
        sq=n*n;
        while(n>0)
        {
            n=n/10;
            c++;
        }
       double d=sq%Math.pow(10,c);
        if(d==num)
        System.out.println("Automorphic num");
        else
        System.out.println("Not an automorphic num");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter a num");
        n=in.nextInt();
        automorphic(n);
    }
}
