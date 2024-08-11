import java.io.*;
public class number
{
   public static void main(String args[])throws IOException
   {
       int a,b,sum=0;
      InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("enter the value of a and b\n");
       a=Integer.parseInt(in.readLine());
      
      b=Integer.parseInt(in.readLine());
 sum=a+b;
       //System.out.println("hello world");
       System.out.println("sum is "+sum);
   }
   
}
    


    
    

