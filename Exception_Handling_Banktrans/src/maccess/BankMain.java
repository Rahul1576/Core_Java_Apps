package maccess;
import test.*;
import java.util.*;
public class BankMain 
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
        System.out.println("Enter Pin No.");
        int pin=s.nextInt();
        //boolean k=new checkPin().verify(pin);
        if(k)
        {
        	 System.out.println("==choice===");
        	 System.out.println("1. Withdraw\t2. Deposit");
        	 System.out.println("Enter choice");
            int choice=s.nextInt();
            switch(choice)
            {
            case 1:
             System.out.println("Enter the amount to Withdraw");
             int a1=s.nextInt();
             if(a1>0 && a1%100==0)
             {
            	 Transactions wd=new Transactions() 
            	 {
            	    public void process(int amt)
            		{
            			if(amt<=b.bal)
            			{
            			    System.out.println("Amount To Withdraw : "+amt);
            			    b.bal=b.bal-amt;
            			    b.getBalance();
            			    System.out.println("Transaction Completed");
            			}
            			else
            			{
            				System.out.println("Insufficiant Balance");
            			}
            		}	
             };
             wd.process(a1);
            }
             else
             {
            	    System.out.println("Invalid Amount\nAmount must be in multiple of 100");
             }
             break xyz;
             
            case 2:
                System.out.println("Enter the amount to Deposit");
                int a2=s.nextInt();
                if(a2>0 && a2%100==0)
                {
                	Transactions dp=new Transactions() {
                		public void process(int amt)
                		{
                		 System.out.println("Amount To Deposit : "+amt);
             			    b.bal=b.bal+amt;
             			    b.getBalance();
             			    System.out.println("Transaction Completed");
             			}
                	};
                	dp.process(a2);
                }
             	else
             			{
             				System.out.println("Insufficiant Balance");
             			}
                break xyz;
                
            default:
                	System.out.println("invalid choice");
                	 break xyz;
                		}
                	}
                
                else
                {
            	    System.out.println("Invalid pin");
            	    count++;

                }
                if(count==3)
                {
                	   System.out.println("sorry");
                	   break;
                }	
	}
	s.close();
  }
}