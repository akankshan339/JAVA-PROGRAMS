import java.util.*;
public class merit
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st[]=new String[10];
        int ar[]=new int[10];
        int i,j,temp;
        String tempn;
        System.out.println("Enter names");
        for(i=0;i<10;i++)
        {
            st[i]=in.nextLine();
        }
        System.out.println("Enter marks");
        for(i=0;i<10;i++)
        {
            ar[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(ar[j]>ar[i])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                    tempn=st[i];
                    st[i]=st[j];
                    st[j]=tempn;
                }
            }
        }
        System.out.println("name="+"\t\t"+"marks");
        for(i=0;i<10;i++)
        {
            System.out.println(st[i]+"\t\t"+ar[i]);
        }
    }
}