//remove vowels from string
import java.io.*;
public class remvow
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,vow="";
        int i,l;
        char ch;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        st=st.toLowerCase();
        l=st.length();
        for(i=0;i<l;i++)
        {
           ch=st.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           vow=vow+ch;
        }
        System.out.println("string containing vowels :"+vow);
    }
}