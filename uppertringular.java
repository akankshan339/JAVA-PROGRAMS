import java.io.*;
public class uppertringular
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int mat[][]=new int[4][4],i,j,flag=0;
       /*System.out.println("enter no of rows and column of matrix: ");
        m=Integer.parseInt(in.readLine());
        n=Integer.parseInt(in.readline());*/
        System.out.println("enter the array elements: ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                mat[i][j]=Integer.parseInt(in.readLine());
                
            }
        }
        System.out.println("THE MATRIX IS :");
         for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();}
             for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(i>j)
             {
                 if(mat[i][j]==0)
                 flag=1;
                }}}
                
                    if(flag==1)
                    System.out.println("UPPER TRIANGULAR MATRIX: ");
                    else
                    System.out.println(" NOT UPPER TRIANGULAR MATRIX: ");
                }}
                    
                
        
        
                
        
        
    
