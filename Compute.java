import java.util.*;
public class Compute {
    public static void main(String[] args) {
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        Scanner sc=new Scanner(System.in);
        int tot,a=0,b=0,c=0,d=0;
        System.out.println("Enter the total no student:");
        tot=sc.nextInt();
        int marks[]=new int[tot];
        System.out.println("Enter the marks of student in Range from 0 to 100:");
        for(int i=0;i<tot;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<tot;i++)
        {
            if(marks[i] >80 && marks[i] <=100)
                a++;
            else if(marks[i] >60 && marks[i] <=80)
                b++;
            else if(marks[i] >40 && marks[i] <=60)
                c++;
            else if( marks[i] <=40)
                d++;
        }
        System.out.println("Number of students with marks from 81 to 100 are: "+a);
        System.out.println("Number of students with marks from 61 to 80 are: "+b);
        System.out.println("Number of students with marks from 41 to 60 are: "+c);
        System.out.println("Number of students with marks less than equal to 40 are: "+d);
        sc.close();
    }
}
