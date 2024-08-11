import java.util.*;
public class example
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 for shop and 2 for luck");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("WELCOME");
                System.out.println("ENTER WHAT YOU WANT");
                System.out.println("enter 1 to purchase and 2 to look only");
                int c=in.nextInt();
                if(c==1)
                {
                System.out.println("Ist floor is having kids wear");
                
                System.out.println("IInd floor contains girls wear");
                System.out.println("IIIrd floor contains boys wear");
                System.out.println("THANKS");
            }
                else
                System.out.println("GET OUT!!!");
                break;
                case 2:
                    System.out.println("YoUr LuCk StArTs NoW");
                System.out.println("ENTER any numfrom 1 to 4");
                int s=in.nextInt();
                if(s==1)
                System.out.println("YOU ARE NICE");
                else if(s==2)
                System.out.println("you are idiot");
                else if(s==3)
                System.out.println("YOU ARE WELCOMED");
                else 
                System.out.println("YOU ARE IDIOT,JUST LEAVE OUT");
                
                
        }
    }
}