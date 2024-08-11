import java.io.*;
public class series9
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,sum=0,s=0,
        a=Integer.parseInt(in.readLine());
       for(i=1;i<=3;i++)
        {
       s=s+(a+i);
       sum=sum+s;
    }
     System.out.println(sum);
    }}