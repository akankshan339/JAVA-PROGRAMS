import java.util.*;
public class charcter
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      System.out.println("Enter a charcter");
char n=in.next().charAt(0);
    if(n>='a'&&n<='z')
    System.out.println("small");
    else if(n>='A'&&n<='Z')
    System.out.println("Capital");
    else
    System.out.println("other");
    }
}