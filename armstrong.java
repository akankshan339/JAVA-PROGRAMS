import java.util.*;
public class armstrong
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in); 
      int ch;
      System.out.println("Enter 1 for armstrong and 2for sum");
      ch=in.nextInt();
      switch(ch)
      {
          case 1:
              int n,d,c,s=0,num,cb=0;
              System.out.println("Enter a number");
              n=in.nextInt();
              num=n;
              while(n!=0)
              {
                  d=n%10;
                  c=d*d*d;
                  s=s+c;
                  n=n/10;
                }
              if(s==num)
              System.out.println("Armstrong number");
              else
              System.out.println("Not a armstrong no");
              break;
              case 2:
                  int n1,n2,c1=0,s1,sum=0,d1=0,d2;
                  System.out.println("Enter a no");
                  n1=in.nextInt();
                  n2=n1;
                  while(n1!=0)
                  {
                      d1=n1%10;
                      n1=n1%10;
                      c1++;
                  }
                  d2=d1;
                  s1=d1%(int)Math.pow(10,c1);
                  sum=s1+d2;
                  System.out.println(sum);
                }
      }
    }