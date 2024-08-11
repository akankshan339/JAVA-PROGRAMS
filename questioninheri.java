class questioninheri{
static int a =10;
}
class question1 extends questioninheri
{

    static int  a=20;
}
class inheri2 extends question1
{
public static void main(String args[])
{
    a=100;
    System.out.println(questioninheri.a);
    System.out.println(question1.a);
}
}