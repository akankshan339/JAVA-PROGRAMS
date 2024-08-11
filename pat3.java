/*
5 4 3 2 1 
 4 3 2 1 
  3 2 1 
   2 1 
    1  */
import java.io.*;
public class pat3
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
    int i,j,n,k;
    System.out.println("Enter the value of n :");
    n=Integer.parseInt(in.readLine());
    for(i=n;i>=1;i--)
    {
        for(k=i;k<n;k++)
        {
            System.out.print(" ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}