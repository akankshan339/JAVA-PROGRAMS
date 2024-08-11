import java.io.*;
public class search
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="",ser;
        char ch;
        int i,l,frq=0;
        System.out.println("Enter the string:\n");
        st=in.readLine();
        l=st.length();
        System.out.println("Enter the word u want to search:\n");
        ser=in.readLine();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            wd=wd+ch;
            else
            if(wd.equals(ser))
            {
            frq++;
            wd="";
            }}
            System.out.println("frequency of searched word is:"+frq);
        }}