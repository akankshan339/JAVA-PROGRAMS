import java.util.*;
public class Floyd {
    public static void main(String args[])
    {
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        Scanner sc=new Scanner(System.in);
        int n,no=1;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(no +" ");
                no++;
            }
            System.out.println();
        }
        sc.close();
    }   
}


