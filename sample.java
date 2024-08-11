import java.util.*;
public class sample
{
    void product()
    {
        Scanner in=new Scanner(System.in);
        int pc;
        double up,quant,np;
        System.out.println("Enter unit price and quantity");
        up=in.nextDouble();
        quant=in.nextDouble();
        double tc=up*quant;
        double dis=12/100.0*tc;
        np=tc-dis;
        System.out.println("Total cost="+np);
    }
    public static void main(String args[])
    {
        sample ob=new sample();
        ob.product();
    }
}