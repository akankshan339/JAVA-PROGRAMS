import java.io.*;
public class palinstr
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,newst=" ";
        int len,i;
        char ch;
        System.out.println("Enter the string :");
        st=in.readLine();
        len=st.length();
        for(i=len-1;i>=0;i--)
        {
           ch=st.charAt(i);
           newst=newst+ch;
        }
        if(st.equals(newst))
        System.out.println("palindrome:");
        else
         System.out.println("not a palindrome:");
        
        
    }
}
