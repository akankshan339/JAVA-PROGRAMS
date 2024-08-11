//menu driven progm case F print "first" alphabet of words from string and case L print "last" alphabet of words from string
// Sample input: HONESTY IS THE BEST POLICY
//case F                case 2
//H                     Y
//I                     S
//T                     E
//B                     T
//P                     Y
import java.io.*;
public class switchFL
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String st;
        int i,l;
        char ch,ch1,ch2;
        System.out.println("Enter the string in upper case:\n");
        st=in.readLine();
        System.out.println("Enter F for printing first letters and L for printing last letters\n");
        System.out.println("Enter your choice\n");
        ch=(char)(in.read());
        switch(ch)
        {
            case 'F':
                 st=" "+st;
                l=st.length();
                for(i=0;i<l;i++)
                {
                    ch1=st.charAt(i);
                    if(ch1==' ')
                    System.out.println(st.charAt(i+1));
                }
                break;
                case 'L':
                     System.out.println("Enter the string in upper case:\n");
                 st=in.readLine();
                 st=st+" ";
                l=st.length();
                for(i=0;i<l;i++)
                {
                    ch2=st.charAt(i);
                    if(ch2==' ')
                 System.out.println(st.charAt(i-1));
                }
                break;
                default:
                    System.out.println("wrong choice");
                }
            }
        }
                    
        
                   