//2 nos are coprime if there hcf is 1
import java .io.*;
public class coprime
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n1,n2,i,hcf=1;
        System.out.println("enter 2 nos :");
        n1=Integer.parseInt(in.readLine());
        n2=Integer.parseInt(in.readLine());
        for(i=2;i<(n1+n2);i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                hcf=i;
                
            }
        }
        if(hcf==1)
        System.out.println("co prime nos and hcf is: "+hcf);
        else
        System.out.println("not co prime nos and hcf is :"+hcf);
        
    }
}