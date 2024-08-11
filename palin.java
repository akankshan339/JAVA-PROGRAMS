//print the palindrome word from the string
//sample input : my mom and dad are coming in noon
//sample output: mom  dad noon
//sample output :no of palindromic words are :3
//string tokenizer to break word
import java.io.*;
public class palin
{
    public static void main(String args[])throws IOException
    {
       InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,pal="",rev="";
        char ch,chr;
        int i,l,count=0;
        System.out.println("Enter the string :");
        st=in.readLine();
        st=st+' ';
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            {
                pal=pal+ch;
                rev=ch+rev;
            }
            else
            {
          if(rev.equals(pal))
          {
            count++;  
          System.out.println("palindrome words in string are :"+pal);
        }
            pal="";
            rev="";
    }
        }
         System.out.println("no of palindrome words in string are :"+count);
        }}