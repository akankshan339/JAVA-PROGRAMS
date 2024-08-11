/* 1 2 3 4 5
   2 2 3 4 5
   3 3 3 4 5
   4 4 4 4 5
   5 5 5 5 5  */
import java.io.*;
public class pat4
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
    int i,j,n,k;
    System.out.println("Enter the value of n :");
    n=Integer.parseInt(in.readLine());
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
         for(k=i+1;k<=n;k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
}