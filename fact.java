import java.util.*;
public class fact
{
   static  int fact(int q)
    {
        int f=1;
        for(int i=1;i<=q;i++)
        f=f*i;
        return f;
    }
    static void printNumber(int n)
    {
        int num=n;
        int sum=0,res;
        while(n!=0)
        {
            int d=n%10;
            res=fact(d);
            sum=sum+res;
            n=n/10;
        }
        if(sum==num)
        System.out.println("Special num");
        else 
        System.out.println("Not a special num");
    }
    public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int n;
    System.out.println("Enter a num");
    n=in.nextInt();
    printNumber(n);
}
}