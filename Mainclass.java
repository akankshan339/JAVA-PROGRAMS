interface x
{
    void display();
}
class y implements x
{
   public void display()
    {
        System.out.println("java");
    }
}
public class Mainclass
{
    public static void main(String args[])
    {
    y ob=new y();
    ob.display();
}
}