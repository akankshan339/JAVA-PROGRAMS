import java.util.*;
public class pronic
{
    static boolean pronic(int n)
    {
        boolean b;
        for(int i=1;i<=n;i++)
        {
           if(n==i*(i+1))
           break;
        }
          b=true;
          return b;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter a num");
        num=in.nextInt();
        boolean a=pronic(num);
        System.out.println(a);
        
    }
    
}