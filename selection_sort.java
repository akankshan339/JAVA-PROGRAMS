import java.util.*;
public class selection_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[]=new int[10];
        System.out.println("Enter array elements");
        int i,j,min,minpos,temp;
        for(i=0;i<10;i++)
        {
            ar[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            min=ar[i];
            minpos=i;
            for(j=i+1;j<10;j++)
            {
                if(ar[j]>min)
                {
                    min=ar[j];
                    minpos=j;
                }
            }
            temp=ar[minpos];
            ar[minpos]=ar[i];
            ar[i]=temp;
        }
        for(i=0;i<10;i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}