// accept a string in lower case convert the first letter in upper case of each word in the string
// Input : my name is akanksha negi
// Output : My Name Is Akanksha Negi
import java.io.*;
public class conv
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,newst="";
        int i,l;
        char ch,ch1;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        st=" "+st;
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch==' ')
            {
            ch1=st.charAt(i+1);
            ch1=Character.toUpperCase(ch1);
            newst=newst+' '+ch1;
            i=i+1;
        }
        else
        newst=newst+ch;
    }
        System.out.println(newst);
    }}