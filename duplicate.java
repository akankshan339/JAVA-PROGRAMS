import java.io.*;
public class duplicate
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,dup="";
        int i,l,j,t=0;
        char ch1,ch2;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch1=st.charAt(i);
            for(j=0;j<dup.length();j++)
            {
            ch2=dup.charAt(j);
            if(ch1==ch2)
            t=1;
            }
            if(t==0)
            dup=dup+ch1;
        }
        System.out.println("string after removing duplicted "+dup);
    }}
        
        
        
