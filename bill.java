import java.util.*;
public class bill
{
    void bill(int unit)
    {int r;
        if(unit<=100)
        r=5*unit;
        else if(unit>100&&unit<=250)
        r=5*unit+(unit-100)*8;
        else
        r=5*unit+(unit-100)*8+(unit-250)*10;
        System.out.println("Rupees="+r);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int u;
        System.out.println("enter your units");
        u=in.nextInt();
        bill ob=new bill();
       ob.bill(u);
    }
}