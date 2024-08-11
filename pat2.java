/*
1 2 3 4 5 6 7 
1 2 3 4 5 
1 2 3 
1 
*/
import java.io.*;
public class pat2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
    int i,j,n;
    System.out.println("Enter the value of n :");
    n=Integer.parseInt(in.readLine());
    for(i=n;i>=1;i=i-2)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}