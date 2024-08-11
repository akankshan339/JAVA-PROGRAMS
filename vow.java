//count no of vowels
import java.io.*;
public class vow
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        char ch;
        int i,l,v=0;
        System.out.println("Enter the string:\n");
        st=in.readLine();
        st=st.toLowerCase();
        l=st.length();
       for(i=0;i<l;i++)                  //COUNT NO OF VOWELS
        {
            ch=st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v++;
        }
        System.out.println("no of vowels are :"+v);
        /* for(i=0;i<l;i++)                     //REPLACE 
        {
            ch=st.charAt(i);
            if(ch=='s')
               ch='*';
               System.out.print(ch);
    }*/

System.out.println();
}}
        