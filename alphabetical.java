//arrange the string in alphabetical order
// input : akanksha
// output : aaahkkns
import java.io.*;
public class alphabetical
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="";
        int i,l,j;
        char ch;
        System.out.println("Enter the word :\n");
        st=in.readLine();
        l=st.length();
        for(i=65;i<=90;i++)
        {
        for(j=0;j<l;j++)
        {
            ch=st.charAt(j);
            if((ch==(char)i)||ch==(char)(i+32))
           wd=wd+ch;
           //System.out.println(ch);
        }}
       System.out.println("string in alphabetical order "+wd);
    }}
        