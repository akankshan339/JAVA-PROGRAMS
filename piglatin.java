//Input : TROUBLE
//Output : OUBLETRAY
//Find the index of first vowel  obtain the substring s1 from begining till index of "1st vowel" and s2 substring from that index to last + AY
// newst=s2+s1+"AY"         newst is in piglatin form
import java.io.*;
public class piglatin
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,s1,s2,newst="";
        int i,l;
        char ch;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            break;
        }
             //i=st.indexOf(ch);
            s1=st.substring(0,i);
            s2=st.substring(i,l);
            newst=s2+s1+"AY";
        System.out.println(newst);
    }}