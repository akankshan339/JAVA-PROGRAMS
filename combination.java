// enter word and print all the combination of word formed by the word
// Sample input TOP
// Smple input  TOP TPO POT PTO OPT OTP
import java.io.*;
public class combination
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String st;
        int i,l,j,k;
        System.out.println("Enter the word in upper case\n");
        st=in.readLine();
        l=st.length();
        System.out.println("All possible combination of word\n");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
            for(k=0;k<l;k++)
            {
                if((i!=j)&&(j!=k)&&(k!=i))
                System.out.print(st.charAt(i)+""+st.charAt(j)+""+st.charAt(k));
                }
                System.out.println();
        }
    }
}}
