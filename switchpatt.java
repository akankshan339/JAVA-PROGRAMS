// menu driven prgm printing pattern
//pattern 1                  pattern 2
//ABCDE                      B
//ABCD                       LL
//ABC                        UUU
//AB                         EEEE
//A                          JJJJJ                                  
import java.io.*;
public class switchpatt
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String st;
        int i,l,j,n,ch;
        System.out.println("Enter 1 for PATTERN 1 and 2 for PATTERN 2\n");
        ch=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
                System.out.println("Enter the string:\n");
                 st=in.readLine();
                l=st.length();
                for(i=l-1;i>=0;i--)
                {
                    for(j=0;j<i;j++)
                    {
                        System.out.print(st.charAt(j));
                }
                 System.out.println();
                }
                break;
                case 2:
                     System.out.println("Enter the string:\n");
                 st=in.readLine();
                l=st.length();
                for(i=0;i<l;i++)
                {
                    for(j=0;j<=i;j++)
                    {
                        System.out.print(st.charAt(i));
                }
                 System.out.println();
                }
                break;
                default:
                    System.out.println("wrong choice");
                }
            }
        }
                    
        
       