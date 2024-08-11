//store 10 city  name in single 1D array & arrange them in alphabetical order or acending order by using "bubble sort" &display them
import java.io.*;
public class stracending
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String ct[]=new String[10];
        String temp="";
        int i,j,t=0,a=0;
       System.out.println("Enter the names of cities:\n");
        for(i=0;i<5;i++)
        {
       // System.out.println("Enter the names of cities:\n");
        ct[i]=in.readLine();
    }
     // System.out.println("cities in acending order are:\n");
         
        for(i=0;i<5;i++)
        {
            for(j=0;j<5-i;j++)
            {
               if(ct[j].compareTo(ct[j+1])>0)
               {
               temp=ct[j];
               ct[j]=ct[j+1];
               ct[j+1]=temp;
            }
        }}
         System.out.println("cities in acending order are:\n");
                 for(i=0;i<5;i++)
        {
        System.out.println(ct[i]);
    }}}
         
        
            