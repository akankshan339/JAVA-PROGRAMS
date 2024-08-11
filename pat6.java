/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 */
public class pat6
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
}