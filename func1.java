//reverse a sstring using function 
import java.io.*;
public class func1
{
    String st,rstr="";
    
    void accept()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence : ");
       st=in.readLine();
    }
    void change()
  {
     int len=st.length();
   // String rstr="";
     for(int i=0;i<len;i++)
     {
         char ch=st.charAt(i);
         //if(ch!=' ')
         rstr=ch+rstr;
        
     }
    }
    void show()
    {
        System.out.println(st);
        System.out.println(rstr);
        
    }
    public static void main(String[] args)throws IOException
    {
       // InputStreamReader read=new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
       func1 ob=new func1();
       ob.accept();
       ob.change();
       ob.show();
    }
}