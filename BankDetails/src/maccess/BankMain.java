package maccess;
import test.*;
import java.util.*;
public class BankMain 
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		int balance= 5000;
        System.out.println("Enter Pin No.");
        String pin=s.nextLine();
        Validpin vp=new Validpin();
        boolean k=vp.verify(pin);
        if(k)
        {
            System.out.println("1. Withdraw\t2. Deposit");
            int choice=s.nextInt();
            switch(choice)
            {
            case 1:
             System.out.println("Enter the amount to Withdraw");
             int aw=s.nextInt();
             if(aw>0 &&aw%100==0)
             {
            	 Wdraw wd=new Wdraw();
            	 wd.wdraw(aw,balance);
             }
             else
             {
            	    System.out.println("Invalid Amount\nAmount must be in multiple of 100");
             }
             break;
             
            case 2:
                System.out.println("Enter the amount to Deposit");
                int ad=s.nextInt();
                if(ad>0 && ad%100==0)
                {
                	Deposit dp=new Deposit();
                	dp.deposit(ad,balance);
                }
                else
                {
            	    System.out.println("Invalid Amount\nAmount must be in multiple of 100");

                }
                break;
                
            default:
                System.out.println("Invalid Choice");
            	
            }
        	

        }
        else
        {
            System.out.println("Invalid Pin");

        }
	
	}

}
