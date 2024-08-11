import java.io.*;
public class vowel
{
   public static void main(String args[])throws IOException
   {
      // int a,b,sum=0;
       char ch;
      InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("enter yr choice\n");
       //ch=Chracter.parseChar(in.readLine());
      ch=(char)(in.read());
      //b=Integer.parseInt(in.readLine());
      switch(ch)
      {
          case'a':
          System.out.println("vowel");
          break;
          case'e':
          System.out.println("vowel");
          break;
          case'i':
          System.out.println("vowel");
          break;
          case'o':
          System.out.println("vowel");
          break;
          case'u':
          System.out.println("vowel");
          break;
          default:
              System.out.println("consonants");
            }}
          
          
      }