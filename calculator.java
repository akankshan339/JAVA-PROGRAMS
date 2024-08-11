import java.util.*;
public class calculator
{
    void sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum="+sum);
    }
    void subtract(int a,int b)
    {
        int sub=a-b;
        System.out.println("Subtract="+sub);
    }
    void product(int a,int b)
    {
        int pro=a*b;
        System.out.println("Product="+pro);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,ch;
        System.out.println("Enter 2 num");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("enter 1 to add,2 to sub,3 to product");
        ch=in.nextInt();  
        calculator ob=new calculator();
        switch(ch)
        {
            
        case 1:
        ob.sum(a,b);
        break;
        case 2:
        ob.subtract(a,b);
        break;
        case 3:
        ob.product(a,b);
    }
    }
}