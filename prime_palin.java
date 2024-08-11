import java.util.*;
public class prime_palin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,c=0,d,r=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        int num=n;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>2)
        System.out.println("not a prime");
        else
        {
        while(n!=0)
        {
         d=n%10;
         r=r*10+d;
         n=n/10;
        }
        if(r==num)
        System.out.println("prime palindrome");
        else
        System.out.println("prime no but not palindrome");
    }
    }
}