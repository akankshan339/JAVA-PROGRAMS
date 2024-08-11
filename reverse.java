import java.io.*;
public class reverse
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,rev="",wd="";
        char ch;
        int i,l;
        System.out.println("Enter the string:\n");
        st=in.readLine();
        l=st.length();
        st=st+' ';
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            wd=ch+wd;
        else
        rev=rev+' '+wd;
        wd="";
    }
        System.out.println("Reversed string is :\n"+rev);
    }
}
        