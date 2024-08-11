// enter the word and remove the repeated alphabet from it and print the updated word
// Sample input : akanksha
// Sample output : aknsh
import java.io.*;
public class remove
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="";
        int i,l,len,j;
        char ch,ch1;
        System.out.println("Enter the word :\n");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
             if(ch!=' ')
            wd=wd+ch;
            st=st.replace(ch,' ');
        }
            System.out.println(wd);
        }}
            
            
            
            