import java.util.*;
public class large_column
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[][]=new int[2][3];int i,j,max=0,max2=0;
        System.out.println("Enter array elements");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                ar[i][j]=in.nextInt();
            }
        }
         for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
               System.out.print(ar[i][j]+" , ");
            }
            System.out.println();
        }
        for(i=0;i<2;i++)
        {
            
            for(j=0;j<3;j++)
            {
                if(ar[i][j]>max)
                  max=ar[i][j];                
            }
            System.out.println("largest no in row"+(i+1)+"="+max);
            max=0;
            
        }
        for(j=0;j<3;j++)
        {
            for(i=0;i<2;i++)
            {
             if(ar[i][j]>max2)
             max2=ar[i][j];
            }
            System.out.println("largest no in column"+(j+1)+"="+max2);
            max2=0;
        }
    }
}