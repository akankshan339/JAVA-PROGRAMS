import java.util.*;
public class array2d
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ar[][]=new int[2][3];
        System.out.println("Enter elements");
        int i,j,s=0;
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
                s=s+ar[i][j];
            }
            System.out.println("Sum of row "+(i+1)+"="+s);
            s=0;
        }
    }
}