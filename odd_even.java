import java.util.*;
public class odd_even
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size;
        System.out.println("Enter size");
        size=in.nextInt();
        int ar[]=new int[size];
        int i,o=0,e=0,k=0,l=0;
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            ar[i]=in.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(ar[i]%2==0)
            e++;
            else
            o++;
        }
        System.out.println("even="+e);
        System.out.println("odd="+o);
        int E[]=new int[e];
        int O[]=new int[o];
        for(i=0;i<size;i++)
        {
            if(ar[i]%2==0)
            {
            E[k]=ar[i];
        k++;
        }
            else
            {
            O[l]=ar[i];
        l++;
        }
        }
        System.out.print("Even");
        for(i=0;i<e;i++)
        {
            System.out.print(E[i]+",");
        }
        System.out.print("odd");
        for(i=0;i<o;i++)
        {
            System.out.print(O[i]+",");
        }
    }
}
            
            
    
