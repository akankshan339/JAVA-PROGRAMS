import java.util.*;
public class bubble_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[]=new int[10];
        System.out.println("Enter array elements");
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            ar[i]=in.nextInt();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                  temp=ar[j];
                  ar[j]=ar[j+1];
                  ar[j+1]=temp;
                }
            }
    }
    for(i=0;i<10;i++)
        {
            System.out.print(ar[i]+" ");
        }
}
}