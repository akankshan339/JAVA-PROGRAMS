/*
1 1 2 3 4 5 
1 1 2 3 4 5 
1 1 1 3 4 5 
1 1 1 1 4 5 
1 1 1 1 1 5   */

public class pat8
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
           for(j=1;j<=i;j++)
        {
            System.out.print("1"+" ");
         
        } 
        for(int k=i;k<=5;k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
        }
    }
}