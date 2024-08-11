class inheri2{
    int a=400,b=200;
}

class child1 extends inheri2{
int a=1000,b=2000;
void add(int a,int b)
{
    System.out.println(a+this.b-super.a);
}

public static void main(String args[])
{
    child1 ob=new child1();
    ob.add(100,300);
}
}