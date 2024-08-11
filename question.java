public class question extends Thread {
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i++);
        }
    }
    public static void main(String[] args) {
       question t1=new question ();
       t1.run();
    }
}
