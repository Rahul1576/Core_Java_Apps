package test2;
import java.util.*;
import test1.Deposit;
import test1.Withdraw;

public class Bankmainclass {

	public static void main(String[] args) 
	{
		double balance=50000;
		Scanner s=new Scanner(System.in);
       System.out.println("enter the pin num");
       int pin=s.nextInt();
       if(pin==111||pin==222||pin==333)
       {
           System.out.println("enter choice");
           System.out.println("1.Withdraw\n2.Deposit");
           int choice=s.nextInt();
           switch(choice)
           {
           case 1:
               System.out.println("enter the pin amount"); 
               int a1=s.nextInt();
               if(a1>0&&a1%100==0)
               {
            	   Withdraw wd=new Withdraw(a1,balance);
            	   //wd.wdraw();
               }
               else
               {
                   System.out.println("invalid amount");

               }
               break;
           case 2:
               System.out.println("enter the amount=");
               int a2=s.nextInt();
               if(a2>0&&a2%100==0)
               {
            	   Deposit dp=new Deposit(a2,balance);
            	   //dp.deposit();
               }
               else
               {
                   System.out.println("invalid amount");
  
               }
               break;
               default:
                   System.out.println("invalid choice");


           }


       }
       else
       {
           System.out.println("Invalid pin");

       }
	}

}
