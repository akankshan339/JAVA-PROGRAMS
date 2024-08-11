import java.util.*;
public class binary_search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[]=new int[10];
        System.out.println("Enter array elements");
        int i,mid,min=0,max=9,p=1;
        for(i=0;i<10;i++)
        {
            ar[i]=in.nextInt();
        }
        System.out.println("Enter number to be searched");
        for(i=1;i<5;i++)
        {
        int n=in.nextInt();
        while(min<=max)
        {
           mid=(min+max)/2;
            if(n==ar[mid])
            {
            p=mid;
            break;
        }
        else if(n<ar[mid])
        max=mid-1;
        else 
        min=mid+1;
        }
    
        if(p!=1)
        System.out.println("number found at"+(p+1));
        else 
        System.out.println("number not found");
        p=1;min=0;max=9;
    }
}
}