class a{
public void display()
{
    System.out.println("A's display method");
}}
class b extends a{
public void display()
{
    System.out.println("B's display method");
}}
public class inheri1
{
public static void main(String args[])
{
    a ob=new b(); //same output  or
   // b ob=new b();
    ob.display();
   // ((b) ob).display();//same output or
   ((a) ob).display();
}
}