import java.util.*;
class overload
{
        static double show(double n)
        {
            double result=0;
            for(double i=1;i<=n;i++)
            {
         result=result+((i*i)/(4*i));
        }
        return result;
        }
        static double show(double a,double n)
        {
            double sum=0;
            for(double i=1;i<=n;i++)
            {
                sum=sum=((2*i)/(10*i));
            }
            return sum;
            
        }
        void main()
    {
        double a,b;
        a=show(5);
        b=show(5,2);
    }
}
