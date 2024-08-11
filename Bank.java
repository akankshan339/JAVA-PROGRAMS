import java.util.*;
public class Bank {
    String DepositerName, accType;
    long accNo;
    float balAmt,drawAmt,depoAmt;
    Bank()
{
    DepositerName="";
    accType="";
    accNo=0;
    balAmt=0.0F;
}
public void assignVal(String DepositerName,long accNo,float balAmt)
{
this.DepositerName=DepositerName;
this.accType=accType;
this.accNo=accNo;
this.balAmt=balAmt;
}

public void deposit(float depoAmt)
{
    if (depoAmt > 0) {
        balAmt=balAmt +depoAmt;
        System.out.println(depoAmt + " deposited successfully.");
    } else {
        System.out.println("Invalid amount. Deposit failed.");
    }
}

public void withdraw(float drawAmt)
{
if(balAmt > drawAmt)    {
    balAmt=balAmt -drawAmt;
    System.out.println("Amount widhdrawan successfully !!!");
}
else
    System.out.println("Balance Amount is low to be withdraw!!!");
}

public void display()
{
    System.out.println("Name of Depositer "+DepositerName);
    System.out.println("Type of Account is "+ accType);
    System.out.println("Account Number "+accNo);
    System.out.println("Balance Account "+balAmt);
}
    public static void main(String[] args) {
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        Scanner sc = new Scanner(System.in);
        Bank ob =new Bank();
        System.out.println("Enter name of depositor:");
        String depositorName = sc.nextLine();

        System.out.println("Enter account type:");
        String accType = sc.nextLine();

        System.out.println("Enter account number:");
        long accNo = sc.nextLong();

        System.out.println("Enter initial balance:");
        float balAmt = sc.nextFloat();

        ob.assignVal(depositorName, accNo, balAmt);

        System.out.println("Enter the amount to be deposited");
        float depoAmt=sc.nextFloat();
        ob.deposit(depoAmt);

        System.out.println("Enter the amount to be withdraw");
        float drawAmt=sc.nextFloat();
        ob.withdraw(drawAmt);

        ob.display();
        sc.close();
        
    }
}
