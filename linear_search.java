import java.util.*;
public class linear_search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[]=new int[10];
        int p=0,i,a=0;
        System.out.println("Enter array elements");
        for(i=0;i<10;i++)
        {
            ar[i]=in.nextInt();
        }
        System.out.println("Enter number to be searched");
        int n=in.nextInt();
        for(i=0;i<10;i++)
        {
            if(ar[i]==n)
            {
            p=1;
            a=i;
        }
        }
        if(p==1)
        System.out.println("number found at"+a+"no="+n);
        else 
        System.out.println("Number not found");
    }
}