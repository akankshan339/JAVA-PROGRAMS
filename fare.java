import java.util.*;
public class fare
{
    int dis;
    double bill;
    fare()
    {
       dis=0; 
    }
    fare(int d)
    {
        dis=d;
    }
    void calculate()
    {
        if(dis<=10)
        bill=5*dis;
        else if(dis>10&&dis<=30)
        bill=5*dis+(dis-10)*7.5;
        else if(dis>30&&dis<=40)
        bill=5*dis+(dis-10)*7.5+(dis-30)*10;
        else
        bill=5*dis+(dis-10)*7.5+(dis-30)*10+(dis-40)*15;
    }
    void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=in.nextInt();
        fare ob=new fare();
        fare ob1=new fare(n);
        ob.calculate();
    }
}