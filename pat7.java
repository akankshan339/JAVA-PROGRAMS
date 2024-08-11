/*
1 
3 1 
5 3 1 
7 5 3 1 
9 7 5 3 1   */
import java.io.*;
public class pat7
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,i,j;
        System.out.println("enter the value of n");
        n=Integer.parseInt(in.readLine());
        for(i=1;i<=n;i=i+2)
        {
         for(j=i;j>=1;j=j-2)
         {
             System.out.print(j+" ");
         }
         System.out.println();
        }
        
        
        
    }
}