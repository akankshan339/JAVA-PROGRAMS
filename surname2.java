//SAMPLE INPUT : Mohandas Karamchand Gandhi
//SAMPLE INPUT : Gandhi Mohandas Karamchand 
import java.io.*;
public class surname2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,newst="",sur="",ststr="";
        int i,l,ind;
        char ch,chr;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        //st=st.toUpperCase();
        l=st.length();
        ind=st.lastIndexOf(' ');
        sur=st.substring(ind);
        ststr=st.substring(0,ind);
       newst=sur+' '+ststr;
        System.out.println("surname followed by name :"+newst);
    }}
       