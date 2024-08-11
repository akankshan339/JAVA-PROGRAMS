//e.g=37192  i.e f=3 l=2 mid 719 i.e l+mid+f after swap=27193 
import java.io.*;
public class swapdigit
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,d,temp,l,f,mid=0,rev=0,swapno;
        System.out.println("enter the no :");
        n=Integer.parseInt(in.readLine());
        temp=n;
        l=n%10; //extracting last digit
        while(n>10)
        {
            n=n/10; //extracting the first digit
        }
        f=n;
       // n=temp; again assign temp no to n but for mid digits but we don't need last digit therefore
       n=temp/10; //this removes the last digit i.e 2 extarct only starting digits 3719
       //for extracting mid digits
       while(n>=10) //this will not  extact 1st digit bcz n is >=10
       {
           d=n%10;
           rev=rev*10+d; //this contains mid digits but in reverse form i.e 917 therfore again reverse it
           n=n/10;
       }
       mid=l;
       while(rev!=0)
       {
           d=rev%10;
           mid=mid*10+d;
           rev=rev/10;
       }
     //  swapno=l+mid+f; we cannot concat like this bcz they are nos not string
     swapno=mid*10+f;
       System.out.println(" no after swaping first and last digit is ="+swapno);
       }
}