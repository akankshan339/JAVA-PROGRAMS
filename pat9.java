/*
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
*/
public class pat9
{
    public static void main(String args[])
    {
        int i,j,v=1;
        for(i=0;i<5;i++)
        {
           for(j=0;j<=i;j++)
        {
            if(j==0||i==0)
            v=1;
            else
            v=v*(i-j+1)/j;
            System.out.print(" "+v);
         
        } 
        System.out.println();
        }
    }
}