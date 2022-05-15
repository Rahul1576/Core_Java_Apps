package test;
public class Wdraw 
{
	public void wdraw(int a,int b)
	{
		if(a<=b)
		{
		    System.out.println("Amount To Withdraw : "+a);
		    System.out.println("Balance Amount: "+(b-a));
		    System.out.println("Transaction Completed");
		}
		else
		{
			System.out.println("Insufficiant Balance");
		}
	}

}
