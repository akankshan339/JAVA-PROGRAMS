//sum=1+(1+2)+(1+2+3)+........+(1+2+3+........+n)
//sum=1+(1*2)+(1*2*3)+........+(1*2*3*........*n)
//sum=1+ (1+2)/(1*2)+ (1+2+3)/(1*2*3)+ .................+(1+2+3+.......+n)/(1*2*3*......*n)
public class series8
{
    public static void main(String args[])
    {
        int term=1,i,sum=0,s=0;
       
        for(i=1;i<=3;i++)
        {
       s=s+i;
       sum=sum+s;
    }
     System.out.println(sum);
     
     s=1;sum=0;
     for(i=1;i<=3;i++)
        {
       s=s*i;
       sum=sum+s;
    }
     System.out.println(sum);
     
    float sum1=0, s1=0,s2=1,t1=1,t2=1;
     for(i=1;i<=3;i++)
        {
       s1=s1+i;
       t1=t1+s1;
       
       s2=s2*i;
       t2=t2+s2;
       sum1=sum1+(t1/t2);
       
    }
     System.out.println(sum1);
}
}