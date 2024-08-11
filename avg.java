import java.util.*;
public class avg
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,s=9,l=0;
        System.out.println("Enter a num");
        n=in.nextInt();
        while(n>0)
        {
            int d=n%10;
            s=Math.min(s,d);
            l=Math.max(l,d);
            n=n/10;
        }
        System.out.println("Largest digit="+l);
        System.out.println("Smallest digit ="+s);
        int sum=s+l;
        System.out.println("Sum="+sum);
    }
}