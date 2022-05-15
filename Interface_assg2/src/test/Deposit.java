package test;
public class Deposit implements Transactions
{
	public void process(int amt)
	{
		System.out.println("Amount Deposited :"+amt);
		b.bal=b.bal+amt;
		b.getBalance();
		System.out.println("Transactions Completed");
	}

}
