//sample output :Blue bottle is in Blue bag lying on the Blue carpet
//replace blue by any word e.g. "Red"
//sample output :Red bottle is in Red bag lying on the Red carpet
import java.io.*;
public class replce2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new  BufferedReader(read);
        String st,word,wd,w="",newst="";
        int i,l,len;
        char ch;
        System.out.println("Enter the string :");
        st=in.readLine();
        st=st+" ";
        System.out.println("Enter the word to be replaced :");
        word=in.readLine();
        System.out.println("Enter the word to be inserted :");
        wd=in.readLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
               if(w.equals(word))
               newst=newst+wd+" ";
               else
               newst=newst+w+" ";
               
               w="";
               }
            }
             System.out.println("new modified string :"+newst);
            }
}