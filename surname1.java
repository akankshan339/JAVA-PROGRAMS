import java.io.*;
public class surname1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,sur="",newst="",mid="";
        char ch;
        int i,l,p;
        System.out.println("Enter the string:\n");
        st=in.readLine();
        l=st.length();
        p=st.lastIndexOf(" ");
        sur=st.substring(p);
        st=" "+st;
        
        for(i=0;i<p;i++)
        {
            ch=st.charAt(i);
            if(ch==' ')
            mid=mid+st.charAt(i+1)+'.';
        }
           newst=mid+sur;
           System.out.println("Initials along with surname :\n"+newst);
            
            
        }}