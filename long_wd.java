//find the longest word in the string and its length
import java.io.*;
public class long_wd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="",longwd="";
        int i,l,lenwd=0,len;
        char ch;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        st=st.toLowerCase();
        l=st.length();
        for(i=0;i<l;i++)
        {
           ch=st.charAt(i);
           if(ch!=' ')
           {
               wd=wd+ch;
           }
          else
          {
        len=wd.length();
        //lenwd=len;
        if(len>lenwd)
        {
        lenwd=len;
        longwd=wd;
    }
        wd="";
        len=0;
    }
     }
        System.out.println("longest word in the sentence is :"+longwd);
        System.out.println("length of that word is :"+lenwd);
        }}
        
        
        