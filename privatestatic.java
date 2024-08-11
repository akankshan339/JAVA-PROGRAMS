public class privatestatic{
private static int count=0;
public static void main(String args[])
{
    incrementcount();
    System.out.println("count:"+count);
    }
    private static void incrementcount()
    {
        count++;
    }
}
