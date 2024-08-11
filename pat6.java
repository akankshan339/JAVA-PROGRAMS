/*1 2 3 4 5 5 4 3 2 1
  1 2 3 4     4 3 2 1
  1 2 3         3 2 1
  1 2             2 1
  1                 1
 */
import java.io.*;
public class pat6
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
    int i,j,n,k,l;
    System.out.println("Enter the value of n :");
    n=Integer.parseInt(in.readLine());
    for(i=n;i>=1;i--)
    {
        for(l=1;l<=i;l++)
        {
            System.out.print(l+" ");
        }
        for(k=i;k<n;k++)
        {
            System.out.print("    "); //4 spaces
        } 
         for(j=i;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        
        System.out.println();
}
}
}