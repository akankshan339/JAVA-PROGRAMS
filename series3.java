// 1,11,111,1111,11111,........
//import java.io.*;
public class series3
{
    public static void main(String args[])//throws IOException
    {
        //InputStreamReader read =new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
        int i,j,term=0,d=10;
        for(i=0;i<5;i++)  //5 terms
        {
           // term=(int)Math.pow(d,i)+term;
            //OR
            term=(term*10)+1;
          System.out.print(term+",");
        }
    }
    
}