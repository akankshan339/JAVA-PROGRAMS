class question{
    int i;
    public question(int i)
    {
        this.i=i--;
    }
}
class question1 extends question{
    public question1(int i)
    {
        super(++i);
        System.out.println(i);
    }
}
public class check1{
    public static void main(String args[])
    {
        question1 n=new question1(20);
    }
}