import java.util.*;
public class swapping 
{
    void swap(int a,int b)
    {
        a=a+b;b=a-b;
        a=a-b;
        System.out.println("After swapping num="+a+","+b);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 nums");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Before swapping num="+a+","+b);
        swapping ob=new swapping();
        ob.swap(a,b);
    }
}