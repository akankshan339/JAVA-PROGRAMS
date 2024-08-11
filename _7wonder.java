//initialize 7 wonde0f world along with their locations in 2 diff arrays search for a name country input by user .
//If found diplay country along with its wonder else display"Sorry Not Found!"
//Input 7 wonders :Chichen Itza,Christ Redeemer,Taj Mahal, Great wall China,Macchu picchu,Petra,Colosseum
//Location :Mexico,Brazil,India,China,Peru,Jordan,Italy
//eg:input :country name India
//Output :Taj Mahal
import java.io.*;
public class _7wonder
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String won[]=new String[7];
        String loc[]=new String[7];
        String countryname;
        int i,t=0,a=0;
        for(i=0;i<7;i++)
        {
        System.out.println("Enter the seven wonders and their location :\n");
        won[i]=in.readLine();
        loc[i]=in.readLine();
    }
      System.out.println("Enter the country name whose corresponding wonder to be searched:\n");
         countryname=in.readLine();
        for(i=0;i<7;i++)
        {
            if(loc[i].equals(countryname))
            {
            t=1;
            //a=i;
            break;
        }}
        if(t==1)
         System.out.println("country name found is  "+loc[i]+" wonder is "+won[i]);
         else
          System.out.println("country name not found");
        }}
        