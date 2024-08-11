//    C O M P U T E R
//    O             E
//    M             T 
//    P             U
//    U             P
//    T             M
//    E             O
//    R             C
//    R E T U P M O C
import java.io.*;
public class sqpatt3
{
    public static void main(String args[])throws IOException
    {
        //InputStreamReader read=new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
       String st="computer";
        StringBuffer st1=new StringBuffer(st);
        String rev="";
        int i,l;
        char ch1,ch2;
         l=st.length();
        System.out.println(st);
        for(i=0;i<l;i++)
        {
        ch1=st.charAt(i);
        ch2=st.charAt(l-1-i);
        System.out.println(ch1+"      "+ch2);
    }
    System.out.println(st1.reverse());
}}