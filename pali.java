import java.util.*;
public class pali
{
    String word(String w)
    {
        int len;
        char ch;
        String rstr="";
        len=w.length();
        for(int i=0;i<len;i++)
        {
            ch=w.charAt(i);
            rstr=ch+rstr;
        }
        if(w.equals(rstr))
        return rstr;
        else
        return "false";
        }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st,rstr;
        System.out.println("Enter a string ");
        st=in.next();
        pali ob=new pali();
        rstr=ob.word(st);
        System.out.println(rstr);
    }
}