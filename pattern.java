import java.util.*;
public class pattern
{
    int n;
    pattern(int m)
    {
        n=m;
    }
    void pattern1()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    void pattern2()
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
            
         for(int j=1;j<=i;j++)
         {
          System.out.print(k+"");
          k=k+2;
         }
         System.out.println();
        }
    }
    void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a num");
        n=in.nextInt();
        pattern ob=new pattern(n);
       pattern1();
        pattern2();
    }
    
}