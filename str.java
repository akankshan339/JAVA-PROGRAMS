import java.io.*;
public class str
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,subst;
        char ch;
        int i,l;
        System.out.println("Enter the string:\n");
        st=in.readLine();
       // l=st.length();
     //System.out.println("length of string is:\n"+l);
       System.out.println("enter the index whose character is to find:\n");
       i=Integer.parseInt(in.readLine());
       ch=st.charAt(i);
       System.out.println("character at +i+is:"+ch);
       
        System.out.println("enter the character whose index is to find:\n");
        i=st.indexOf(ch);
        System.out.println("index of+ch+is :"+i);
        subst=st.substring(5,9);
        System.out.println("extracted string is:\n"+subst);
    }
}