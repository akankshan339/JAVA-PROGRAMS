class question{
   static int x;
   static{
       x++;
   }
   {
       ++x;
   }
}
class question1 extends question{
    static{
       --x;
   }
   {
       x--;
   }

}
public class check2{
    public static void main(String args[])
    {
    
       System.out.println(new question1().x);
    }
    
}