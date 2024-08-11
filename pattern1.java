//       B L U E J
//         B L U E
//           B L U
//             B L
//               B
import java.io.*;
public class pattern1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        int i,l,j,k;
        System.out.println("Enter the string :\n");
        st=in.readLine();
        l=st.length();
        for(i=l-1;i>=0;i--)
        {
            for(j=0;j<(l-i);j++)
            {
              System.out.print(" ");  
            }
            for(k=0;k<i;k++)
            {
              System.out.print(st.charAt(k));  
            }  
            System.out.println();
        }
    }}
            