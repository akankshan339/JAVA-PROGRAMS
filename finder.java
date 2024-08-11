import java.util.*;
class finder
{
    int findMax(int n1,int n2)
    {
        int s=Math.max(n1,n2);
        if(s>0)
        return s;
        else 
        return 0;
    }
    int findMax(int n1,int n2,int n3)
    {
        int s=Math.max(n1,n2);
        s=Math.max(s,n3);
        if(s>0)
        return s;
        else 
        return 0;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 num");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        finder obj=new finder();
       int n= obj.findMax(a,b);
        int m=obj.findMax(a,b,c);
        System.out.println("Ist="+n);    
         System.out.println("IIst="+m);    
    }
}