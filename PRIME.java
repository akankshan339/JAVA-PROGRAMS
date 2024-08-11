
import java.util.*;
public class PRIME
{
   static void prime(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c<=2)
            System.out.println("Prime num = "+i);
        }
        
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter the value of num");
        num=in.nextInt();
       prime(num); 
        
    }
}