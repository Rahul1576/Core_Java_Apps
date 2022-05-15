package test;

public class WithDraw implements Transactions
{
	public void process(int amt)
	{
		if(amt<=b.bal)
		{
			System.out.println("Amt Withdraw :"+amt);
			b.bal=b.bal-amt;
			b.getBalance();
			System.out.println("Transactions Completed");
		}
		else {
			System.out.println("Insufficient fund");
		}
	}

}
