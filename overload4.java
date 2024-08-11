import java.util.*;
public class overload4
{
    void shape(int m,int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
        {
            System.out.print("X");
        }
        System.out.println();
    }
}
    void shape(int s,char ch)
    {
    
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(ch+"");
            }
            System.out.println();       
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch;
        int s,m,n;
        System.out.println("Enter no of rows and columns and character");
        ch=in.next().charAt(0);
        s=in.nextInt();
        m=in.nextInt();
        n=in.nextInt();
        overload4 ob=new overload4();
        ob.shape(m,n);
       ob.shape(s,ch);
        //shape(m,n);
        //shape(s,ch);
    }
}