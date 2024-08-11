//1,-3,5,-7,9,..........
//import java.io.*;
public class series1
{
    public static void main(String args[])//throws IOException
    {
       // InputStreamReader read =new InputStreamReader(System.in); // no need
        //BufferedReader in=new BufferedReader(read);
        int i,sign=1;
        for(i=1;i<20;i=i+2)
        {
          System.out.print(sign*i+",");
          sign=-sign;
        }
    }
    
}