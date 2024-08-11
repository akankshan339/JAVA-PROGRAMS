//replace all consonants with the previous alphabet if prv alphbet is vowel then replace it by the next alphabet other charcaters i.e 
//if ch is vowel or other character must remain same in the string
import java.io.*;
public class replace1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,wd="";
        char ch,prv,chr;
        int i,l,p,n=0;
        System.out.println("Enter the string:\n");
         st=in.readLine();
        st=st.toUpperCase();
       l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            {
            if((ch!='A')&&(ch!='E')&&(ch!='I')&&(ch!='O')&&(ch!='U'))
            {
                p=(int)ch-1;
                prv=(char)p;
              if((prv!='A')&&(prv!='E')&&(prv!='I')&&(prv!='O')&&(prv!='U'))
              wd=wd+prv;
              else
              n=(int)ch+1;
              wd=wd+(char)n;
              //wd=wd+next;
            }
            else
            wd=wd+ch;               //for adding vowel as it is ifch== a,e,i,o,u
        }
        else
        wd=wd+ch;                  //for ading space if ch==' '
        System.out.print(wd);
        wd="";
        }}}                                
              
               