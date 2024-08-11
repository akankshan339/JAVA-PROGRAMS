import java.util.*;
public class magic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter a num");
        n=in.nextInt();
        while(n>0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10; 
        
        
            if(sum>9)
            n=sum;
            else
            break;
            
        }
        if(sum==1)
        System.out.println("Magic num");
        else
        System.out.println("Not a magic num");
    }
}