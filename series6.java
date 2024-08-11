public class series6
{
    public static void main(String args[])
    {
        int term=1,i,sum=0,s=1;
       
        for(i=0;i<6;i++)
        {
       sum=sum+term;
       s=s+sum;
       term++;
    }
     System.out.println(sum);
}
}