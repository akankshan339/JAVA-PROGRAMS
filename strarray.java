//store 20 name & there telephone no in 2 single 1D array enter a name & search it in list if yes then display the name &its telphone no
// else display name not found using linear serch
import java.io.*;
public class strarray
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st[]=new String[20];
        long no[]=new long [20];
        String name;
        int i,j,t=0,a=0;
       // System.out.println("NAME"+"\t"+"Telephone No");
        for(i=0;i<5;i++)
        {
        System.out.println("Enter the names of student and telephone no:\n");
        st[i]=in.readLine();
        no[i]=Long.parseLong(in.readLine());
    }
      System.out.println("Enter the names of student u want search:\n");
         name=in.readLine();
        for(i=0;i<5;i++)
        {
            if(st[i].equals(name))
            {
            t=1;
            //a=i;
            break;
        }}
        if(t==1)
         System.out.println("name found is "+st[i]+" telephone no is "+no[i]);
         else
          System.out.println("name not found");
        }}
        