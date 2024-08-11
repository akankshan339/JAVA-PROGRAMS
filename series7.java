//sum=2-4+6-8+.........to n
public class series7
{
    public static void main(String args[])
    {
        int term=1,i,sum=0,sign=1;
       
        for(i=2;i<10;i=i+2)
        {
       sum=sum+i*sign;
       sign=-sign;
    }
     System.out.println(sum);
}
}