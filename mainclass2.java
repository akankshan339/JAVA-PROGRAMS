class x
{
    static
    {
        y.display();
    }
}
class y extends x
{
    static void display()
    {
         System.out.println("java");
    }
}

public class mainclass2
{
    public static void main(String args[])
    {
    y.display();
}
}