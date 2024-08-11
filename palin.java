//reverse no btw m and n
import java.util.*;
public class palin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the value of m,n");
        m=in.nextInt();
        n=in.nextInt();
        for(int i=m;i<=n;i++)
        {
            int no=i,rev=0;
            while(no!=0)
            {
                int d=no%10;
                rev=rev*10+d;
                no=no/10;
            }
        if(rev==i)
        System.out.println("Reverse no="+rev);
        
    }
    }
}