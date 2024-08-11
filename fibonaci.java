//0,1,1,2,3,5,8,13..... to enter any position & find the no at that position
import java.util.Scanner;
class fibonaci {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position  :");
        n=sc.nextInt();
        System.out.println(fib(n));
        
    }
    static int fib(int n)
    {
       int i,a=0,b=1,sum=0;
if (n==1)
  return 1;
else
{
for(i=3;i<=n;i++)
{
  sum=a+b;
  a=b;
  b=sum;
  
}
return sum;
}
    }
}
