//SAMPLE INPUT : MISS AKANKSHA NEGI
//SAMPLE OUTPUT :M.A.N
import java.io.*;
public class nam_initial
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,newst="";
        int i,l;
        char ch,chr;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        st=' '+st;
        st=st.toUpperCase();
        l=st.length();
        for(i=0;i<l;i++)
        {
           ch=st.charAt(i);
           if(ch==' ')
           {
           chr=st.charAt(i+1);
           newst=newst+chr+'.';
        }}
        System.out.println("name with initials :"+newst);
    }}
        
           
           
           