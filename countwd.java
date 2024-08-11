//count no of letters and words in a string
//2nd method count no of spaces add 1 to it which is equal to no of words and length-no of spaces which is equals to no of letters in string
import java.io.*;
public class countwd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="";
        //st=st+" ";
        int i,l,cuntlet=0,cuntwds=0;
        char ch;
        System.out.println("Enter the String :\n");
        st=in.readLine();
        st=st+" ";
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            {
                wd=wd+ch;
                cuntlet++;
                }
            else
            {
           cuntwds++;
            wd="";
            }
        }
          //cuntwds++;
            //wd="";
            System.out.println("no of words :\n"+cuntwds);
            System.out.println("no of letters:\n"+cuntlet);
            }
}