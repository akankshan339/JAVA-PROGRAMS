//      B L U E J
//      L U E J B
//      U E J B L
//      E J B L U
//      J B L U E
import java.io.*;
public class pattern4
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        int i,l;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
           System.out.print(st.substring(i,l));
        System.out.println(st.substring(0,i));
        }
    }}           