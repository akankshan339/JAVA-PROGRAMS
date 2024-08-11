import java.util.*;
public class perarea
{
    static int area(int l,int b)
    {
        int area;
        area=l*b;
        return area;
    }
    static int perimeter(int l,int b)
    {
        int per;
        per=2*(l+b);
        return per;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int len,bre;
        System.out.println("Enter length and breadth");
        len=in.nextInt();
        bre=in.nextInt();
        int ar=area(len,bre);
        int peri=perimeter(len,bre);
        System.out.println("area="+ar);
        System.out.println("Perimeter="+peri);
    }
}