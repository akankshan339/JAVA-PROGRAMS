import java.util.*;
public class loop
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,k=1;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}