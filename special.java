import java.io.*;
public class special
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        char ch;
        int i,l,u=0,d=0,s=0;
        System.out.println("Enter the string:\n");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if((ch>='A')&&(ch<='Z'))
            u++;
            else if((ch>='a')&&(ch<='z'))
            l++;
            else if((ch>='0')&&(ch<='9'))
            d++;
            else
            s++;
        }
        System.out.println("no of upper case alphabets :"+u);
        System.out.println("no of lower case alphabets :"+l);
        System.out.println("no of digits :"+d);
        System.out.println("no of special characters :"+s);
    }}
            
            
        
        