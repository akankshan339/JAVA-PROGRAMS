////initialize 10 states and their capital in 2 diff arrays search for the state .If found diplay  its capital  else display"Sorry Not Found!"
//Input UK,UP,,west bengal,Bihar,Punjab...
//Location :Dehradun,Lucknow,Kolkata,Patna,Chandigarh
//eg:input :UK
//Output :Dehradun
import java.io.*;
public class capital
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String sta[]=new String[7];
        String cap[]=new String[7];
        String state;
        int i,t=0,a=0;
        System.out.println("Enter the state and capitals :\n");
        for(i=0;i<5;i++)
        {
        //System.out.println("Enter the state and capitals :\n");
        sta[i]=in.readLine();
        cap[i]=in.readLine();
    }
      System.out.println("Enter the state to be searched:\n");
         state=in.readLine();
        for(i=0;i<5;i++)
        {
            if(sta[i].equals(state))
            {
            t=1;
            //a=i;
            break;
        }}
        if(t==1)
         System.out.println("state name found is  "+sta[i]+" and capital is "+cap[i]);
         else
          System.out.println("state name not found");
        }}
        