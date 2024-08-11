import java.io.*;
public class caseconvrtSt
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,newst="";
        int len,i;
        char ch;
        System.out.println("Enter the string: ");
        st=in.readLine();
        len=st.length();
        for(i=0;i<len;i++)
        {
            ch=st.charAt(i);
            if((ch>='A')&&(ch<='Z'))
            {
            ch=Character.toLowerCase(ch);
            newst=newst+ch;
        }
        else if((ch>='a')&&(ch<='z'))
        {
        Character.toUpperCase(ch);
        newst=newst+ch;
    }
    else
    newst=newst+ch;
}
    System.out.println("updated string is:"+newst);
}
}


   