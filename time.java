import java.util.*;
public class time
{
  static void time(int t)
  {
      int h,hr,min,sec;
      h=t%3600;
      hr=t/3600;
      min=hr%3600;
      sec=hr/3600;
      System.out.println("Hours="+h);
      System.out.println("minutes="+min);
      System.out.println("Seconds="+sec);
  }
  public static void main(String args[])
  {
      Scanner in=new Scanner(System.in);
      int ti;
      System.out.println("Enter time in seconds");
      ti=in.nextInt();
      time(ti);
  }
}
    
