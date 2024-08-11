//store 10 city  name in single 1D array & arrange them in decending order by using "selection sort" & display them
import java.io.*;
public class strdecending
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String ct[]=new String[10];
        String temp="";
        int i,j,t=0,a=0,min;
       System.out.println("Enter the names of cities:\n");
        for(i=0;i<5;i++)
        {
        ct[i]=in.readLine();
    }
    for(i=0;i<5;i++)
        {
            min=i;
            for(j=i+1;j<5;j++)
            {
               if(ct[j].compareTo(ct[min])>0)
               
                   min=j;
                }
               temp=ct[i];
               ct[i]=ct[min];
               ct[min]=temp;
            }
        System.out.println("cities in decending order are:\n");
                 for(i=0;i<5;i++)
        {
        System.out.println(ct[i]);
    }}}
         
        
            