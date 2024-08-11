/*
 1
 2  3
 4  5  6
 7  8  9  10
11 12 13  14  15 */
import java.io.*;
public class pat1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
    int k=1,i,j,n;
    System.out.println("Enter the value of n :");
    n=Integer.parseInt(in.readLine());
    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
    k=15;
    for(i=0;i<n;i++)
    {
        for(j=n;j>=i;j--)
        {
          System.out.print(k+" ");
          k--;
        }
    }
}
}