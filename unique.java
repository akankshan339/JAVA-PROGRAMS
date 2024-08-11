//unique string is the one which non of the letters is repeated
//e.g. computer is a unique string
import java.io.*;
public class unique
{
    public static void main(String args[])throws IOException
    {
       InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="";
        char ch,chr,temp;
        int i,j,l,len,count=0;
        System.out.println("Enter the string :");
        st=in.readLine();
        st=st+' ';
        l=st.length();
        for(i=0;i<l;i++)
        {
        for(j=0;j<(l-1);j++)
        {
            ch=st.charAt(j);
           chr=st.charAt(j+1);
           if(ch>chr)
           {
               temp=ch;
               ch=chr;
               chr=temp;
               }
        }
    }
     for(i=0;i<l;i++)
     {
          ch=st.charAt(i);
          wd=wd+ch;
          len=wd.length();
          for(j=0;j<len;j++)
          {
              
          }
          
          
     }
    }
}