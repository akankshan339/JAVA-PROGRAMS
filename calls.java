import java.util.*;
public class calls
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c;
        double r;
        System.out.println("Enter no of calls");
        c=in.nextInt();
        if(c<=100)
        r=300;
        else if(c>100&&c<=200)
        r=300*100+(c-100)*1;
        else if(c>200&&c<=300)
        r=300*100+(c-100)*1+(c-200)*2;
        else
        r=300*100+(c-100)*1+(c-200)*2+(c-300)*3;
        System.out.println(c);
        System.out.println("Bills ="+r);
    }
}
