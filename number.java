import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int n;
        System.out.println("Enter a no");
        n=in.nextInt();
    if(n>=0&&n<=9)
    System.out.println("Single");
    else if(n>=10&&n<=99)
    System.out.println("Double");
    else
    System.out.println("Bigger");
    }
}