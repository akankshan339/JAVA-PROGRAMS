// 0,1,2,3,6,11,........  it is a tribonacci series
//import java.io.*;
public class series4
{
    public static void main(String args[])
    {
        int a=0,b=1,c=2,i,term=0,d=10,sum;
        System.out.print(a+","+b+","+c+",");
        for(i=0;i<5;i++)  
        {
          sum=a+b+c; 
          System.out.print(sum+",");
          a=b;
          b=c;
          c=sum;
          
        }
    }
    
}