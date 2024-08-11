import java.io.*;
public class binserch
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,c=0,lb=0,ub=9,n,mid=0;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the array elements: \n");
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the element to be searched: \n");
            n=Integer.parseInt(in.readLine());
            while(lb<=ub)
            {
                mid=(lb+ub)/2;
                if(arr[mid]==n)
                {
                    c=1;
                    break;
                }
                if(arr[mid]<n)
                ub=mid-1;
                if(arr[mid]>n)
                lb=mid+1;
            }
                if(c==1)
                System.out.println("Search successful number is present:");
                else
                System.out.println("Search unsuccessful number is not present:");
            }}
                
                
                
                
            
    


