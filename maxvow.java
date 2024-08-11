import java.io.*;
public class maxvow
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st,vow="",wd="";
        char ch,chr;
        int i,l,j,len,max=0,v=0;
        System.out.println("Enter the string :");
        st=in.readLine();
        st=st+" ";
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            {
               wd=wd+ch;
            }
            else
            {
                len=wd.length();
            for(j=0;j<len;j++)
             {
                    chr=wd.charAt(j);
                     if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
                v++;
            }
                if(v>max)
                {
                max=v;
                vow=wd;
                }
            wd="";
            v=0;
        }
            }
             System.out.println("word with maximum no of vowels :"+vow);
            System.out.println("maximum no of vowels :"+max);
            }
        }
             
            