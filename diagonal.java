import java.util.*;
public class diagonal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[][]=new int[3][3];int i,j,s=0,s2=0;
        System.out.println("Enter array elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                ar[i][j]=in.nextInt();
            }
        }
         for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               System.out.print(ar[i][j]+" , ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                s=s+ar[i][j];
                if((i+j)==2-1)
                s2=s2+ar[i][j];
            }
        }
        System.out.println("sum of left diagonal="+s);  
        System.out.println("sum of right diagonal="+s2);  
        int d=s/s2;
        System.out.println("Answer="+d);      
    }
}
