  import java.io.*;
public class rep
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
               
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               wd=wd+ch;
               if(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')
               {
               chr=(char)(((int)ch)-1);
            }
              else
              chr=(char)(((int)ch)+1);
              
              wd=wd+chr;
            
              if(ch==' ')
            wd=wd+' ';
        }
            System.out.println(wd);
        }}
               