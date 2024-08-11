import java.io.*;
public class pattern2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        int i,l,j,k;
        char ch;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        l=st.length();
        for(k=0;k<l;k++)
        {
        for(i=0;i<l;i++)
        {
             for(j=0;j<i;j++)
             {
            System.out.print(' ');
        }
         ch=st.charAt(i);
        System.out.println(ch);
    }}}}
