//print ascii value of each chracter
import java.io.*;
public class ascii
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        char ch;
        int i,l;
        System.out.println("Enter the string :");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            System.out.println(ch+"="+(int)ch);
        }
        
    }
}