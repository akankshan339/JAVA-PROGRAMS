/*
@ @ @ @ @ @ @ @ 
 @           @ 
  @         @ 
   @       @ 
    @     @ 
     @   @ 
      @ @ 
       @ 
      @ @ 
     @   @ 
    @     @ 
   @       @ 
  @         @ 
 @           @ 
@ @ @ @ @ @ @ @ */

import java.io.*;
public class sndclok
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j,row;
        System.out.println("Enter the no of rows :");
        row=Integer.parseInt(in.readLine());
        for(i=1;i<=row;i++)
        {
            //for printing space in front of @
           for(j=1;j<i;j++)
        {
            System.out.print(" "); 
         
        } 
        
        for(int k=i;k<=row;k++)
        {
            if(i==1||k==i||k==row)  //i=1 for printing the 1st row of @ 
                                    //k=i for printing strating @ of each row
                                    //k==row for printing ending @ of each row
            System.out.print("@ ");  // or  System.out.print("@"+" "); 
            else
            //for printing spaces in btw the starting and ending @
            System.out.print("  ");   //here are 2 spaces
        }
        System.out.println();
        }
        for(i=row-1;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
         for(int k=i;k<=row;k++)
        {
            if(i==1||k==i||k==row)  //i=1 for printing the 1st row of @ 
                                    //k=i for printing strating @ of each row                   
                                    //k==row for printing ending @ of each row
            System.out.print("@ ");  // or  System.out.print("@"+" "); 
            else
            //for printing spaces in btw the starting and ending @
            System.out.print("  ");   //here are 2 spaces
        }
        System.out.println();
        }
    }
}